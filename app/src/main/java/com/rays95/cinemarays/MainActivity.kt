package com.rays95.cinemarays

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_1.setOnClickListener {
            Toast.makeText(this, "Task 1", Toast.LENGTH_SHORT).show()
        }
        button_2.setOnClickListener {
            Toast.makeText(this, "Task 2", Toast.LENGTH_SHORT).show()
        }
        button_3.setOnClickListener {
            Toast.makeText(this, "Task 3", Toast.LENGTH_SHORT).show()
        }
        button_4.setOnClickListener {
            Toast.makeText(this, "Task 4", Toast.LENGTH_SHORT).show()
        }
        button_5.setOnClickListener {
            Toast.makeText(this, "Task 5", Toast.LENGTH_SHORT).show()
        }
    }
}