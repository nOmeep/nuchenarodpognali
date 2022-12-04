package com.sevastyan.ivfilters.filters.standart.blur

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect

internal class BlurEffect : Effect<BlurEffectBuilder> {
    override fun with(imageView: ImageView): BlurEffectBuilder {
        return BlurEffectBuilder(imageView)
    }
}
