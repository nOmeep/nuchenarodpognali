package com.sevastyan.ivfilters.filters.standart.flip

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect


internal class FlipEffect : Effect<FlipEffectBuilder> {
    override fun with(imageView: ImageView): FlipEffectBuilder {
        return FlipEffectBuilder(imageView)
    }
}
