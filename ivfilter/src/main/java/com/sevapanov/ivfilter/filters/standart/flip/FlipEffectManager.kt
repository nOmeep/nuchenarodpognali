package com.sevapanov.ivfilter.filters.standart.flip

import android.graphics.Bitmap
import android.graphics.Matrix
import android.widget.ImageView
import androidx.core.graphics.drawable.toBitmap
import com.sevapanov.ivfilter.filters.Effect

internal class FlipEffectManager(
    model: FlipEffectModel,
    imageView: ImageView
) : Effect.EffectManager<FlipEffectModel>(
    model = model,
    imageView = imageView
) {
    override fun applyEffect(imageView: ImageView) {
        val flippedBitmap = flipImageBitmap(imageView.drawable.toBitmap())
        imageView.setImageBitmap(flippedBitmap)
    }

    private fun flipImageBitmap(source: Bitmap): Bitmap {
        val matrix = Matrix()

        if (model.flipVertical) {
            matrix.preScale(1.0f, -1.0f)
        }

        if (model.flipHorizontal) {
            matrix.preScale(-1.0f, 1.0f)
        }

        return Bitmap.createBitmap(source, 0, 0, source.width, source.height, matrix, true)
    }
}
