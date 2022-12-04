package com.sevastyan.ivfilters.filters.standart.sepia

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect
import com.sevastyan.ivfilters.filters.EffectManager

internal class SepiaEffectManager : EffectManager<Effect.EffectModel?>(model = null) {
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
