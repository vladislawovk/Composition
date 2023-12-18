package com.vladislawovk.composition.domain.usecases

import com.vladislawovk.composition.domain.entity.GameSettings
import com.vladislawovk.composition.domain.entity.Level
import com.vladislawovk.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}