package com.example.logicalop

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //Declarations
    private lateinit var edtName: EditText
    private lateinit var edtAge: EditText
    private lateinit var btnCheck: Button
    private lateinit var cbStaff: CheckBox
    private lateinit var cbITStudent: CheckBox
    private lateinit var cbBanned: CheckBox
    private lateinit var textView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //linking the variables to the UI components using their ID's (typecasting)
        edtName = findViewById(R.id.edtName)
        edtAge = findViewById(R.id.edtAge)
        btnCheck = findViewById(R.id.btnCheck)
        cbStaff = findViewById(R.id.cbStaff)
        cbITStudent = findViewById(R.id.cbITStudent)
        cbBanned = findViewById(R.id.cbBanned)
        textView = findViewById(R.id.textView)


        //button to run the code when it is pressed
        btnCheck.setOnClickListener {

            //get tht user's name from the edittext
            val name = edtName.text.toString()

            //convert the age inyo a string (int)
            val age = edtAge.text.toString().toInt()

            //check if checkboxes are selected (true or false)
            val isITstudent = cbITStudent.isChecked
            val isBanned = cbBanned.isChecked
            val isStaff = cbStaff.isChecked

            if(((age >= 18 && isITstudent)|| isStaff) && !isBanned) {

                //if the condition is true above is true
                textView.text =
                    "congratulations $name! Yoy are qualify for the student tech discount."
            }else{

                //if the condition above is false
                textView.text= "sorry $name, are do not qualify for the discount."

                }
            /*
            logic condition explanation
            step 1: (age >= 18 && isITstudent)
            >= means greater then or equal to
            && means AND (both conditions must be true)

            so this check if the user is 18 or older and is an It student
             step2:
             || means OR(only one condition needs to be true)

             this means the person can qualify if they are staff member even if they are not an it student

             step 3: && !isBanned)
             ! means NOT( it reverses the value)
             !isBanned  means the person must NOT be Banned

             Example
             isBanned = false

             */
        }

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}