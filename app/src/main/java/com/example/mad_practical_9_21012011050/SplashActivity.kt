package com.example.mad_practical_9_21012011050

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.animation.AnimationSet
import android.view.animation.AnimationUtils
import android.view.animation.Animation
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    lateinit var logoanimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val logo1: ImageView = findViewById(R.id.logo1)

        logo1.setBackgroundResource(R.drawable.guni_logo_animation)
        logoanimation = logo1.background as AnimationDrawable;

        val myAnimation = AnimationUtils.loadAnimation(this, R.anim.twin_animation)
        logo1.startAnimation(myAnimation)

        // Add an animation listener to your animation
        myAnimation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {
            }

            override fun onAnimationEnd(animation: Animation) {
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
            }

            override fun onAnimationRepeat(animation: Animation) {
            }
        })
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            logoanimation.start()
        } else {
            logoanimation.stop()
        }
    }
}
