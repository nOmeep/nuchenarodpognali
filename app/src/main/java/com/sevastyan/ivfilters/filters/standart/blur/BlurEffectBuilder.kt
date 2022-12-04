package com.sevastyan.ivfilters.filters.standart.blur

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

internal class BlurEffectBuilder(
    private val imageView: ImageView
) : Effect.EffectBuilder {
    private var blurRadius = DEFAULT_RADIUS
    private var bitmapScale = DEFAULT_BITMAP_SCALE

    fun setRadius(blurRadius: Int): BlurEffectBuilder {
        this.blurRadius = blurRadius
        return this
    }

    fun setBitmapScale(bitmapScale: Float): BlurEffectBuilder {
        this.bitmapScale = bitmapScale
        return this
    }

    override fun make() {
        val scale = bitmapScale.coerceIn(MIN_BITMAP_SCALE, MAX_BIMAP_SCALE)
        val radius = blurRadius.coerceIn(MIN_RADIUS, MAX_RADIUS)

        BlurEffectManager(radius, scale)
            .executeOn(imageView)
    }

    companion object {
        private const val MIN_RADIUS = 1
        private const val MAX_RADIUS = 25
        private const val MIN_BITMAP_SCALE = 0f
        private const val MAX_BIMAP_SCALE = 1f

        const val DEFAULT_RADIUS = 12
        const val DEFAULT_BITMAP_SCALE = 0.5f
    }
}
