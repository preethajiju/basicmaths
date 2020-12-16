package com.example.basicmathsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SubtractActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subtract)
    }

    fun subevent(view: View) {
        var getNum1=findViewById<EditText>(R.id.num1)
        var getNum2=findViewById<EditText>(R.id.num2)
        var res=getNum1.text.toString().toInt()-getNum2.text.toString().toInt()
        var result=findViewById<TextView>(R.id.myresult)
        result.text=res.toString()
//        Toast.makeText(this,res.toString(),Toast.LENGTH_LONG).show()
    }

    fun loginevent(view: View) {
intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}