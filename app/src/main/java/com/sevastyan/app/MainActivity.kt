package com.sevastyan.app

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.sevastyan.kfilters.filters.standart.blur.BlurEffect
import com.sevastyan.kfilters.filters.standart.grayscale.GrayscaleEffect

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_layout)

        val testImage = findViewById<ImageView>(R.id.test_image_view)
        val filterButton = findViewById<Button>(R.id.test_button)

        filterButton.setOnClickListener {
            GrayscaleEffect().with(testImage)
                .apply()
        }
    }
}