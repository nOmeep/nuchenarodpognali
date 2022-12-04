package com.sevastyan.ivfilters.filters.standart.invert

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

internal class InvertEffect : Effect<InvertEffectBuilder> {
    override fun with(imageView: ImageView): InvertEffectBuilder {
        return InvertEffectBuilder(imageView)
    }
}
