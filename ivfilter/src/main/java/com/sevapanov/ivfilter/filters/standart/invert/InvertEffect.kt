package com.sevapanov.ivfilter.filters.standart.invert

import android.widget.ImageView
import com.sevapanov.ivfilter.filters.Effect

internal class InvertEffect : Effect<InvertEffectBuilder> {
    override fun with(imageView: ImageView): InvertEffectBuilder {
        return InvertEffectBuilder(imageView)
    }
}
