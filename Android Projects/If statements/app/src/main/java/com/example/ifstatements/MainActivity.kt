package com.example.ifstatements

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //Declaring variables
    //app that checks whether a student passed(50% or more)
    //if they qualify fora distinction (75% or more)

    private lateinit var edtMark: EditText
    private lateinit var btnCheck : Button
    private lateinit var tvResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //connect the variables to xml components (typecasting)
        edtMark = findViewById(R.id.edtMark)
        btnCheck = findViewById(R.id.btnCheck)
        tvResult = findViewById(R.id.tvResults)

        //adding the button click listener
        btnCheck.setOnClickListener {
             val markText = edtMark.text.toString()

            //first if: check if the user entered a value
            if(markText.isNotEmpty()) {
                val mark = markText.toInt()

                //second if: check if the student passed
                if (mark >= 50 || mark <= 99) {

                    //nested if: check for a distinction
                    if (mark >= 75) {
                        tvResult.text = "you passed with a distinction"
                    } else {
                        tvResult.text = "you have passed ! "
                    }
                } else {
                    tvResult.text = "you have failed"
                }
            }else{
                tvResult.text = "please enter a mark"
            }
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}