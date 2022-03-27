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
        topAppBar.setNavigationOnClickListener {
            Toast.makeText(this, "Когда-нибудь здесь будет навигация...", Toast.LENGTH_SHORT).show()
        }
        topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.fav -> {
                    Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.search -> {
                    Toast.makeText(this, "Поиск", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.more -> {
                    Toast.makeText(this, "Еще", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}