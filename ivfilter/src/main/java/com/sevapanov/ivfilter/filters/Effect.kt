package com.sevapanov.ivfilter.filters

import android.os.Handler
import android.os.HandlerThread
import android.widget.ImageView

/**
 * Main interface for creating ImageView effects
 */
internal interface Effect<B : Effect.EffectBuilder<*>> {
    /**
     * @param imageView ImageView on which effect will be executed
     */
    fun with(imageView: ImageView): B

    /**
     * Each Effect should have it's own builder for customization if needed
     */
    abstract class EffectBuilder<M>(
        protected val imageView: ImageView
    ) {
        abstract fun make(): EffectManager<M>
    }

    /**
     * This class will handle all the calculations and effect applying
     */
    abstract class EffectManager<M>(
        protected val model: M,
        protected val imageView: ImageView
    ) {
        /**
         * Called for applying effect on ImageView
         */
        fun execute() {
            handler.post {
                applyEffect(imageView)
                imageView.invalidate()
            }
        }

        /**
         * Apply effect to imageView
         */
        protected abstract fun applyEffect(imageView: ImageView)

        companion object {
            private const val HANDLER_THREAD_DEFAULT_NAME = "THREAD_DEFAULT_NAME"

            private val handlerThread: HandlerThread = HandlerThread(HANDLER_THREAD_DEFAULT_NAME)
                .apply { start() }
            private val handler: Handler = Handler(handlerThread.looper)
        }
    }
}
