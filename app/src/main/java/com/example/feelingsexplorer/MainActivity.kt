package com.example.feelingsexplorer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Buttons
        val btnEmotionMatch = findViewById<Button>(R.id.btnEmotionMatch)
        val btnCopingGames = findViewById<Button>(R.id.btnCopingGames)
        val btnStoryMode = findViewById<Button>(R.id.btnStoryMode)

        // Set button click listeners
        btnEmotionMatch.setOnClickListener {
            // TODO: Open Emotion Matching Activity
        }

        btnCopingGames.setOnClickListener {
            // TODO: Open Coping Strategies Activity
        }

        btnStoryMode.setOnClickListener {
            // TODO: Open Story Mode Activity
        }
    }
}