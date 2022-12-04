package com.sevastyan.kfilters.filters.standart.grayscale

import android.widget.ImageView
import com.sevastyan.kfilters.filters.Effect

class GrayscaleEffect : Effect<GrayscaleEffectBuilder> {
    override fun with(imageView: ImageView): GrayscaleEffectBuilder {
        return GrayscaleEffectBuilder(imageView)
    }
}
