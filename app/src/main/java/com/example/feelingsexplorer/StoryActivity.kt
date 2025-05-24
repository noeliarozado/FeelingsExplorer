package com.example.feelingsexplorer

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StoryActivity : AppCompatActivity() {

    private lateinit var txtStory: TextView
    private lateinit var txtStoryTitle: TextView
    private lateinit var btnNextStory: Button
    private lateinit var btnBack: Button

    private val stories = listOf(
        Pair("🐰 Benny the brave bunny", """
            Benny was usually cheerful, but today he felt a tight knot in his tummy.
            He had to speak in front of his class! Benny took a deep breath, held his favourite feather, and remembered:
            “Courage means doing something even when you're scared.”

            When it was Benny's turn, he spoke slowly and smiled. Everyone clapped, and Benny's knot turned into a proud flutter.

            💡 LESSON: Bravery is feeling scared but trying anyway.
        """.trimIndent()),

        Pair("🐢 Timmy the turtle’s angry day", """
            Timmy loved colouring. But when Mia grabbed his crayon, he shouted and stormed off.

            Miss Owl saw everything. “Timmy, let’s take deep breaths,” she said. After 5 slow breaths, Timmy felt better.

            Later, he told Mia how he felt — with calm words. She said sorry and gave him a sticker.

            💡 LESSON: Anger is okay, but calm words help more.
        """.trimIndent()),

        Pair("🐘 Ellie and the thunderstorm", """
            Ellie the elephant hated storms. One night, she hid under her bed.

            Her sister Emma taught her a breathing trick — “Smell the flower, blow out the candle.” It helped!

            Ellie still heard thunder, but she felt braver with her sister’s help.

            💡 LESSON: Breathing and connection help us feel calm.
        """.trimIndent()),

        Pair("🦊 Fiona the fox finds a friend", """
            Fiona just moved to a new forest and felt shy.

            She saw a little fox struggling with shoelaces. She helped him. “Thanks,” he smiled. “I’m Leo.”

            From that day, Fiona and Leo played together every recess.

            💡 LESSON: Helping others can create new friendships.
        """.trimIndent()),

        Pair("🐻 Bea the bear’s deep breaths before bed", """
            Bea the bear was full of energy at bedtime. She tossed and turned, thinking about the next day.

            Her dad said, “Let’s try the 4-4-4 trick: Breathe in for 4, hold for 4, out for 4.” They did it together.

            Bea’s eyes got heavy. She snuggled under her blanket and drifted to sleep.

            💡 LESSON: Calm breathing helps our minds rest.
        """.trimIndent()),

        Pair("🐱 Cleo the cat and the lost toy", """
            Cleo couldn’t find her favorite toy mouse. She meowed, searched everywhere, and even cried.

            Her grandma said, “Let’s pause, breathe, and think.” Cleo closed her eyes and remembered: it was under the couch!

            She felt proud for calming down and solving the problem.

            💡 LESSON: Pausing helps us think clearly.
        """.trimIndent()),

        Pair("🐦 Pip the parrot learns to listen", """
            Pip loved talking — squawk, squawk, squawk! But during games, he interrupted his friends a lot.

            One day, Ellie the Elephant said, “Pip, we feel unheard.” Pip felt sad.

            He practiced listening and waiting his turn. His friends noticed — and gave him a shiny listening badge!

            💡 LESSON: Listening helps everyone feel valued.
        """.trimIndent())
    )

    private var currentStoryIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)

        txtStory = findViewById(R.id.txtStory)
        txtStoryTitle = findViewById(R.id.txtStoryTitle)
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
        val (title, content) = stories[currentStoryIndex]
        txtStoryTitle.text = title
        txtStory.text = content
    }
}
