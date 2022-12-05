package com.sevapanov.ivfilter.filters.standart.flip

import android.widget.ImageView
import com.sevapanov.ivfilter.filters.Effect

internal class FlipEffectBuilder(
    imageView: ImageView
) : Effect.EffectBuilder<FlipEffectModel>(imageView = imageView) {
    private var flipHorizontal: Boolean = DEFAULT_FLIP_HORIZONTAL
    private var flipVertical: Boolean = DEFAULT_FLIP_VERTICAL

    fun setFlipHorizontal(shouldFlip: Boolean): FlipEffectBuilder {
        this.flipHorizontal = shouldFlip
        return this
    }

    fun setFlipVertical(shouldFlip: Boolean): FlipEffectBuilder {
        this.flipVertical = shouldFlip
        return this
    }

    override fun make(): FlipEffectManager {
        val model = FlipEffectModel(
            flipVertical = flipVertical,
            flipHorizontal = flipHorizontal
        )

        return FlipEffectManager(model, imageView)
    }

    companion object {
        const val DEFAULT_FLIP_HORIZONTAL = false
        const val DEFAULT_FLIP_VERTICAL = false
    }
}
