package com.sevastyan.kfilters.filters.standart.blur

import android.widget.ImageView
import com.sevastyan.kfilters.filters.Effect

class BlurEffect : Effect<BlurEffectBuilder> {
    override fun with(imageView: ImageView): BlurEffectBuilder {
        return BlurEffectBuilder(imageView)
    }
}
