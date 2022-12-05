package com.sevapanov.ivfilter.filters.standart.sepia

import android.widget.ImageView
import com.sevapanov.ivfilter.filters.Effect

/**
 * Sepia colors: https://en.wikipedia.org/wiki/Sepia_(color)
 */
internal class SepiaEffect : Effect<SepiaEffectBuilder> {
    override fun with(imageView: ImageView): SepiaEffectBuilder {
        return SepiaEffectBuilder(imageView)
    }
}
