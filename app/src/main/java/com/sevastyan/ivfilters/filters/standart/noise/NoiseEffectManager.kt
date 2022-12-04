package com.sevastyan.ivfilters.filters.standart.noise

import android.graphics.Bitmap
import android.graphics.Color
import android.widget.ImageView
import androidx.core.graphics.drawable.toBitmap
import com.sevastyan.ivfilters.filters.EffectManager
import kotlin.random.Random

internal class NoiseEffectManager : EffectManager<Unit?>(model = null) {
    override fun applyEffect(imageView: ImageView) {
        val noiseBitmap = applyNoise(imageView.drawable.toBitmap())
        imageView.setImageBitmap(noiseBitmap)
    }

    private fun applyNoise(source: Bitmap): Bitmap {
        val pixels = IntArray(source.width * source.height)
        source.getPixels(pixels, 0, source.width, 0, 0, source.width, source.height)

        for (y in 0 until source.height) {
            for (x in 0 until source.width) {

                val index = y * source.width + x

                val randomColor: Int = Color.rgb(
                    Random.nextInt(255),
                    Random.nextInt(255),
                    Random.nextInt(255)
                )

                pixels[index] = pixels[index] or randomColor
            }
        }

        return Bitmap.createBitmap(source.width, source.height, source.config).apply {
            setPixels(pixels, 0, source.width, 0, 0, source.width, source.height)
        }
    }
}
