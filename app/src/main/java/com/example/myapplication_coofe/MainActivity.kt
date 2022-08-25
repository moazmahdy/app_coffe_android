package com.example.myapplication_coofe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var edittext:EditText
    lateinit var second_screem_textview_title:EditText
    lateinit var edittextrecyclerview:EditText
    lateinit var button_ok:Button
    lateinit var button_add:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edittext = findViewById(R.id.home_edit_text_title)
        button_ok = findViewById(R.id.home_edit_button_title)



        button_ok.setOnClickListener { view->

            if(edittext.toString().isEmpty()){
                edittext.error
                finish()
            }else if(!edittext.toString().isEmpty()){
                var tabble = edittext.text

                intent = Intent(this, Second_screen::class.java)
                startActivity(intent)
            }
        }


    }
}