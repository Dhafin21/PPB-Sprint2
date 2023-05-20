package com.example.pertemuanketujuh

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class list_wisatavariabel(
    val namawst : String,
    val alamatwst : String,
    val hargawst : String,
    val jamwst : String,
) : Parcelable