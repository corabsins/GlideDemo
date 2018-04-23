package com.corabsins.glide

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    val str:String = "http://img.taopic.com/uploads/allimg/120727/201995-120HG1030762.jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val iv = findViewById<View>(R.id.iv) as ImageView
        Glide.with(applicationContext).load(str).into(iv)

    }
}
