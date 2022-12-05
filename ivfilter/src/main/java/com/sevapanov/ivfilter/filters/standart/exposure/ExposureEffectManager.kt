package com.sevapanov.ivfilter.filters.standart.exposure

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.widget.ImageView
import com.sevapanov.ivfilter.filters.Effect

internal class ExposureEffectManager(
    imageView: ImageView
) : Effect.EffectManager<Unit?>(
    model = null,
    imageView = imageView
) {
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
