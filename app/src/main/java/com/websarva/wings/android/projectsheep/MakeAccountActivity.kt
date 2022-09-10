package com.websarva.wings.android.projectsheep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout

class MakeAccountActivity : AppCompatActivity() {
    private lateinit var emailTextInput: TextInputLayout
    private lateinit var emailEditText: EditText
    private lateinit var passwordTextInput: TextInputLayout
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_make_account)
        // タイトル非表示
        supportActionBar?.setDisplayShowTitleEnabled(false)
        // 戻るボタン表示
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // 新規登録ボタンが押されたら
    fun onMakeAccountButtonClick(view: View?) {
        val intent = Intent(this@MakeAccountActivity, SendEmailActivity::class.java)
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

    // EditTextの条件
    private fun setError() {
        if (emailEditText.text.isEmpty()) {
            emailTextInput.setError("メールアドレスを入力してください")
        }
        else if(!emailEditText.text.contains("planet.kanazawa-it.ac.jp") ||
                    !emailEditText.text.contains("st.kanazawa-it.ac.jp") ||
                            !emailEditText.text.contains("neptune.kanazawa-it.ac.jp")) {
                                emailTextInput.setError("大学で配布されるメールアドレスを入力してください")
                            }
        if (passwordEditText.text.isEmpty()) {
            passwordTextInput.setError("パスワードを入力してください")
        }
    }
}