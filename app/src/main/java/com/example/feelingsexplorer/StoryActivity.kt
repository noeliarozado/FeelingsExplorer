package com.example.feelingsexplorer

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StoryActivity : AppCompatActivity() {

    private lateinit var txtStory: TextView
    private lateinit var btnNextStory: Button
    private lateinit var btnBack: Button

    private val stories = listOf(
        """
        🐰 Benny the Brave Bunny

        Benny was usually cheerful, but today he felt a tight knot in his tummy. 
        He had to speak in front of his class! Benny took a deep breath, held his favorite feather, and remembered what his mom said: 
        “Courage means doing something even when you're scared.”

        When it was Benny's turn, he spoke slowly and smiled. Everyone clapped, and Benny's knot turned into a proud flutter.

        💡 Lesson: Bravery is feeling scared but trying anyway.
        """.trimIndent(),

        """
        🐢 Timmy the Turtle’s Angry Day

        Timmy loved coloring. But when Mia grabbed his crayon without asking, he shouted, “That’s mine!” and stormed off.

        Miss Owl saw everything. “Timmy, let’s try taking deep breaths together,” she said. After 5 slow breaths, Timmy felt a little better.

        Later, Timmy told Mia how he felt using his words instead of shouting. She said sorry and gave him a sticker.

        💡 Lesson: Anger is okay, but calm words solve problems.
        """.trimIndent(),

        """
        🐘 Ellie and the Thunderstorm

        Ellie the Elephant hated storms. The rumble scared her. One night, she hid under her bed.

        Her big sister Emma showed her a breathing trick — “Smell the flower, blow out the candle.” They did it together 5 times.

        The thunder kept rumbling, but Ellie felt calmer and safe with her sister’s help.

        💡 Lesson: Breathing and connection help us feel calm.
        """.trimIndent(),

        """
        🦊 Fiona the Fox Finds a Friend

        Fiona just moved to a new forest and didn’t know anyone. She felt shy and stayed by herself at recess.

        One day, she saw another little fox trying to tie his shoes and struggling. She walked over and helped him. “Thanks,” he smiled. “I’m Leo.”

        From that day, Fiona and Leo played together every recess.

        💡 Lesson: Helping others can create new friendships.
        """.trimIndent()
    )

    private var currentStoryIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)

        txtStory = findViewById(R.id.txtStory)
        btnNextStory = findViewById(R.id.btnNextStory)
        btnBack = findViewById(R.id.btnBackToMenu)

        displayStory()

        btnNextStory.setOnClickListener {
            currentStoryIndex = (currentStoryIndex + 1) % stories.size
            displayStory()
        }

        btnBack.setOnClickListener {
            finish()
        }
    }

    private fun displayStory() {
        txtStory.text = stories[currentStoryIndex]
    }
}
