package com.example.myportfolio

import android.content.Intent
import android.content.IntentFilter
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class SkillActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        val Linkdin: Button=findViewById(R.id.Linkdin)

        Linkdin.setOnClickListener {
            val Linkdin = Intent(Intent.ACTION_VIEW)
            Linkdin.data= Uri.parse("https://www.linkedin.com/in/shubhanshu-47a9401b0")
            startActivity(Linkdin)
        }

        //GitHub
        val Github: Button=findViewById(R.id.GitHub)

        Github.setOnClickListener {
            val Github = Intent(Intent.ACTION_VIEW)
            Github.data= Uri.parse("https://www.linkedin.com/in/shubhanshu-47a9401b0")
            startActivity(Github)
        }

        //Instagram
        val Instagram: Button=findViewById(R.id.Instagram)

        Instagram.setOnClickListener {
            val Instagram = Intent(Intent.ACTION_VIEW)
            Instagram.data= Uri.parse("https://instagram.com/vikash_kumar17?igshid=ZDdkNTZiNTM=")
            startActivity(Instagram)
        }

        //Youtube
        val Youtube: Button=findViewById(R.id.Youtube)

        Youtube.setOnClickListener {
            val Youtube = Intent(Intent.ACTION_VIEW)
            Youtube.data= Uri.parse("https://www.youtube.com/@4kxgaming806")
            startActivity(Youtube)
        }
    }
}