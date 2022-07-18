package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

// this kotlin file is where we'r going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // show the layout file : activity_main.xml
        setContentView(R.layout.activity_main)

        //use can tap a button to change the text color of the label.
        // 1 . add button to layout
        // Get a reference to button
        //2. set logical to know when user has tapped the button
        findViewById<Button>(R.id.button).setOnClickListener{
            // handle button tap
            Log.i("Ronglin","Tapped on button")
            // get a reference to the textview
            // set the color of textview
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }

        // user can tap a button to change the background color
        findViewById<Button>(R.id.button2).setOnClickListener {
            Log.i("Ronglin","Tapped on button")
            findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.purple_500))
        }
        // change the text
        findViewById<Button>(R.id.button3).setOnClickListener {

        }
    }
}