package com.example.app2026

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
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

        findViewById<Button>(R.id.btnView1).setOnClickListener {
            startActivity(Intent(this, View1Activity::class.java))
        }

        findViewById<Button>(R.id.btnView2).setOnClickListener {
            startActivity(Intent(this, View2Activity::class.java))
        }

        findViewById<Button>(R.id.btnView3).setOnClickListener {
            startActivity(Intent(this, View3Activity::class.java))
        }
    }
}