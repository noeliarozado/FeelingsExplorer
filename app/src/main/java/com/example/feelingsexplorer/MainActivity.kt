package com.example.feelingsexplorer

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.TimePicker

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Buttons
        val btnEmotionMatch = findViewById<Button>(R.id.btnEmotionMatch)
        val btnParentsGuide = findViewById<Button>(R.id.btnParentsGuide)
        val btnStoryMode = findViewById<Button>(R.id.btnStoryMode)
        val btnTips = findViewById<Button>(R.id.btnTips)

        btnEmotionMatch.setOnClickListener {
            val intent = Intent(this, EmotionMatchActivity::class.java)
            startActivity(intent)
        }

        btnTips.setOnClickListener {
            val intent = Intent(this, TipsActivity::class.java)
            startActivity(intent)
        }

        btnParentsGuide.setOnClickListener {
            val intent = Intent(this, ParentsGuideActivity::class.java)
            startActivity(intent)
        }

        btnStoryMode.setOnClickListener {
            val intent = Intent(this, StoryActivity::class.java)
            startActivity(intent)
        }

    }
}