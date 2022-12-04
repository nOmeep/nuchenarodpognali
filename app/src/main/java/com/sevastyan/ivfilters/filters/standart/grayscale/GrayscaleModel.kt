package com.sevastyan.ivfilters.filters.standart.grayscale

import com.sevastyan.ivfilters.filters.Effect

internal data class GrayscaleModel(
    val r: Float,
    val g: Float,
    val b: Float
) : Effect.EffectModel
