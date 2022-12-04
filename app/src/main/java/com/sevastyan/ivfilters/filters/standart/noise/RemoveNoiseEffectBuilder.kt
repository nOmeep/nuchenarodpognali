package com.sevastyan.ivfilters.filters.standart.noise

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

class RemoveNoiseEffectBuilder(
    imageView: ImageView
) : Effect.ImageViewEffectBuilder(imageView = imageView) {
    override fun make() {
        RemoveNoiseEffectManager()
            .executeOn(imageView)
    }
}
