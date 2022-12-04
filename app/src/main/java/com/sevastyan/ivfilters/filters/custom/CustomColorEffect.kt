package com.sevastyan.ivfilters.filters.custom

import android.widget.ImageView
import com.sevastyan.ivfilters.filters.Effect
import com.sevastyan.ivfilters.filters.EffectManager

class CustomColorEffect : Effect<CustomColorEffectBuilder> {
    override fun with(imageView: ImageView): CustomColorEffectBuilder {
        return CustomColorEffectBuilder(imageView)
    }
}

class CustomColorEffectBuilder(
    imageView: ImageView
) : Effect.ImageViewEffectBuilder(imageView = imageView) {
    override fun make() {
        TODO("Not yet implemented")
    }
}

class CustomColorEffectManager(
    model: CustomColorEffectModel
) : EffectManager<CustomColorEffectModel>(model = model) {
    override fun applyEffect(imageView: ImageView) {
        TODO("Not yet implemented")
    }
}

class CustomColorEffectModel : Effect.EffectModel