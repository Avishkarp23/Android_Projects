package com.example.birthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Displaywish : AppCompatActivity() {
    companion object{
        const val name_extra="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_displaywish)
        val name = intent.getStringExtra(name_extra)
        var textView:TextView=findViewById(R.id.hbd)
        textView.text="Happy Birthday \n $name"


    }

}