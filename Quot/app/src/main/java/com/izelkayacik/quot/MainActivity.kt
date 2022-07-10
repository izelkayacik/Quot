package com.izelkayacik.quot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handleIntent(intent)

    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)

        handleIntent(intent)
    }

    fun handleIntent(intent: Intent){
        println(intent?.action)
        println(intent?.type)
        println(intent?.getStringExtra(Intent.EXTRA_TEXT))

        if (intent?.action == Intent.ACTION_SEND && intent?.type == "text/plain"){
            intent.getStringExtra(Intent.EXTRA_TEXT)?.let {
                findViewById<TextView>(R.id.textView).text = it.split("\\n[\\r]?".toRegex())[0]
            }
        }
    }
}