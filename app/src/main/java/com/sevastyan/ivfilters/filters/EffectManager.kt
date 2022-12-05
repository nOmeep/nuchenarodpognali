package com.sevastyan.ivfilters.filters

import android.os.Handler
import android.os.HandlerThread
import android.widget.ImageView

internal abstract class EffectManager<M>(
    protected val model: M
) {
    private val handlerThread: HandlerThread = HandlerThread("").apply { start() }
    private val handler: Handler = Handler(handlerThread.looper)

    fun executeOn(imageView: ImageView) {
        handler.post {
            applyEffect(imageView)
            imageView.invalidate()
        }
    }

    protected abstract fun applyEffect(imageView: ImageView)
}
