package com.example.simple_webview_app_midmorning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Caritas_Bank : AppCompatActivity() {
    lateinit var Caritas_B: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caritas_bank)
        Caritas_B = findViewById(R.id.Caritas_Web)
        val webSettings = Caritas_B.settings
        webSettings.javaScriptEnabled = true
        Caritas_B.loadUrl("https://caritas.com")

    }
}











