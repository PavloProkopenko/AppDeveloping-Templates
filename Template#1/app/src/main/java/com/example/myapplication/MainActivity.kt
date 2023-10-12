package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MyLogMA", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyLogMA", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyLogMA", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLogMA", "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLogMA", "onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLogMA", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLogMA", "onRestart")

    }
}