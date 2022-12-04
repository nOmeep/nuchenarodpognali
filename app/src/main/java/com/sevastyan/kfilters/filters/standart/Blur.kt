package com.sevastyan.kfilters.filters.standart

import android.graphics.Bitmap
import com.sevastyan.kfilters.filters.Filter

class Blur(
    bitmap: Bitmap
) : Filter(srcBitmap = bitmap) {
    override fun applyFilter(): Bitmap {
        TODO("Blur algorithm")
    }
}