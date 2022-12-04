package com.sevastyan.ivfilters.filters.standart.blur

import com.sevastyan.ivfilters.filters.Effect

internal data class BlurModel(
    val radius: Float,
    val scale: Float
) : Effect.EffectModel
