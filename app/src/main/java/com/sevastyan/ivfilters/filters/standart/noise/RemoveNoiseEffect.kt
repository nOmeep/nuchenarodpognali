package com.sevastyan.ivfilters.filters.standart.noise

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

class RemoveNoiseEffect : Effect<RemoveNoiseEffectBuilder> {
    override fun with(imageView: ImageView): RemoveNoiseEffectBuilder {
        return RemoveNoiseEffectBuilder(imageView)
    }
}
