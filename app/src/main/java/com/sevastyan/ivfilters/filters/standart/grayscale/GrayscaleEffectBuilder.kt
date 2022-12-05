package com.sevastyan.ivfilters.filters.standart.grayscale

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

internal class GrayscaleEffectBuilder(
    imageView: ImageView
) : Effect.EffectBuilder<GrayscaleModel>(imageView = imageView) {
    private var saturation: Float = DEFAULT_SATURATION

    fun setSaturation(saturation: Float): GrayscaleEffectBuilder {
        this.saturation = saturation
        return this
    }

    override fun make(): GrayscaleEffectManager {
        val model = GrayscaleModel(
            r = (saturation + 0.33f).coerceIn(0.33f, 1f),
            g = (saturation + 0.59f).coerceIn(0.59f, 1f),
            b = (saturation + 0.11f).coerceIn(0.11f, 1f),
        )

        return GrayscaleEffectManager(model, imageView)
    }

    companion object {
        const val DEFAULT_SATURATION = 0f
    }
}
