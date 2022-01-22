package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val todoText = intent.getStringExtra(TODO_TEXT)
        Global.todos += " $todoText ${'\n'}${'\n'}"
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = "Your TODO: ${'"'}$todoText${'"'} has been successfully added!"
        }

        val goBackToMainLinkElement = findViewById<View>(R.id.goBackToMainLink)
        goBackToMainLinkElement.setOnClickListener(
            View.OnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        )
    }
}