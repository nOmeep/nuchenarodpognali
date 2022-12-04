package com.sevastyan.ivfilters.filters.standart.exposure

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

internal class ExposureEffect : Effect<ExposureEffectBuilder> {
    override fun with(imageView: ImageView): ExposureEffectBuilder {
        return ExposureEffectBuilder(imageView)
    }
}

