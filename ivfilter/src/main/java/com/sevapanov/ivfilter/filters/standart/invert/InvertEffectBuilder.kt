package com.sevapanov.ivfilter.filters.standart.invert

import android.widget.ImageView
import com.sevapanov.ivfilter.filters.Effect

internal class InvertEffectBuilder(
    imageView: ImageView
) : Effect.EffectBuilder<Unit?>(imageView = imageView) {
    override fun make(): InvertEffectManager {
        return InvertEffectManager(imageView)
    }
}
