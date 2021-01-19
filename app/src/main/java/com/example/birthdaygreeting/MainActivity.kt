package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

val key = "Name"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{

            var text = editText.text.toString()
            if(text == "") {
                Toast.makeText(this , "Enter a valid name" , Toast.LENGTH_SHORT).show()
            }
            else {
                var name = text
                var i = Intent(this , MainActivity2::class.java)
                i.putExtra(key , name)
                startActivity(i)
            }
        }

    }
}