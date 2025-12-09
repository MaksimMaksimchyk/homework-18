package com.example.homework_18

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Описание и переход в задание 1:
        val ex1Card: CardView = findViewById<CardView>(R.id.ex1Card)
        ex1Card.setOnClickListener {
            val intent = Intent(this, Ex1MainActivity::class.java)
            startActivity(intent)
        }

        //Описание и переход в задание 2:
        val ex2Card: CardView = findViewById<CardView>(R.id.ex2Card)
        ex2Card.setOnClickListener {
            val intent = Intent(this, Ex2MainActivity::class.java)
            startActivity(intent)
        }

        //Описание и переход в задание 3:
        val ex3Card: CardView = findViewById<CardView>(R.id.ex3Card)
        ex3Card.setOnClickListener {
            val intent = Intent(this, Ex3MainActivity::class.java)
            startActivity(intent)
        }

    }

}