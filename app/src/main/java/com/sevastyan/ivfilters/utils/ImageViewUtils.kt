package com.sevastyan.ivfilters.utils

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.standart.blur.BlurEffect
import com.sevastyan.ivfilters.filters.standart.blur.BlurEffectBuilder.Companion.DEFAULT_BITMAP_SCALE
import com.sevastyan.ivfilters.filters.standart.blur.BlurEffectBuilder.Companion.DEFAULT_RADIUS
import com.sevastyan.ivfilters.filters.standart.grayscale.GrayscaleEffect
import com.sevastyan.ivfilters.filters.standart.grayscale.GrayscaleEffectBuilder.Companion.DEFAULT_SATURATION

object ImageViewUtils {
    fun <T : ImageView> T.grayscale(saturation: Float = DEFAULT_SATURATION) {
        GrayscaleEffect().with(this)
            .setSaturation(saturation)
            .make()
    }

    fun <T : ImageView> T.blur(
        radius: Int = DEFAULT_RADIUS,
        bitmapScale: Float = DEFAULT_BITMAP_SCALE,
    ) {
        BlurEffect().with(this)
            .setRadius(radius)
            .setBitmapScale(bitmapScale)
            .make()
    }
}
