package com.example.simple_webview_app_midmorning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Equity_Bank : AppCompatActivity() {
    lateinit var Equity_B: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equity_bank)
        Equity_B = findViewById(R.id.Equity_Web)
        val webSettings = Equity_B.settings
        webSettings.javaScriptEnabled = true
        Equity_B.loadUrl("https://equity.com")
    }
}





