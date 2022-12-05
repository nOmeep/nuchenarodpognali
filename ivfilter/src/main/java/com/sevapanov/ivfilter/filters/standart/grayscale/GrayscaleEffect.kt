package com.sevapanov.ivfilter.filters.standart.grayscale

import android.widget.ImageView
import com.sevapanov.ivfilter.filters.Effect

internal class GrayscaleEffect : Effect<GrayscaleEffectBuilder> {
    override fun with(imageView: ImageView): GrayscaleEffectBuilder {
        return GrayscaleEffectBuilder(imageView)
    }
}
