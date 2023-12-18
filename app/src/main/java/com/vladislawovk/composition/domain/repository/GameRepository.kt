package com.vladislawovk.composition.domain.repository

import com.vladislawovk.composition.domain.entity.GameSettings
import com.vladislawovk.composition.domain.entity.Level
import com.vladislawovk.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}