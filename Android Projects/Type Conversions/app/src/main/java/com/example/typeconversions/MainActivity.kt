package com.example.typeconversions

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //1. toDouble(): The "precision tool"...
        //we start with a whole number (Int)
        //In kotlin you cannot add a decimal(double) to a whole number (int) directly
        val baseSpeed: Int = 5

        //we use .toDouble to "transform" the 5 into 5.0 so the math works
        val speedWithBoost = baseSpeed.toDouble() + 0.75

        //log result: 5.75
        Log.d("conversion", "new speed" + speedWithBoost)

        //2. toInt() : the "clipper tool"
        //here we have a precise decimal, but we only want the whole number part.
        val powerLevel : Double = 99.98

        //.toInt () does not round up to 100. it si like a pair of scissors
        // it simply "clips" off everything after the decimal point
        val roundedPower: Int = powerLevel.toInt()

        //log result : 99
        Log.d("conversion", "power Level:" + roundedPower)

        //3. toString() ; the "translator" tool
        //computers treat the number 150 and the text "150" differently
        // you can't do math with text, and you can't display raw numbers easily in screen
        val coinsCollected: Int=150

        //we turn the math-number (150) into the text- word "150"
        val coinText: String = coinsCollected.toString()

        //log result: 150 (as text)
        Log.d("conversion", "coins:" + coinText)

    }
}


