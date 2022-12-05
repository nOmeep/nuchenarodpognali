package com.sevapanov.ivfilter.utils

import android.widget.ImageView
import com.sevapanov.ivfilter.filters.standart.blur.BlurEffect
import com.sevapanov.ivfilter.filters.standart.blur.BlurEffectBuilder.Companion.DEFAULT_BITMAP_SCALE
import com.sevapanov.ivfilter.filters.standart.blur.BlurEffectBuilder.Companion.DEFAULT_RADIUS
import com.sevapanov.ivfilter.filters.standart.exposure.ExposureEffect
import com.sevapanov.ivfilter.filters.standart.flip.FlipEffect
import com.sevapanov.ivfilter.filters.standart.flip.FlipEffectBuilder.Companion.DEFAULT_FLIP_HORIZONTAL
import com.sevapanov.ivfilter.filters.standart.flip.FlipEffectBuilder.Companion.DEFAULT_FLIP_VERTICAL
import com.sevapanov.ivfilter.filters.standart.grayscale.GrayscaleEffect
import com.sevapanov.ivfilter.filters.standart.grayscale.GrayscaleEffectBuilder.Companion.DEFAULT_SATURATION
import com.sevapanov.ivfilter.filters.standart.invert.InvertEffect
import com.sevapanov.ivfilter.filters.standart.noise.NoiseEffect
import com.sevapanov.ivfilter.filters.standart.sepia.SepiaEffect

object ImageViewUtils {
    /**
     * @param saturation value from 0 to 1 used for creating different shades of gray
     *
     * Applies grayscale effect
     */
    fun <T : ImageView> T.grayscale(saturation: Float = DEFAULT_SATURATION) {
        GrayscaleEffect().with(this)
            .setSaturation(saturation)
            .make()
            .execute()
    }

    /**
     * @param vertical if true flips image vertical
     * @param horizontal if true flips image horizontal
     *
     * Rotate image on 180 degrees vertical/horizontal or both
     */
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

    /**
     * Blur image using passed parameters
     */
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

    /**
     * Add noise on image
     */
    fun <T : ImageView> T.makeNoise() {
        NoiseEffect().with(this)
            .make()
            .execute()
    }

    /**
     * Applies exposure filter
     */
    fun <T : ImageView> T.exposure() {
        ExposureEffect().with(this)
            .make()
            .execute()
    }

    /**
     * Makes negative image
     */
    fun <T : ImageView> T.invertColors() {
        InvertEffect().with(this)
            .make()
            .execute()
    }

    /**
     * Applies sepia effect
     */
    fun <T : ImageView> T.sepia() {
        SepiaEffect().with(this)
            .make()
            .execute()
    }
}
