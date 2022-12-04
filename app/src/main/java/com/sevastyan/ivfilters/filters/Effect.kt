package com.sevastyan.ivfilters.filters

import android.widget.ImageView

interface Effect<T : Effect.ImageViewEffectBuilder> {
    fun with(imageView: ImageView): T

    abstract class ImageViewEffectBuilder(
        protected val imageView: ImageView
    ) {
        abstract fun make()
    }

    interface EffectModel
}
