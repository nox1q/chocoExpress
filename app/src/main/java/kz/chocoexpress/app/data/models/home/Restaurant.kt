package kz.chocoexpress.app.data.models.home

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Restaurant(
    val id: Long?,
    val name: String?,
    val address: String?,
    val photoUrl: String?
) : Parcelable
