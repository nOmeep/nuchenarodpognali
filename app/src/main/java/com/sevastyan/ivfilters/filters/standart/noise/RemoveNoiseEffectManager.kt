package com.sevastyan.ivfilters.filters.standart.noise

import android.graphics.Bitmap
import android.graphics.Color
import android.widget.ImageView
import androidx.core.graphics.drawable.toBitmap
import com.sevastyan.ivfilters.filters.Effect
import com.sevastyan.ivfilters.filters.EffectManager

class RemoveNoiseEffectManager : EffectManager<Effect.EffectModel?>(model = null) {
    override fun applyEffect(imageView: ImageView) {
        val bitmapWithoutNoise = removeNoise(imageView.drawable.toBitmap())
        imageView.setImageBitmap(bitmapWithoutNoise)
    }

    private fun removeNoise(bitmap: Bitmap): Bitmap {
        for (x in 0 until bitmap.width) {
            for (y in 0 until bitmap.height) {
                val pixel = bitmap.getPixel(x, y)
                val r: Int = Color.red(pixel)
                val g: Int = Color.green(pixel)
                val b: Int = Color.blue(pixel)
                if (r < 162 && g < 162 && b < 162) bitmap.setPixel(x, y, Color.BLACK)
            }
        }
        for (x in 0 until bitmap.width) {
            for (y in 0 until bitmap.height) {
                val pixel = bitmap.getPixel(x, y)
                val r: Int = Color.red(pixel)
                val g: Int = Color.green(pixel)
                val b: Int = Color.blue(pixel)
                if (r > 162 && g > 162 && b > 162) bitmap.setPixel(x, y, Color.WHITE)
            }
        }
        return bitmap
    }
}
