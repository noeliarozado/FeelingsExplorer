package com.example.feelingsexplorer

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EmotionMatchActivity : AppCompatActivity() {

    private lateinit var txtEmotion: TextView
    private lateinit var txtResult: TextView
    private lateinit var btnOption1: Button
    private lateinit var btnOption2: Button
    private lateinit var btnOption3: Button

    private val emotions = listOf(
        Pair("😊", "Happy"),
        Pair("😢", "Sad"),
        Pair("😡", "Angry")
    )

    private var currentEmotion = emotions[0]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emotion_match)

        txtEmotion = findViewById(R.id.txtEmotion)
        txtResult = findViewById(R.id.txtResult)
        btnOption1 = findViewById(R.id.btnOption1)
        btnOption2 = findViewById(R.id.btnOption2)
        btnOption3 = findViewById(R.id.btnOption3)

        // Set the first emotion
        setEmotion()

        // Set button click listeners
        btnOption1.setOnClickListener { checkAnswer(btnOption1.text.toString()) }
        btnOption2.setOnClickListener { checkAnswer(btnOption2.text.toString()) }
        btnOption3.setOnClickListener { checkAnswer(btnOption3.text.toString()) }

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }
    }

    private fun setEmotion() {
        txtEmotion.text = currentEmotion.first
        txtResult.text = "" // Clear result text
    }

    private fun checkAnswer(selectedAnswer: String) {
        if (selectedAnswer == currentEmotion.second) {
            txtResult.text = "✅ Correct! Great job!"
        } else {
            txtResult.text = "❌ Try again!"
        }
    }
}
