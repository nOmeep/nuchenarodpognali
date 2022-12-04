package com.sevastyan.kfilters.filters

import android.graphics.Bitmap

/**
 * @param srcBitmap bitmap on which the filter will be applied
 *
 * Abstract class for creating filters for Bitmaps
 */
abstract class Filter(
    val srcBitmap: Bitmap
) {
    abstract fun applyFilter(): Bitmap
}
