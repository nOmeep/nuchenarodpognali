package com.sevastyan.ivfilters.filters.standart.invert

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.widget.ImageView
import com.sevastyan.ivfilters.filters.EffectManager

internal class InvertEffectManager(
    imageView: ImageView
) : EffectManager(
    imageView = imageView
) {
    override fun applyEffect() {
        val matrix = ColorMatrix(invertColorsMatrix)
        val filter = ColorMatrixColorFilter(matrix)
        imageView.colorFilter = filter
    }

    companion object {
        private val invertColorsMatrix = floatArrayOf(
            -1f, 0f, 0f, 0f, 255f,
            0f, -1f, 0f, 0f, 255f,
            0f, 0f, -1f, 0f, 255f,
            0f, 0f, 0f, 1f, 0f
        )
    }
}