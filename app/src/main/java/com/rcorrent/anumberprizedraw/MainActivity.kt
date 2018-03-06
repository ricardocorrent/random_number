package com.rcorrent.anumberprizedraw

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun generateNumber(view: View){

        Toast.makeText(this, "Clicked!", Toast.LENGTH_SHORT).show()

        //generate random numbers (max 11)
        var randNum = Random().nextInt(11)

        //to capture view component
        var nDisp = findViewById<TextView>(R.id.tvDisplay)

        //set display number in screen
        nDisp.setText("Number: $randNum")
    }
}
