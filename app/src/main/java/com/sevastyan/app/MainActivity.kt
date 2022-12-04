package com.sevastyan.app

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.sevastyan.kfilters.utils.ImageViewUtils.toGrayscale

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_layout)

        val testImage = findViewById<ImageView>(R.id.test_image_view)
        val filterButton = findViewById<Button>(R.id.test_button)

        filterButton.setOnClickListener {
            testImage.toGrayscale()
        }
    }
}