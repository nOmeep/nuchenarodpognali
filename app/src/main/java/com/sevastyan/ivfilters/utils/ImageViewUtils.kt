package com.sevastyan.ivfilters.utils

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.standart.blur.BlurEffect
import com.sevastyan.ivfilters.filters.standart.blur.BlurEffectBuilder.Companion.DEFAULT_BITMAP_SCALE
import com.sevastyan.ivfilters.filters.standart.blur.BlurEffectBuilder.Companion.DEFAULT_RADIUS
import com.sevastyan.ivfilters.filters.standart.exposure.ExposureEffect
import com.sevastyan.ivfilters.filters.standart.flip.FlipEffect
import com.sevastyan.ivfilters.filters.standart.flip.FlipEffectBuilder.Companion.DEFAULT_FLIP_HORIZONTAL
import com.sevastyan.ivfilters.filters.standart.flip.FlipEffectBuilder.Companion.DEFAULT_FLIP_VERTICAL
import com.sevastyan.ivfilters.filters.standart.grayscale.GrayscaleEffect
import com.sevastyan.ivfilters.filters.standart.grayscale.GrayscaleEffectBuilder.Companion.DEFAULT_SATURATION
import com.sevastyan.ivfilters.filters.standart.invert.InvertEffect
import com.sevastyan.ivfilters.filters.standart.noise.NoiseEffect
import com.sevastyan.ivfilters.filters.standart.sepia.SepiaEffect

object ImageViewUtils {
    fun <T : ImageView> T.grayscale(saturation: Float = DEFAULT_SATURATION) {
        GrayscaleEffect().with(this)
            .setSaturation(saturation)
            .make()
            .execute()
    }

    fun <T : ImageView> T.flip(
        vertical: Boolean = DEFAULT_FLIP_VERTICAL,
        horizontal: Boolean = DEFAULT_FLIP_HORIZONTAL,
    ) {
        FlipEffect().with(this)
            .setFlipHorizontal(horizontal)
            .setFlipVertical(vertical)
            .make()
            .execute()
    }

    fun <T : ImageView> T.blur(
        radius: Int = DEFAULT_RADIUS,
        bitmapScale: Float = DEFAULT_BITMAP_SCALE,
    ) {
        BlurEffect().with(this)
            .setRadius(radius)
            .setBitmapScale(bitmapScale)
            .make()
            .execute()
    }

    fun <T : ImageView> T.makeNoise() {
        NoiseEffect().with(this)
            .make()
            .execute()
    }

    fun <T : ImageView> T.exposure() {
        ExposureEffect().with(this)
            .make()
            .execute()
    }

    fun <T : ImageView> T.invertColors() {
        InvertEffect().with(this)
            .make()
            .execute()
    }

    fun <T : ImageView> T.sepia() {
        SepiaEffect().with(this)
            .make()
            .execute()
    }
}
