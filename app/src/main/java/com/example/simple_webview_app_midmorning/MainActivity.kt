package com.example.simple_webview_app_midmorning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btn_kcb:Button
    lateinit var btn_equity:Button
    lateinit var btn_caritas:Button
    lateinit var btn_family:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_kcb = findViewById(R.id.kcb_btn)
        btn_equity = findViewById(R.id.equity_btn)
        btn_caritas = findViewById(R.id.caritas_btn)
        btn_family = findViewById(R.id.family_btn)
    }
    btn_kcb.setOnClickListener {
        val gotokcbbank = Intent( this, ::class.java)
        startActivity(gotoanotheractivity)
    }
}