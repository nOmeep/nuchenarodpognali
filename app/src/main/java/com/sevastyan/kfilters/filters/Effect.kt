package com.sevastyan.kfilters.filters

import android.widget.ImageView

interface Effect<T : Effect.EffectBuilder> {
    fun with(imageView: ImageView): T

    interface EffectBuilder {
        fun apply()
    }
}
