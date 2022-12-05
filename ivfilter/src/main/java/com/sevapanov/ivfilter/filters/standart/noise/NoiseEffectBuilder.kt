package com.sevapanov.ivfilter.filters.standart.noise

import android.widget.ImageView
import com.sevapanov.ivfilter.filters.Effect

internal class NoiseEffectBuilder(
    imageView: ImageView
) : Effect.EffectBuilder<Unit?>(imageView = imageView) {
    override fun make(): NoiseEffectManager {
        return NoiseEffectManager(imageView)
    }
}
