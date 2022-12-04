package com.sevastyan.kfilters.utils

import android.graphics.Bitmap
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.widget.ImageView
import androidx.core.graphics.drawable.toBitmap
import com.sevastyan.kfilters.filters.Filter
import com.sevastyan.kfilters.filters.standart.GrayScale

/**
 * Utility functions to work with for @see com.sevastyan.kfilters.filters.Filter
 * that will be applied on ImageView's
 */
object ImageViewUtils {
    /**
     * Makes current imageView black and white without creating
     * extra @see com.sevastyan.kfilters.filters.Filter objects
     */
    fun ImageView.toGrayscale() {
        val matrix = ColorMatrix()
        matrix.setSaturation(0f)
        val filter = ColorMatrixColorFilter(matrix)
        drawable.colorFilter = filter
    }

    /**
     * @param bitmap provided nullable bitmap
     *
     * Sets black and white image of provided bitmap to ImageView.
     * If bitmap is null then it will take current ImageView bitmap
     */
    fun ImageView.toGrayscale(bitmap: Bitmap?) {
        val grayScaleFilter = GrayScale(bitmap ?: drawable.toBitmap())
        setImageBitmap(grayScaleFilter.applyFilter())
    }

    /**
     * @param filter @see com.sevastyan.kfilters.filters.Filter implementation. Can be used with default ones
     *
     * Used for applying default and non-default @see com.sevastyan.kfilters.filters.Filter
     * implementation to ImageView
     */
    fun ImageView.applyFilter(filter: Filter) {
        setImageBitmap(filter.applyFilter())
    }
}
