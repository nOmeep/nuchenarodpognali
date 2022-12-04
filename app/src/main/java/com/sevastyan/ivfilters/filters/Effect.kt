package com.sevastyan.ivfilters.filters

import android.widget.ImageView

interface Effect<T : Effect.EffectBuilder> {
    fun with(imageView: ImageView): T

    interface EffectBuilder {
        fun make()
    }
}
