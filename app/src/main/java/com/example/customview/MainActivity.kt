package com.example.customview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val t1: CustomView = findViewById(R.id.sunrise_custom_view)
        val t2: CustomView = findViewById(R.id.sunset_custom_view)
        val t3: CustomView = findViewById(R.id.button232)

        t1.setSubtitle("5:31 AM") // sunrise time set as subtitle
        t2.setSubtitle("5:01 PM") //
        t3.setButton("salam")

    }
}