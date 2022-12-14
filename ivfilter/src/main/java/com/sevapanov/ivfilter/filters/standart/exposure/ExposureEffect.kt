package com.sevapanov.ivfilter.filters.standart.exposure

import android.widget.ImageView
import com.sevapanov.ivfilter.filters.Effect

/**
 * Exposure effect
 */
internal class ExposureEffect :
    Effect<ExposureEffectBuilder> {
    override fun with(imageView: ImageView): ExposureEffectBuilder {
        return ExposureEffectBuilder(imageView)
    }
}

