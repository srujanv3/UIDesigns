package com.blogspot.svdevs.uidesigningpractise

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            window.statusBarColor = Color.TRANSPARENT

        }else {
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        }

        // Init animations
        val ttb = AnimationUtils.loadAnimation(applicationContext, R.anim.ttb)
        val btt = AnimationUtils.loadAnimation(applicationContext,R.anim.btt)



        // Init components
        val text = findViewById<TextView>(R.id.header_tv)
        val button = findViewById<Button>(R.id.button)

        text.startAnimation(ttb)
        button.startAnimation(btt)

        button.setOnClickListener {
            startActivity(Intent(this,FirstActivity::class.java))
        }

    }
}