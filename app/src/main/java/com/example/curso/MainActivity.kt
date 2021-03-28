package com.example.curso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var Apodo = editText.text.toString()
            if (Apodo.isEmpty()) {
                Toast.makeText(this,"Dale Bolud@ Ponele un Apodo",Toast.LENGTH_LONG)
            }
            else {
            textView.text= "JORGE ${Apodo}"
            }
        }
    }

}