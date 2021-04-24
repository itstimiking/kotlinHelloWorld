package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberToIncrement: TextView = findViewById(R.id.textView_number)
        val incrementButton : Button = findViewById(R.id.button_increase)
        val resetButton: Button = findViewById(R.id.button_reset)

        incrementButton.setOnClickListener{
            var newNumber = numberToIncrement.text.toString().toInt() + 1
            numberToIncrement.text = newNumber.toString()
        }

        resetButton.setOnClickListener {
            var newNumber = 1
            numberToIncrement.text = newNumber.toString()
        }
    }

}