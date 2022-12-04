package com.sevastyan.ivfilters.filters.standart.grayscale

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.widget.ImageView
import com.sevastyan.ivfilters.filters.EffectManager

internal class GrayscaleEffectManager(
    private val saturation: Float,
    imageView: ImageView
) : EffectManager(
    imageView = imageView
) {
    override fun applyEffect() {
        val matrix = ColorMatrix()
        matrix.setSaturation(saturation)
        val filter = ColorMatrixColorFilter(matrix)
        imageView.drawable.colorFilter = filter
    }
}
