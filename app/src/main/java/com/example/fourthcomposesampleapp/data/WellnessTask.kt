package com.example.fourthcomposesampleapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class WellnessTask(val id: Int, val label: String): Parcelable
