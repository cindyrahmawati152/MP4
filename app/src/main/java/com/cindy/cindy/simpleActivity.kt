package com.cindy.cindy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.cindy.cindy.R

class simpleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)

        val btn_back = findViewById<Button>(R.id.btn_beli)

        btn_back.setOnClickListener {
            val backIntent = Intent(this@simpleActivity,MainActivity::class.java)
            startActivity(backIntent)
        }

    }
}