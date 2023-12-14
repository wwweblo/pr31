package com.example.pr31

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ScrollActivity : AppCompatActivity() {

    private lateinit var button: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll)

        button = findViewById(R.id.imagebun)
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}