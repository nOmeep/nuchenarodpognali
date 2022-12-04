package com.sevastyan.kfilters.filters.standart.grayscale

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.widget.ImageView

internal class GrayscaleEffectManager(
    private val saturation: Float
) {
    fun applyFilter(imageView: ImageView) {
        val matrix = ColorMatrix()
        matrix.setSaturation(saturation)
        val filter = ColorMatrixColorFilter(matrix)
        imageView.drawable.colorFilter = filter
    }
}
