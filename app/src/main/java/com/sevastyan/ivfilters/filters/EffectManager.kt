package com.sevastyan.ivfilters.filters

import android.widget.ImageView

abstract class EffectManager<M : Effect.EffectModel?>(
    protected val model: M
) {
    fun executeOn(imageView: ImageView) {
        applyEffect(imageView)
        imageView.invalidate()
    }

    // TODO: filter on background
    protected abstract fun applyEffect(imageView: ImageView)
}
