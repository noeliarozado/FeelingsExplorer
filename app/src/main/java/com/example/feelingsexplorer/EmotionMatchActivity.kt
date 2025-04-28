package com.example.feelingsexplorer

import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EmotionMatchActivity : AppCompatActivity() {

    private lateinit var txtEmotion: TextView
    private lateinit var txtResult: TextView
    private lateinit var btnOption1: Button
    private lateinit var btnOption2: Button
    private lateinit var btnOption3: Button
    private lateinit var txtScore: TextView
    private var score = 0

    private val emotions = listOf(
        "😊" to "Happy",
        "😢" to "Sad",
        "😡" to "Angry",
        "😱" to "Surprised",
        "😐" to "Neutral",
        "😨" to "Scared",
        "😍" to "Loving",
        "😖" to "Frustrated",
        "😎" to "Confident",
        "🤢" to "Disgusted"
    )

    private var currentEmotion = emotions.random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emotion_match)

        txtEmotion = findViewById(R.id.txtEmotion)
        txtResult = findViewById(R.id.txtResult)
        btnOption1 = findViewById(R.id.btnOption1)
        btnOption2 = findViewById(R.id.btnOption2)
        btnOption3 = findViewById(R.id.btnOption3)
        txtScore = findViewById(R.id.txtScore)

        findViewById<Button>(R.id.btnBack).setOnClickListener { finish() }

        setEmotion()

        val optionButtons = listOf(btnOption1, btnOption2, btnOption3)
        optionButtons.forEach { button ->
            button.setOnClickListener { checkAnswer(button.text.toString()) }
        }
    }

    private fun setEmotion() {
        currentEmotion = emotions.random()
        txtEmotion.text = currentEmotion.first
        txtResult.text = ""

        val options = (emotions - currentEmotion).shuffled().take(2) + currentEmotion
        options.shuffled().forEachIndexed { index, pair ->
            when (index) {
                0 -> btnOption1.text = pair.second
                1 -> btnOption2.text = pair.second
                2 -> btnOption3.text = pair.second
            }
        }
    }

    private fun checkAnswer(selectedAnswer: String) {
        if (selectedAnswer == currentEmotion.second) {
            score++
            txtResult.text = "✅ Correct! Score: $score"
            txtResult.setTextColor(Color.parseColor("#4CAF50"))
            txtScore.text = "Score: $score"

            Handler(Looper.getMainLooper()).postDelayed({
                setEmotion()
            }, 800)

        } else {
            txtResult.text = "❌ Try again!"
            txtResult.setTextColor(Color.parseColor("#F44336"))
        }
    }
}
