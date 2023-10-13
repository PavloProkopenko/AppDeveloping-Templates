package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // Global variables (can use in any function of class)
    var globalVariable1 = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickListener(view : View) {
        // local variable (can use only in this method)
        val textViewTest = findViewById<TextView>(R.id.textViewTest)
        textViewTest.text = "Now I know how to make change text by button"
        globalVariable1 = 2 // we can do this, because this is global variable
    }
}