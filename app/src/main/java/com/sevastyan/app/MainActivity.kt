package com.sevastyan.app

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.sevastyan.ivfilters.utils.ImageViewUtils.blur
import com.sevastyan.ivfilters.utils.ImageViewUtils.grayscale
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_layout)

        val testImage = findViewById<ImageView>(R.id.test_image_view)
        val filterButton = findViewById<Button>(R.id.test_button)

        val actions: Queue<() -> Unit> = LinkedList()

        actions.add { testImage.blur() }
        actions.add { testImage.grayscale() }

        filterButton.setOnClickListener {
            actions.poll()?.invoke()
        }
    }
}