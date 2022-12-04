package com.sevastyan.kfilters.filters.standart.grayscale

import android.widget.ImageView
import com.sevastyan.kfilters.filters.Effect

class GrayscaleEffectBuilder(
    private val imageView: ImageView
) : Effect.EffectBuilder {
    private var saturation: Float = DEFAULT_SATURATION

    fun setSaturation(saturation: Float): GrayscaleEffectBuilder {
        this.saturation = saturation
        return this
    }

    override fun apply() {
        GrayscaleEffectManager(saturation).applyFilter(imageView)
    }

    companion object {
        private const val DEFAULT_SATURATION = 0f
    }
}
