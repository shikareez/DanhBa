package com.android.danhba

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DanhBa (var avatar: Int, var hoten : String, var sodt : String):Parcelable