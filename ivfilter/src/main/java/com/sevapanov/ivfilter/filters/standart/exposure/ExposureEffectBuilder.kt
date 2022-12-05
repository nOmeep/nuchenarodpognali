package com.sevapanov.ivfilter.filters.standart.exposure

import android.widget.ImageView
import com.sevapanov.ivfilter.filters.Effect

internal class ExposureEffectBuilder(
    imageView: ImageView
) : Effect.EffectBuilder<Unit?>(imageView = imageView) {
    override fun make(): ExposureEffectManager {
        return ExposureEffectManager(imageView)
    }
}
