package com.websarva.wings.android.projectsheep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TimeTableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_table)
    }

    fun onButtonClick(view: View?) {
        val intent = Intent(this@TimeTableActivity, LoginActivity::class.java)
        startActivity(intent)
    }
}