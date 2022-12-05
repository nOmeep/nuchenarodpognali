package com.sevastyan.ivfilters.filters.standart.exposure

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

internal class ExposureEffectBuilder(
    imageView: ImageView
) : Effect.EffectBuilder<Unit?>(imageView = imageView) {
    override fun make(): ExposureEffectManager {
        return ExposureEffectManager(imageView)
    }
}
