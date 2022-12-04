package com.sevastyan.ivfilters.filters.standart.sepia

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

internal class SepiaEffect : Effect<SepiaEffectBuilder> {
    override fun with(imageView: ImageView): SepiaEffectBuilder {
        return SepiaEffectBuilder(imageView)
    }
}
