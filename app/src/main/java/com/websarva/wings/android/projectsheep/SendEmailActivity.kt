package com.websarva.wings.android.projectsheep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View

class SendEmailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_email)

        supportActionBar?.title = "新規登録"
        // 戻るボタン表示
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // 新規登録ボタンが押された場合
    fun onNextGradeButtonClick(view: View?) {
        val intent = Intent(this@SendEmailActivity, SelectPositionActivity::class.java)
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