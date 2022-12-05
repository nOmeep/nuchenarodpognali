@file:Suppress("DEPRECATION")

package com.sevapanov.ivfilter.filters.standart.blur

import android.content.Context
import android.graphics.Bitmap
import android.renderscript.Allocation
import android.renderscript.Element
import android.renderscript.RenderScript
import android.renderscript.ScriptIntrinsicBlur
import android.widget.ImageView
import androidx.core.graphics.drawable.toBitmap
import com.sevapanov.ivfilter.filters.Effect
import kotlin.math.roundToInt

internal class BlurEffectManager(
    model: BlurModel,
    imageView: ImageView
) : Effect.EffectManager<BlurModel>(
    model = model,
    imageView = imageView
) {
    override fun applyEffect(imageView: ImageView) {
        val blurred = blurRenderScript(imageView.context, imageView.drawable.toBitmap())
        imageView.setImageBitmap(blurred)
    }

    private fun blurRenderScript(context: Context, sourceBitmap: Bitmap): Bitmap {
        val width = (sourceBitmap.width * model.scale).roundToInt()
        val height = (sourceBitmap.height * model.scale).roundToInt()

        val inputBitmap = Bitmap.createScaledBitmap(sourceBitmap, width, height, false)
        val outputBitmap = Bitmap.createBitmap(inputBitmap)
        val renderScript = RenderScript.create(context)
        val theIntrinsic = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript))
        val tmpIn = Allocation.createFromBitmap(renderScript, inputBitmap)
        val tmpOut = Allocation.createFromBitmap(renderScript, outputBitmap)
        theIntrinsic.setRadius(model.radius)
        theIntrinsic.setInput(tmpIn)
        theIntrinsic.forEach(tmpOut)
        tmpOut.copyTo(outputBitmap)

        return Bitmap.createScaledBitmap(
            outputBitmap,
            sourceBitmap.width,
            sourceBitmap.height,
            true
        )
    }
}
