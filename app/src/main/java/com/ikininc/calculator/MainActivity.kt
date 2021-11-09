package com.ikininc.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_main)
    }

    fun onDigit(view: View){
        Toast.makeText(this, "Button works", Toast.LENGTH_LONG).show()
        tvInput.append("1")

    }
}