package com.example.feelingsexplorer

import android.graphics.Color
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
    private lateinit var txtScore: TextView
    private var score = 0

    private val emotions = listOf(
        Pair("😊", "Happy"),
        Pair("😢", "Sad"),
        Pair("😡", "Angry"),
        Pair("😱", "Surprised"),
        Pair("😐", "Neutral"),
        Pair("😨", "Scared"),
        Pair("😍", "Loving"),
        Pair("😖", "Frustrated"),
        Pair("😎", "Confident"),
        Pair("🤢", "Disgusted")
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
        // Pick a new random emotion as the correct one
        currentEmotion = emotions.random()
        txtEmotion.text = currentEmotion.first
        txtResult.text = "" // Clear result text

        // Pick two incorrect options (excluding the correct one)
        val incorrectOptions = emotions.filter { it.second != currentEmotion.second }.shuffled().take(2)

        // Combine correct and incorrect answers, then shuffle
        val answerOptions = (incorrectOptions + currentEmotion).shuffled()

        btnOption1.text = answerOptions[0].second
        btnOption2.text = answerOptions[1].second
        btnOption3.text = answerOptions[2].second
    }

    private fun checkAnswer(selectedAnswer: String) {
        if (selectedAnswer == currentEmotion.second) {
            score++
            txtResult.text = "✅ Correct! Score: $score"
            txtResult.setTextColor(Color.GREEN)

            txtScore.text = "Score: $score"

            // Wait 1 second, then load a new emotion
            txtResult.postDelayed({
                setEmotion()
            }, 1000)

        } else {
            txtResult.text = "❌ Try again!"
            txtResult.setTextColor(Color.RED)
        }
    }

}
