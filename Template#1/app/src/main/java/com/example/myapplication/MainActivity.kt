package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)



        bindingClass.button.setOnClickListener {
            val experience: Int = bindingClass.amountOfYears.text.toString().toInt()

//            Variant with IF
//            if (experience < 1) {
//                bindingClass.result.text = "You are a Trainee"
//            }
//            if (experience in 1..2) {
//                bindingClass.result.text = "You are a Junior"
//            }
//            if (experience in 3..5) {
//                bindingClass.result.text = "You are a Middle"
//            }
//            if (experience in 5..8) {
//                bindingClass.result.text = "You are a Senior"
//            }

//            Variant with WHEN
            when(experience) {
                in 0 ..1 -> {
                    bindingClass.result.text = "You are a Trainee"
                }
                in 1..2 -> {
                    bindingClass.result.text = "You are a Junior"
                }
                in 2..5 -> {
                    bindingClass.result.text = "You are a Middle"
                }
                in 5..8 -> {
                    bindingClass.result.text = "You are a Senior"
                }
                else -> {
                    bindingClass.result.text = "You are Team Lead or higher"
                }
            }
        }


    }
}