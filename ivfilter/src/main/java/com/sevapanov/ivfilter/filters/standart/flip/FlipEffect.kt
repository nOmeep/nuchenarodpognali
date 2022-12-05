package com.sevapanov.ivfilter.filters.standart.flip

import android.widget.ImageView
import com.sevapanov.ivfilter.filters.Effect


internal class FlipEffect : Effect<FlipEffectBuilder> {
    override fun with(imageView: ImageView): FlipEffectBuilder {
        return FlipEffectBuilder(imageView)
    }
}
