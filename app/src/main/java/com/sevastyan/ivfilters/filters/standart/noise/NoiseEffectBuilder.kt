package com.sevastyan.ivfilters.filters.standart.noise

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

internal class NoiseEffectBuilder(
    imageView: ImageView
) : Effect.EffectBuilder<Unit?>(imageView = imageView) {
    override fun make(): NoiseEffectManager {
        return NoiseEffectManager(imageView)
    }
}
