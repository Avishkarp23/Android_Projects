package com.example.birthdayapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.birthdayapp.Displaywish.Companion.name_extra

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun createbirthdaybutton(view:View){
        var editText:EditText = findViewById(R.id.nameInput)
        var name:String = editText.text.toString()
        val intent = Intent(this,Displaywish::class.java)
        intent.putExtra(name_extra,name)
        startActivity(intent)



    }
}