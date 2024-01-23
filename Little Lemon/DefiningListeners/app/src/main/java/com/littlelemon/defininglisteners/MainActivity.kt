package com.littlelemon.defininglisteners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val saveDataButton = findViewById<Button>(R.id.saveDataButton)
        saveDataButton.setOnClickListener{
            view -> Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show()
        }
    }

}