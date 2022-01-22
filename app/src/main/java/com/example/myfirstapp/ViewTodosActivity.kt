package com.example.myfirstapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class ViewTodosActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_todos)

        val todos = Global.todos;

        fun printTodos(): String {
            return if (todos.isEmpty()) "No todos added yet." else todos
        }
        val todoListElement = findViewById<TextView>(R.id.todosList).apply { text = printTodos()}
    }
}