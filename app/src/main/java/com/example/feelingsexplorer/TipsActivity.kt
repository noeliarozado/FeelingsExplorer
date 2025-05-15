package com.example.feelingsexplorer

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TipsActivity : AppCompatActivity() {

    private lateinit var txtTips: TextView
    private lateinit var btnBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips)

        txtTips = findViewById(R.id.txtTips)
        btnBack = findViewById(R.id.btnBack)

        findViewById<Button>(R.id.btnAnger).setOnClickListener {
            txtTips.text = "😡 Feeling angry? Take deep breaths and count to 10 before reacting."
        }

        findViewById<Button>(R.id.btnSadness).setOnClickListener {
            txtTips.text = "😢 Feeling sad? Talk to someone you trust and do something you love!"
        }

        findViewById<Button>(R.id.btnFear).setOnClickListener {
            txtTips.text = "😨 Feeling scared? Close your eyes, breathe deeply, and remember you are safe."
        }

        findViewById<Button>(R.id.btnDeepBreathing).setOnClickListener {
            txtTips.text = "🌬️ Deep breathing: Breathe in for 4 seconds, hold for 4, breathe out for 6 seconds."
        }

        findViewById<Button>(R.id.btnCountToTen).setOnClickListener {
            txtTips.text = "🔢 Count to ten: Slowly count from 1 to 10 to help your mind slow down."
        }

        findViewById<Button>(R.id.btnHug).setOnClickListener {
            txtTips.text = "🤗 Ask for a hug: Hugs release feel-good hormones."
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}
