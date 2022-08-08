package com.example.birthdaygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
<<<<<<< HEAD
        //super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
=======
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
>>>>>>> dac50dda83992422b98cb406853c726676152501

        nextbutton.setOnClickListener{
            val intent = Intent(this,MiddleActivity::class.java)
            intent.putExtra("name",nametext.text.toString())
            startActivity(intent)
        }
    }




}
