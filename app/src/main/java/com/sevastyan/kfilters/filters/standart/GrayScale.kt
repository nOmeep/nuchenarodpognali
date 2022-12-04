package com.sevastyan.kfilters.filters.standart

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.ColorMatrixColorFilter
import android.graphics.Paint
import com.sevastyan.kfilters.filters.Filter

internal class GrayScale(
    bitmap: Bitmap
) : Filter(srcBitmap = bitmap) {
    override fun applyFilter(): Bitmap {
        val resultBitmap = Bitmap.createBitmap(srcBitmap.width, srcBitmap.height, srcBitmap.config)
        val canvas = Canvas(resultBitmap)
        val paint = Paint()
        val filter = ColorMatrixColorFilter(grayscaleMatrix)
        paint.colorFilter = filter
        canvas.drawBitmap(srcBitmap, 0f, 0f, paint)

        return Bitmap.createScaledBitmap(resultBitmap, srcBitmap.width, srcBitmap.height, true)
    }

    companion object {
        private var grayscaleMatrix = floatArrayOf(
            0.3f, 0.59f, 0.11f, 0f, 0f,
            0.3f, 0.59f, 0.11f, 0f, 0f,
            0.3f, 0.59f, 0.11f, 0f, 0f, 0f, 0f, 0f, 1f, 0f
        )
    }
}
