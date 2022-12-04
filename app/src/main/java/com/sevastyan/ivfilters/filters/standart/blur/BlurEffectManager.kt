@file:Suppress("DEPRECATION")

package com.sevastyan.ivfilters.filters.standart.blur

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.renderscript.Allocation
import android.renderscript.Element
import android.renderscript.RenderScript
import android.renderscript.ScriptIntrinsicBlur
import android.widget.ImageView
import com.sevastyan.ivfilters.filters.EffectManager
import kotlin.math.roundToInt

internal class BlurEffectManager(
    private val radius: Int,
    private val scale: Float,
    imageView: ImageView
) : EffectManager(
    imageView = imageView
) {
    override fun applyEffect() {
        val drawable = imageView.drawable
        val blurred = blurRenderScript(imageView.context, (drawable as BitmapDrawable).bitmap)
        imageView.setImageBitmap(blurred)
    }

    private fun blurRenderScript(context: Context, smallBitmap: Bitmap): Bitmap {
        val width = (smallBitmap.width * scale).roundToInt()
        val height = (smallBitmap.height * scale).roundToInt()

        val inputBitmap = Bitmap.createScaledBitmap(smallBitmap, width, height, false)
        val outputBitmap = Bitmap.createBitmap(inputBitmap)
        val renderScript = RenderScript.create(context)
        val theIntrinsic = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript))
        val tmpIn = Allocation.createFromBitmap(renderScript, inputBitmap)
        val tmpOut = Allocation.createFromBitmap(renderScript, outputBitmap)
        theIntrinsic.setRadius(radius.toFloat())
        theIntrinsic.setInput(tmpIn)
        theIntrinsic.forEach(tmpOut)
        tmpOut.copyTo(outputBitmap)

        return Bitmap.createScaledBitmap(outputBitmap, smallBitmap.width, smallBitmap.height, true)
    }
}
