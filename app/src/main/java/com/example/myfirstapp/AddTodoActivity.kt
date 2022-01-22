package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class AddTodoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_todo)
    }

    fun addTodo(view: View) {
        val todoInputElement = findViewById<EditText>(R.id.editTextTextPersonName)
        val todoText = todoInputElement.text.toString().trim()
        if (todoText.isEmpty()) return
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(TODO_TEXT, todoText)
        }
        startActivity(intent)
    }
}