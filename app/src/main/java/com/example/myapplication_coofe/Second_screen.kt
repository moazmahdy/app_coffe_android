package com.example.myapplication_coofe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

lateinit var bottomNavigationView:BottomNavigationView
lateinit var textviewe_second_screen : TextView

class Second_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)
        textviewe_second_screen = findViewById(R.id.second_screem_textview_title)
        DataClass.textView = findViewById(R.id.second_screem_textview_title)
        textviewe_second_screen.text = DataClass.textView.text.toString()
        bottomNavigationView = findViewById(R.id.second_screem_bottomnavigation_title)
        bottomNavigationView.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.hot_drinks_title) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Fragment_hot_drinks()).commit()
            }else if (item.itemId == R.id.cold_drinks_title){
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Fragment_cold_deins()).commit()
            }else if (item.itemId == R.id.sweets_title) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Fragment_sweets()).commit()
            }
            return@setOnItemSelectedListener true
        }
    }
}