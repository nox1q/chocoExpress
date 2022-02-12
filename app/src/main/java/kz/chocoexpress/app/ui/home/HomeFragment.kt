package kz.chocoexpress.app.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kz.chocoexpress.app.R
import kz.chocoexpress.app.databinding.FragmentHomeBinding
import kz.chocoexpress.app.ui_common.base.BaseFragment
import kz.chocoexpress.app.utils.rv.getDividerItemDecoration
import androidx.navigation.fragment.findNavController

class HomeFragment: BaseFragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_home,
            container,
            false
        )
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        binding.recyclerView.addItemDecoration(
            getDividerItemDecoration(
                context = requireContext()
            )
        )
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = getViewModel(HomeViewModel::class.java)

        binding.viewModel = viewModel

        binding.recyclerView.adapter =
            HomeAdapter(viewModel.recyclerViewItemClickCallback)

        initAndObserveViewModel()
    }

    fun initAndObserveViewModel() {
        viewModel = getViewModel(HomeViewModel::class.java)

        viewModel.list.observe(
            viewLifecycleOwner,
            Observer {
                (binding.recyclerView.adapter as HomeAdapter).submitList(it)
            }
        )
    }


}