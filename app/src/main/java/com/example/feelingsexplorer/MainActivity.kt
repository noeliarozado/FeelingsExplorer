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
        val btnEmotionRegulation = findViewById<Button>(R.id.btnEmotionRegulation)
        val btnParentsGuide = findViewById<Button>(R.id.btnParentsGuide)
        val btnCopingGames = findViewById<Button>(R.id.btnCopingGames)
        val btnStoryMode = findViewById<Button>(R.id.btnStoryMode)

        // Set button click listeners
        btnEmotionMatch.setOnClickListener {
            val intent = Intent(this, EmotionMatchActivity::class.java)
            startActivity(intent)
        }

        btnEmotionRegulation.setOnClickListener {
            val intent = Intent(this, EmotionTipsActivity::class.java)
            startActivity(intent)
        }

        btnParentsGuide.setOnClickListener {
            val intent = Intent(this, ParentsGuideActivity::class.java)
            startActivity(intent)
        }

        btnCopingGames.setOnClickListener {
            val intent = Intent(this, CopingStrategiesActivity::class.java)
            startActivity(intent)
        }

        btnStoryMode.setOnClickListener {
            val intent = Intent(this, StoryActivity::class.java)
            startActivity(intent)
        }
    }
}