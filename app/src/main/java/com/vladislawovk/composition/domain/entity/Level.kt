package com.vladislawovk.composition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/** The class that defines the game's difficulty */
@Parcelize
enum class Level : Parcelable {

    TEST, EASY, NORMAL, HARD
}

