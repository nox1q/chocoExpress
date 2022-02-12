package kz.chocoexpress.app.ui.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kz.chocoexpress.app.R
import kz.chocoexpress.app.data.models.home.Restaurant
import kz.chocoexpress.app.data.models.home.Restaurants
import kz.chocoexpress.app.ui_common.callbacks.RecyclerViewItemClickCallback
import kz.chocoexpress.app.utils.live_data.Event
import javax.inject.Inject

class HomeViewModel
@Inject constructor(
    private val app: Application
) : AndroidViewModel(app) {

    private val _list = MutableLiveData<List<Restaurant>>()
    val list: LiveData<List<Restaurant>>
        get() = _list

    init {
        onSuccess()
    }

    fun onSuccess() {
        val temp = Restaurants.getRestaurantList()
        _list.postValue(temp)
    }

    private val _openDetails = MutableLiveData<Event<Restaurant>>()
    val openDetails: LiveData<Event<Restaurant>>
        get() = _openDetails

    val recyclerViewItemClickCallback = object : RecyclerViewItemClickCallback {
        override fun onRecyclerViewItemClick(any: Any) {
            when (any) {
                is Restaurant -> {
                    _openDetails.postValue(Event(any))

                }
            }
        }
    }

}