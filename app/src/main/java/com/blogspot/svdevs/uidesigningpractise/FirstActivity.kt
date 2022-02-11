package com.blogspot.svdevs.uidesigningpractise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val btt = AnimationUtils.loadAnimation(this, R.anim.btt)
        val ltr = AnimationUtils.loadAnimation(this, R.anim.ltr)
        val rtl = AnimationUtils.loadAnimation(this, R.anim.rtl)
        val scale_fade_in = AnimationUtils.loadAnimation(this, R.anim.scale_fade_in)

        val tv1 = findViewById<TextView>(R.id.tv1)
        val tv2 = findViewById<TextView>(R.id.tv2)
        val tv3 = findViewById<TextView>(R.id.tv3)
        val tv4 = findViewById<TextView>(R.id.tv4)

        val btn1 = findViewById<Button>(R.id.button2)
        val btn2 = findViewById<Button>(R.id.button3)

        val imageView = findViewById<ImageView>(R.id.imageView01)

        tv1.startAnimation(ltr)
        tv3.startAnimation(ltr)

        tv2.startAnimation(rtl)
        tv4.startAnimation(rtl)

        btn1.startAnimation(btt)
        btn2.startAnimation(btt)

        imageView.startAnimation(scale_fade_in)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}