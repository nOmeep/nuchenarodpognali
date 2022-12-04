package com.sevastyan.ivfilters.filters.standart.sepia

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

internal class SepiaEffectBuilder(
    imageView: ImageView
) : Effect.ImageViewEffectBuilder(imageView = imageView) {
    override fun make() {
        SepiaEffectManager()
            .executeOn(imageView)
    }
}
