package com.sevapanov.ivfilter.filters.standart.blur

import android.widget.ImageView
import com.sevapanov.ivfilter.filters.Effect

internal class BlurEffectBuilder(
    imageView: ImageView
) : Effect.EffectBuilder<BlurModel>(imageView = imageView) {
    private var blurRadius = DEFAULT_RADIUS.toFloat()
    private var bitmapScale = DEFAULT_BITMAP_SCALE

    fun setRadius(blurRadius: Int): BlurEffectBuilder {
        this.blurRadius = blurRadius.toFloat()
        return this
    }

    fun setRadius(blurRadius: Float): BlurEffectBuilder {
        this.blurRadius = blurRadius
        return this
    }

    fun setBitmapScale(bitmapScale: Float): BlurEffectBuilder {
        this.bitmapScale = bitmapScale
        return this
    }

    override fun make(): BlurEffectManager {
        val model = BlurModel(
            radius = blurRadius.coerceIn(MIN_RADIUS, MAX_RADIUS),
            scale = bitmapScale.coerceIn(MIN_BITMAP_SCALE, MAX_BIMAP_SCALE)
        )

        return BlurEffectManager(model, imageView)
    }

    companion object {
        private const val MIN_RADIUS = 1f
        private const val MAX_RADIUS = 25f
        private const val MIN_BITMAP_SCALE = 0f
        private const val MAX_BIMAP_SCALE = 1f

        const val DEFAULT_RADIUS = 12
        const val DEFAULT_BITMAP_SCALE = 0.5f
    }
}

