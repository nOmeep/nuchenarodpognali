package com.sevastyan.ivfilters.filters.standart.flip

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

internal class FlipEffectBuilder(
    imageView: ImageView
) : Effect.ImageViewEffectBuilder(imageView = imageView) {
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

    override fun make() {
        val model = FlipEffectModel(
            flipVertical = flipVertical,
            flipHorizontal = flipHorizontal
        )

        FlipEffectManager(model)
            .executeOn(imageView)
    }

    companion object {
        const val DEFAULT_FLIP_HORIZONTAL = false
        const val DEFAULT_FLIP_VERTICAL = false
    }
}
