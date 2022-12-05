package com.sevapanov.ivfilter.filters.standart.blur

import android.widget.ImageView
import com.sevapanov.ivfilter.filters.Effect

/**
 * Blur effect: https://en.wikipedia.org/wiki/Gaussian_blur
 */
internal class BlurEffect : Effect<BlurEffectBuilder> {
    override fun with(imageView: ImageView): BlurEffectBuilder {
        return BlurEffectBuilder(imageView)
    }
}
