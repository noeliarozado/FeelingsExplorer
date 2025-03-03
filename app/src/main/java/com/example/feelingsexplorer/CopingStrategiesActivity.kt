package com.example.feelingsexplorer

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CopingStrategiesActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coping_strategies)

        val btnDeepBreathing = findViewById<Button>(R.id.btnDeepBreathing)
        val btnCountToTen = findViewById<Button>(R.id.btnCountToTen)
        val btnHug = findViewById<Button>(R.id.btnHug)

        btnDeepBreathing.setOnClickListener {
            Toast.makeText(this, "Breathe in... Breathe out... Relax! 😌", Toast.LENGTH_LONG).show()
        }

        btnCountToTen.setOnClickListener {
            Toast.makeText(this, "Take a deep breath and count to ten! 🧘", Toast.LENGTH_LONG).show()
        }

        btnHug.setOnClickListener {
            Toast.makeText(this, "A hug makes everything better! 🤗", Toast.LENGTH_LONG).show()
        }

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }
    }
}
