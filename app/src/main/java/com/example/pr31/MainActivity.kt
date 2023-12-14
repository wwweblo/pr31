package com.example.pr31

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn1: Button
    private lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn1)
        btn1.setOnClickListener(this)

        btn2 = findViewById(R.id.btn2)
        btn2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn1 -> {
                val intent = Intent(this, SwipesActivity::class.java)
                startActivity(intent)
            }
            R.id.btn2 -> {
                val intent = Intent(this, ScrollActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
