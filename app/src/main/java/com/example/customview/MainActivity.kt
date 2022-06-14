package com.example.customview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtSunrise: CustomView = findViewById(R.id.sunrise_custom_view)
        val txtSunset: CustomView = findViewById(R.id.sunset_custom_view)
        val btnClick: CustomView = findViewById(R.id.btn_click)

        /**
         * txtSunrise
         */
        txtSunrise.setSubtitle("textView1")
        txtSunrise.setTitle("1")
        txtSunrise.setImageDrawable(resources.getDrawable(R.drawable.user))

        /**
         * txtSunset
         */
        txtSunset.setSubtitle("textView2")
        txtSunset.setTitle("2")
        txtSunset.setImageDrawable(resources.getDrawable(R.drawable.user))


        /**
         * btnClick
         */
        btnClick.setButton("button")
//        btnClick.setImageDrawable(resources.getDrawable(R.drawable.user))

    }
}