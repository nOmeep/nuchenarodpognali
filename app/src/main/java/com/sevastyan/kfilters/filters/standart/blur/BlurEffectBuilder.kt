package com.sevastyan.kfilters.filters.standart.blur

import android.widget.ImageView
import com.sevastyan.kfilters.filters.Effect
import kotlin.math.absoluteValue

class BlurEffectBuilder(
    private val imageView: ImageView
) : Effect.EffectBuilder {
    private var blurRadius = DEFAULT_RADIUS
    private var bitmapScale = DEFAULT_BITMAP_SCALE
    private var rotateAllowed = DEFAULT_ROTATE_ALLOWED

    fun allowRotate(rotateAllowed: Boolean): BlurEffectBuilder {
        this.rotateAllowed = rotateAllowed
        return this
    }

    fun setRadius(blurRadius: Int): BlurEffectBuilder {
        this.blurRadius = blurRadius
        return this
    }

    fun setBitmapScale(bitmapScale: Float): BlurEffectBuilder {
        this.bitmapScale = bitmapScale
        return this
    }

    override fun apply() {
        val radius = blurRadius.coerceIn(MIN_RADIUS, MAX_RADIUS)

        val scale = if (rotateAllowed) {
            bitmapScale
        } else {
            bitmapScale.absoluteValue
        }

        BlurEffectManager(radius, scale).applyEffect(imageView)
    }

    companion object {
        private const val MIN_RADIUS = 1
        private const val MAX_RADIUS = 25

        private const val DEFAULT_RADIUS = 12
        private const val DEFAULT_BITMAP_SCALE = 0.5f
        private const val DEFAULT_ROTATE_ALLOWED = false
    }
}
