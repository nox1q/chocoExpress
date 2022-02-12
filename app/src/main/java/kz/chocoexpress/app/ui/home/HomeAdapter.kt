package kz.chocoexpress.app.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import kz.chocoexpress.app.R
import kz.chocoexpress.app.data.models.home.Restaurant
import kz.chocoexpress.app.databinding.AdapterRestaurantInfoBinding
import kz.chocoexpress.app.ui_common.callbacks.RecyclerViewItemClickCallback

class HomeAdapter(
    var recyclerViewItemClickCallback: RecyclerViewItemClickCallback
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        private const val VIEW_TYPE_PROGRAM = 0
    }

    private val diffCallback = object : DiffUtil.ItemCallback<Restaurant>() {

        override fun areItemsTheSame(oldItem: Restaurant, newItem: Restaurant): Boolean {
            return when {
                oldItem is Restaurant && newItem is Restaurant -> {
                    oldItem.id == newItem.id
                }
                else -> {
                    false
                }
            }
        }

        override fun areContentsTheSame(oldItem: Restaurant, newItem: Restaurant): Boolean {
            return when {
                oldItem is Restaurant && newItem is Restaurant -> {
                    oldItem as Restaurant == newItem as Restaurant
                }
                else -> {
                    false
                }
            }
        }
    }

    private val differ = AsyncListDiffer(this, diffCallback)

    override fun getItemCount(): Int = differ.currentList.size

    fun submitList(list: List<Restaurant>) {
        differ.submitList(list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            VIEW_TYPE_PROGRAM -> {
                val binding: AdapterRestaurantInfoBinding =
                    DataBindingUtil.inflate(
                        inflater,
                        R.layout.adapter_restaurant_info,
                        parent,
                        false
                    )
                ProgramViewHolder(binding)
            }
            else -> {
                throw IllegalStateException("Incorrect ViewType found")
            }
        }
    }

    inner class ProgramViewHolder(var binding: AdapterRestaurantInfoBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun initContent(restaurant: Restaurant) {
            binding.restaurant = restaurant
            binding.recyclerViewItemClickCallback = recyclerViewItemClickCallback
            binding.executePendingBindings()
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            VIEW_TYPE_PROGRAM -> {
                var viewHolder = holder as ProgramViewHolder
                viewHolder.initContent(differ.currentList[position] as Restaurant)
            }
        }
    }

    override fun getItemViewType(position: Int): Int =
        when (differ.currentList[position]) {
            is Restaurant -> VIEW_TYPE_PROGRAM
            else -> throw IllegalStateException("Incorrect ViewType found")
        }
}
