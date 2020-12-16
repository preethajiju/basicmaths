package com.example.basicmathsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun additionevent(view: View) {
intent= Intent(this,AdditionActivity::class.java)
        startActivity(intent)

    }

    fun subtractionevent(view: View) {
intent= Intent(this,SubtractActivity::class.java)
        startActivity(intent)
    }

    fun multiplyevent(view: View) {
intent= Intent(this,MultiplyActivity::class.java)
        startActivity(intent)
    }

    fun divisionevent(view: View) {
intent= Intent(this,DivisionActivity::class.java)
        startActivity(intent)
    }
}