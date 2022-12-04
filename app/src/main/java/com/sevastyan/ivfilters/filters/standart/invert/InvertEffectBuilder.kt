package com.sevastyan.ivfilters.filters.standart.invert

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

internal class InvertEffectBuilder(
    private val imageView: ImageView
) : Effect.EffectBuilder {
    override fun make() {
        InvertEffectManager()
            .executeOn(imageView)
    }
}
