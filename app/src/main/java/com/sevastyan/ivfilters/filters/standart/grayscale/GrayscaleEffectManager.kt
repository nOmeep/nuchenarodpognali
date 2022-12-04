package com.sevastyan.ivfilters.filters.standart.grayscale

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.widget.ImageView
import com.sevastyan.ivfilters.filters.EffectManager

internal class GrayscaleEffectManager(
    private val saturation: Float
) : EffectManager() {
    override fun applyEffect(imageView: ImageView) {
        val matrix = ColorMatrix(getGrayscaleMatrix())
        val filter = ColorMatrixColorFilter(matrix)
        imageView.drawable.colorFilter = filter
    }

    private fun getGrayscaleMatrix(): FloatArray {
        val r = (saturation + 0.33f).coerceIn(0.33f, 1f)
        val g = (saturation + 0.59f).coerceIn(0.59f, 1f)
        val b = (saturation + 0.11f).coerceIn(0.11f, 1f)

        return floatArrayOf(
            r, g, b, 0f, 0f,
            r, g, b, 0f, 0f,
            r, g, b, 0f, 0f,
            0f, 0f, 0f, 1f, 0f
        )
    }
}
