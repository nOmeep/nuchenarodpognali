package com.sevastyan.ivfilters.filters

import android.os.Handler
import android.os.HandlerThread
import android.widget.ImageView

interface Effect<B : Effect.EffectBuilder<*>> {
    fun with(imageView: ImageView): B

    abstract class EffectBuilder<M>(
        protected val imageView: ImageView
    ) {
        abstract fun make(): EffectManager<M>
    }

    abstract class EffectManager<M>(
        protected val model: M,
        protected val imageView: ImageView
    ) {
        private val handlerThread: HandlerThread =
            HandlerThread(HANDLER_THREAD_DEFAULT_NAME).apply { start() }
        private val handler: Handler = Handler(handlerThread.looper)

        fun execute() {
            handler.post {
                applyEffect(imageView)
                imageView.invalidate()
            }
        }

        protected abstract fun applyEffect(imageView: ImageView)

        companion object {
            private const val HANDLER_THREAD_DEFAULT_NAME = "THREAD_DEFAULT_NAME"
        }
    }
}
