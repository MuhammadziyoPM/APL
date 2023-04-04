package com.example.apl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {
    private lateinit var timer:CountDownTimer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        timer = object : CountDownTimer(5_000,1_000){
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
            val intent = Intent(this@MainActivity , Second ::class.java)
                startActivity(intent)
                finish()
            }

        }.start(
        )
    }



}