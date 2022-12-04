package com.sevastyan.ivfilters.filters.standart.invert

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

internal class InvertEffectBuilder(
    imageView: ImageView
) : Effect.ImageViewEffectBuilder(imageView = imageView) {
    override fun make() {
        InvertEffectManager()
            .executeOn(imageView)
    }
}
