package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingClass : ActivityMainBinding
    private val number1 = 324
    private val number2 = 34
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.button2.setOnClickListener {
            val result = number1 + number2
            bindingClass.Result.text = "Result of 324 + 34: $result"
        }

        bindingClass.button3.setOnClickListener {
            val result = number1 - number2
            bindingClass.Result.text = "Result of 324 - 24: $result"
        }

        bindingClass.button4.setOnClickListener {
            val result = number1 * number2
            bindingClass.Result.text = "Result of 324 * 24: $result"
        }

        bindingClass.button1.setOnClickListener {
            val result = number1 / number2
            bindingClass.Result.text = "Result of 324 / 24: $result"
        }
    }




}