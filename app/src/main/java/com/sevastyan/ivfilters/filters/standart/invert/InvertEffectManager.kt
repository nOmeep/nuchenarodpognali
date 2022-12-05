package com.sevastyan.ivfilters.filters.standart.invert

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

internal class InvertEffectManager(
    imageView: ImageView
) : Effect.EffectManager<Unit?>(
    model = null,
    imageView = imageView
) {
    override fun applyEffect(imageView: ImageView) {
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
