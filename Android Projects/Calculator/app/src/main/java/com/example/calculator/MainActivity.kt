 package com.example.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //class level declarations
    //entire class will be able to access the variables declared here

    //declarations
    private lateinit var tvOutput: TextView
    private lateinit var edtInputOne : EditText
    private lateinit var edtInputTwo : EditText
    private lateinit var btnSubtraction : Button
    private lateinit var btnAddition : Button
    private lateinit var btnMultiplication : Button
    private lateinit var btnDivision : Button


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //step 2: initializing the variable
        edtInputOne = findViewById(R.id.edtInputOne)
        edtInputTwo = findViewById(R.id.edtInputTwo)
        btnAddition = findViewById(R.id.btnAddition)
        btnDivision = findViewById(R.id.btnDivision)
        btnMultiplication = findViewById(R.id.btnMultiplication)
        btnSubtraction = findViewById(R.id.btnSubtraction)
        tvOutput = findViewById(R.id.tvOutput)

        //step3: button click listeners
        btnAddition.setOnClickListener {
            //step 3a. read input as a string
            val input1Text = edtInputOne.text.toString()
            val input2Text = edtInputTwo.text.toString()

            //3b. convert to double
            val num1: Double = input1Text.toDouble()
            val num2: Double = input2Text.toDouble()

            //step 3c perform the calculation
            val result = num1 + num2


            //step3d: display the result
            tvOutput.text = "result: $result"
        }
        //step3: button click listeners
        btnMultiplication.setOnClickListener {
            //step 3a. read input as a string
            val input1Text = edtInputOne.text.toString()
            val input2Text = edtInputTwo.text.toString()

            //3b. convert to double
            val num1: Double = input1Text.toDouble()
            val num2: Double = input2Text.toDouble()

            //step 3c perform the calculation
            val result = num1 * num2


            //step3d: display the result
            tvOutput.text = "result: $result"
        }
        //step3: button click listeners
        btnDivision.setOnClickListener {
            //step 3a. read input as a string
            val input1Text = edtInputOne.text.toString()
            val input2Text = edtInputTwo.text.toString()

            //3b. convert to double
            val num1: Double = input1Text.toDouble()
            val num2: Double = input2Text.toDouble()

            //step 3c perform the calculation
            val result = num1 / num2


            //step3d: display the result
            tvOutput.text = "result: $result"
        }
        //step3: button click listeners
        btnSubtraction.setOnClickListener {
            //step 3a. read input as a string
            val input1Text = edtInputOne.text.toString()
            val input2Text = edtInputTwo.text.toString()

            //3b. convert to double
            val num1: Double = input1Text.toDouble()
            val num2: Double = input2Text.toDouble()

            //step 3c perform the calculation
            val result = num1 - num2


            //step3d: display the result
            tvOutput.text = "result: $result"
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}