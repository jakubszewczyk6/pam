package com.example.myfirstapp

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

const val TODO_TEXT = "com.example.myfirstapp.MESSAGE"

public class Global : Application() {
    companion object {
        @JvmField
        var todos: String = ""
        var hasToastBeenUsed = false
    }
}

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addTodoLinkElement = findViewById<View>(R.id.addTodoLink)
        addTodoLinkElement.setOnClickListener(
            View.OnClickListener {
                val intent = Intent(this, AddTodoActivity::class.java)
                startActivity(intent)
            }
        )

        val viewTodosLinkElement = findViewById<View>(R.id.viewTodosLink)
        viewTodosLinkElement.setOnClickListener(
            View.OnClickListener {
                val intent = Intent(this, ViewTodosActivity::class.java)
                startActivity(intent)
            }
        )

        if (Global.hasToastBeenUsed) return

        val text = "Welcome to TodoList app. Create and view your todos."
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()

        Global.hasToastBeenUsed = true
    }
}