package com.example.variables

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //An int stores whole number
        val studentAge : Int = 20

        //a boolean stores true/false values
        val isRegistered: Boolean = true

        //Double stores your decimal numbers
        val studentGPA : Double = 3.75

        //float stores decimal numbers with less precision
        val studentHeight : Float = 1.63f

        //char stores a single character
        val studentInital : Char = 'A'

        //Long stores large whole numbers
        val studentID : Long = 123456789

        //Example of nullable varable (can be null)
        val middleName : string? = null

        //step2 : logging data into your logcat
        // "studentApp" is our tag to identify these logs
        //$ inserts the value of the variable studentName directly into the string
        log.





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}