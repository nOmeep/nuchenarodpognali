package com.sevapanov.ivfilter.filters.standart.sepia

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.widget.ImageView
import com.sevapanov.ivfilter.filters.Effect

internal class SepiaEffectManager(
    imageView: ImageView
) : Effect.EffectManager<Unit?>(
    model = null,
    imageView = imageView
) {
    override fun applyEffect(imageView: ImageView) {
        val matrix = ColorMatrix(sepiaMatrix)
        val filter = ColorMatrixColorFilter(matrix)
        imageView.colorFilter = filter
    }

    companion object {
        private val sepiaMatrix = floatArrayOf(
            1f, 0f, 0f, 0f, 0f,
            0f, 1f, 0f, 0f, 0f,
            0f, 0f, 0.85f, 0f, 0f,
            0f, 0f, 0f, 1f, 0f
        )
    }
}
