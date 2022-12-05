package com.sevapanov.ivfilter.filters.standart.blur

import android.widget.ImageView
import com.sevapanov.ivfilter.filters.Effect

internal class BlurEffect : Effect<BlurEffectBuilder> {
    override fun with(imageView: ImageView): BlurEffectBuilder {
        return BlurEffectBuilder(imageView)
    }
}
