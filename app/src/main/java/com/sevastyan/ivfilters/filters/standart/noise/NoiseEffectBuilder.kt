package com.sevastyan.ivfilters.filters.standart.noise

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

class NoiseEffectBuilder(
    imageView: ImageView
) : Effect.ImageViewEffectBuilder(imageView = imageView) {
    override fun make() {
        NoiseEffectManager()
            .executeOn(imageView)
    }
}
