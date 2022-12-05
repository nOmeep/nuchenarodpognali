package com.sevastyan.app

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.sevapanov.ivfilter.utils.ImageViewUtils.blur
import com.sevapanov.ivfilter.utils.ImageViewUtils.exposure
import com.sevapanov.ivfilter.utils.ImageViewUtils.flip
import com.sevapanov.ivfilter.utils.ImageViewUtils.grayscale
import com.sevapanov.ivfilter.utils.ImageViewUtils.invertColors
import com.sevapanov.ivfilter.utils.ImageViewUtils.makeNoise
import com.sevapanov.ivfilter.utils.ImageViewUtils.sepia
import java.util.Queue
import java.util.LinkedList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_layout)

        val testImage = findViewById<ImageView>(R.id.test_image_view)
        val filterButton = findViewById<Button>(R.id.test_button)

        val actions: Queue<() -> Unit> = LinkedList()

        actions.add { testImage.sepia() }
        actions.add { testImage.exposure() }
        actions.add { testImage.makeNoise() }
        actions.add { testImage.invertColors() }
        actions.add { testImage.blur() }
        actions.add { testImage.flip(horizontal = true) }
        actions.add { testImage.grayscale() }

        filterButton.setOnClickListener {
            actions.poll()?.invoke()
        }
    }
}