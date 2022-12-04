package com.sevastyan.ivfilters.filters

import android.widget.ImageView

abstract class EffectManager(
    protected val imageView: ImageView
) {
    fun execute() {
        applyEffect()
        imageView.invalidate()
    }

    abstract fun applyEffect()
}
