package com.sevastyan.ivfilters.filters.standart.noise

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

class NoiseEffect : Effect<NoiseEffectBuilder> {
    override fun with(imageView: ImageView): NoiseEffectBuilder {
        return NoiseEffectBuilder(imageView)
    }
}
