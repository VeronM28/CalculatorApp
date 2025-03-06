package com.st10083866.calculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var etValueOne : EditText
    private lateinit var etValueTwo : EditText
    private lateinit var btnCalculate : Button
    private lateinit var txtViewResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val etValueOne = findViewById<EditText>(R.id.etValueOne)
        val etValueTwo = findViewById<EditText>(R.id.etValueTwo)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val txtViewResult = findViewById<TextView>(R.id.txtViewResult)

        btnCalculate.setOnClickListener {
            // Get input values and convert to Double
            val value1 = etValueOne.text.toString().toDoubleOrNull()
            val value2 = etValueTwo.text.toString().toDoubleOrNull()

            // Check if inputs are valid numbers
            if (value1 != null && value2 != null) {
                val sum = value1 + value2
                txtViewResult.text = "Result: $sum"
            } else {
                txtViewResult.text = "Please enter valid numbers"
            }
        }





        }

    }
