package com.remedios.first_application

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



class WelcomePage:AppCompatActivity(){
    lateinit var button:Button

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_page)


            button = findViewById(R.id.button4)
            button.setOnClickListener{
                val intent = Intent(this, CreateAccount::class.java)
                startActivity(intent)
            }
            }




    }
