package com.example.variablescope

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //Variable Scope - class level(global inside tis class)
    //Global meaning the variables here can be accessed by the entire class
    //this variable is declared outside the onCreate()

    //if we declared this inside the onCreate()
    //only the onCreate() would know it exists

    //private means ONLY this class can access it
    //Other classes can not or modify this variable
    //good coding practice

    //lateinit means "I will initialize this later"
    //declaring at class level allows any methods in this class to use it, but it is still private

    private lateinit var tvRecipt: TextView

    //tag for debugging
    private val TAG = "Coffeeshop"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //initalizing: Link the variable to the actual TextView
        //here we are hiring the view from the design to become a textview in the code

        tvRecipt = findViewById(R.id.tvReceipt)

        //local variables that only exist in our onCreate()
        val snackPrice: Int = 20 //whole number
        val taxAmount: Double = 5.50

        //type conversion example
        //we can not add int and decimal together
        //so we will convert the int -> Double before adding

        val total = snackPrice.toDouble() + taxAmount

        //display it on the screen
        //Textview need strings not numbers
        //so we will convert total (double) -> string
        tvRecipt.text = "total Price R" + total.toString()


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}