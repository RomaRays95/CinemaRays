package com.rays95.cinemarays

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListeners()
    }

    private fun initListeners() {
        topAppBar.setNavigationOnClickListener {
            Toast.makeText(this, getString(R.string.will_be_navigation), Toast.LENGTH_SHORT)
                .show()
        }
        topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.settings -> {
                    Toast.makeText(this, getString(R.string.button_5_string), Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
        bottom_navigation.setOnItemSelectedListener {

            when (it.itemId) {
                R.id.favorites -> {
                    Toast.makeText(this, getString(R.string.button_2_string), Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.watch_later -> {
                    Toast.makeText(this, getString(R.string.button_3_string), Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.selections -> {
                    Toast.makeText(this, getString(R.string.button_4_string), Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}