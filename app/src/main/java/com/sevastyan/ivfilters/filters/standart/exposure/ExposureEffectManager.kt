package com.sevastyan.ivfilters.filters.standart.exposure

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect
import com.sevastyan.ivfilters.filters.EffectManager

internal class ExposureEffectManager : EffectManager<Effect.EffectModel?>(model = null) {
    override fun applyEffect(imageView: ImageView) {
        val matrix = ColorMatrix(exposureMatrix)
        val filter = ColorMatrixColorFilter(matrix)
        imageView.colorFilter = filter
    }

    companion object {
        private val exposureMatrix = floatArrayOf(
            2f, 0f, 0f, 0f, 0f,
            0f, 2f, 0f, 0f, 0f,
            0f, 0f, 2f, 0f, 0f,
            0f, 0f, 0f, 1f, 0f
        )
    }
}
