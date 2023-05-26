package com.example.myportfolio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EducationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        val Mait: Button =findViewById(R.id.MaitLink)

        Mait.setOnClickListener {
            val Mait = Intent(Intent.ACTION_VIEW)
            Mait.data= Uri.parse("https://mait.ac.in/")
            startActivity(Mait)
        }
    }
}