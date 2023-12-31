package com.example.pepebeem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.WindowCompat


class ProfileExpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_exp)

        WindowCompat.setDecorFitsSystemWindows(
            window,false
        )

        val editProfile = findViewById<Button>(R.id.editProfile)
        editProfile.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        val homeBtn = findViewById<ImageView>(R.id.homeBtn)
        homeBtn.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }

        val notificationbtn = findViewById<ImageView>(R.id.notificationbtn)
        notificationbtn.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
            finish()
        }

        val personalbtn = findViewById<TextView>(R.id.personalinfobtn)
        personalbtn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        val reviewbtn = findViewById<TextView>(R.id.reviewbtn)
        reviewbtn.setOnClickListener {
            val intent = Intent(this, ProfileReviewActivity::class.java)
            startActivity(intent)
            finish()
        }
    }}