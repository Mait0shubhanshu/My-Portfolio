package com.example.myportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSkill = findViewById<Button>(R.id.btnSkill)
        val btnEducation = findViewById<Button>(R.id.btnEducation)
        val btnWork = findViewById<Button>(R.id.btnWork)
        val btnAchievements = findViewById<Button>(R.id.btnAchievements)

        buttonSkill.setOnClickListener {
            intent = Intent(this, SkillActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Skill Section Open", Toast.LENGTH_LONG).show()
        }
        btnEducation.setOnClickListener {
            intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Education Section Open", Toast.LENGTH_LONG).show()
        }

        btnWork.setOnClickListener {
            intent = Intent(this, WorkActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Work Section Open", Toast.LENGTH_LONG).show()
        }
        btnAchievements.setOnClickListener {
            intent = Intent(this, AchievementsActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Achievements Section Open", Toast.LENGTH_LONG).show()
        }
    }

    }

