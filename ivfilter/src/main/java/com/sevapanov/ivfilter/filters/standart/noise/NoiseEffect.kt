package com.sevapanov.ivfilter.filters.standart.noise

import android.widget.ImageView
import com.sevapanov.ivfilter.filters.Effect

internal class NoiseEffect : Effect<NoiseEffectBuilder> {
    override fun with(imageView: ImageView): NoiseEffectBuilder {
        return NoiseEffectBuilder(imageView)
    }
}
