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

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}