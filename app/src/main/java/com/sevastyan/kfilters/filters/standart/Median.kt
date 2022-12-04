package com.sevastyan.kfilters.filters.standart

import android.graphics.Bitmap
import com.sevastyan.kfilters.filters.Filter

internal class Median(
    bitmap: Bitmap
) : Filter(srcBitmap = bitmap) {
    override fun applyFilter(): Bitmap {
        TODO("Median image filtering")
    }
}
