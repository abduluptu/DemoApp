package com.sohainfotech.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        try {
            textView = findViewById(R.id.textView)
            var mValue = intent.getStringExtra("data")
            textView.text = mValue
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}