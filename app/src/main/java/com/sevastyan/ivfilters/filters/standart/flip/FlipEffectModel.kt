package com.sevastyan.ivfilters.filters.standart.flip

import com.sevastyan.ivfilters.filters.Effect

internal data class FlipEffectModel(
    val flipVertical: Boolean,
    val flipHorizontal: Boolean
) : Effect.EffectModel
