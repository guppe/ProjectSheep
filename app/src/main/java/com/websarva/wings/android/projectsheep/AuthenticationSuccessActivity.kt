package com.websarva.wings.android.projectsheep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.Toolbar

class AuthenticationSuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication_success)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.setTitle(R.string.btMakeAccount)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // 次へボタンが押された場合
    fun onNextGradeButtonClick(view: View?) {
        val intent = Intent(this@AuthenticationSuccessActivity, SelectPositionActivity::class.java)
        startActivity(intent)
    }

    // 戻るボタンが押されたら
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var returnVal = true

        if(item.itemId == android.R.id.home) {
            finish()
        }
        else {
            returnVal = super.onOptionsItemSelected(item)
        }
        return returnVal
    }
}