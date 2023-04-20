package com.example.simple_webview_app_midmorning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class KCB_Bank : AppCompatActivity() {
    lateinit var KCB_B:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kcb_bank)
        KCB_B = findViewById(R.id.KCB_Web)
        val webSettings = KCB_B.settings
        webSettings.javaScriptEnabled = true
        KCB_B.loadUrl("https://kcb.com")
    }
}






