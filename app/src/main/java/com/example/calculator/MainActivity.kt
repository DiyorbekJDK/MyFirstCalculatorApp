package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numbers = 0

        val mytext: TextView=findViewById(R.id.mytext)
        val button1: Button=findViewById(R.id.button1)
        val button2: Button=findViewById(R.id.button2)
        val button3: Button=findViewById(R.id.button3)
        val button4: Button=findViewById(R.id.button4)
        val button5: Button=findViewById(R.id.button5)
        val button6: Button=findViewById(R.id.button6)
        val button7: Button=findViewById(R.id.button7)
        val button8: Button=findViewById(R.id.button8)
        val button9: Button=findViewById(R.id.button9)
        val button10: Button=findViewById(R.id.button10)
        val button11: Button=findViewById(R.id.button11)
        val button12: Button=findViewById(R.id.button12)
        val button13: Button=findViewById(R.id.button21)
        val button14: Button=findViewById(R.id.button22)
        val button15: Button=findViewById(R.id.button23)
        val button16: Button=findViewById(R.id.button24)


        button1.setOnClickListener {  }
    }
}