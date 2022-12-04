package com.sevastyan.ivfilters.filters.standart.grayscale

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

internal class GrayscaleEffect : Effect<GrayscaleEffectBuilder> {
    override fun with(imageView: ImageView): GrayscaleEffectBuilder {
        return GrayscaleEffectBuilder(imageView)
    }
}
