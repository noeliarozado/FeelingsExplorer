package com.example.feelingsexplorer

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EmotionTipsActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emotion_tips)

        val txtTip = findViewById<TextView>(R.id.txtEmotionTip)

        findViewById<Button>(R.id.btnAnger).setOnClickListener {
            txtTip.text = "😡 When you feel angry, take deep breaths and count to 10 before reacting."
        }

        findViewById<Button>(R.id.btnSadness).setOnClickListener {
            txtTip.text = "😢 Feeling sad? Talk to someone you trust and do something you enjoy!"
        }

        findViewById<Button>(R.id.btnFear).setOnClickListener {
            txtTip.text = "😨 Scared? Close your eyes, take deep breaths, and remind yourself that you're safe."
        }

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }
    }
}