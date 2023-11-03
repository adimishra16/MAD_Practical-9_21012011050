package com.example.mad_practical_9_21012011050

import android.graphics.drawable.AnimationDrawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmanimation : AnimationDrawable
    lateinit var heartanimation : AnimationDrawable


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 : ImageView = findViewById(R.id.image1)
        image1.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmanimation = image1.background as AnimationDrawable

        val image2 : ImageView = findViewById(R.id.image2)
        image2.setBackgroundResource(R.drawable.heart_animation_list)
        heartanimation = image2.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if(hasFocus){
            alarmanimation.start()
            heartanimation.start()
        }
        else{
            alarmanimation.stop()
            heartanimation.stop()
        }
    }

}