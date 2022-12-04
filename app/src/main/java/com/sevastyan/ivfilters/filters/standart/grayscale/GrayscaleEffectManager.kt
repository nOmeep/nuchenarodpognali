package com.sevastyan.ivfilters.filters.standart.grayscale

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.widget.ImageView
import com.sevastyan.ivfilters.filters.EffectManager

internal class GrayscaleEffectManager(
    model: GrayscaleModel
) : EffectManager<GrayscaleModel>(model = model) {
    override fun applyEffect(imageView: ImageView) {
        val matrix = ColorMatrix(getGrayscaleMatrix())
        val filter = ColorMatrixColorFilter(matrix)
        imageView.drawable.colorFilter = filter
    }

    private fun getGrayscaleMatrix(): FloatArray {
        return floatArrayOf(
            model.r, model.g, model.b, 0f, 0f,
            model.r, model.g, model.b, 0f, 0f,
            model.r, model.g, model.b, 0f, 0f,
            0f, 0f, 0f, 1f, 0f
        )
    }
}
