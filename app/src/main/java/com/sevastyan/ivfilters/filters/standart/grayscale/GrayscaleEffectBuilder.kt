package com.sevastyan.ivfilters.filters.standart.grayscale

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

internal class GrayscaleEffectBuilder(
    private val imageView: ImageView
) : Effect.EffectBuilder {
    private var saturation: Float = DEFAULT_SATURATION

    fun setSaturation(saturation: Float): GrayscaleEffectBuilder {
        this.saturation = saturation
        return this
    }

    override fun make() {
        GrayscaleEffectManager(saturation, imageView).execute()
    }

    companion object {
        const val DEFAULT_SATURATION = 0f
    }
}
