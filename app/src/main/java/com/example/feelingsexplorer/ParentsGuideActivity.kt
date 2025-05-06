package com.example.feelingsexplorer

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ParentsGuideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parents_guide)

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }
    }
}
