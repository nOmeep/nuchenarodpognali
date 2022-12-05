package com.sevapanov.ivfilter.filters.standart.sepia

import android.widget.ImageView
import com.sevapanov.ivfilter.filters.Effect

internal class SepiaEffectBuilder(
    imageView: ImageView
) : Effect.EffectBuilder<Unit?>(imageView = imageView) {
    override fun make(): SepiaEffectManager {
        return SepiaEffectManager(imageView)
    }
}
