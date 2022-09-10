package com.websarva.wings.android.projectsheep

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    private lateinit var emailTextInput: TextInputLayout
    private lateinit var emailEditText: EditText
    private lateinit var passwordTextInput: TextInputLayout
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // ActionBar非表示
        supportActionBar!!.hide()
    }

    // ログインボタンが押された場合
    fun onLoginButtonClick(view: View?) {
        val intent = Intent(this@LoginActivity, TimeTableActivity::class.java)
        startActivity(intent)
    }

    // 新規登録ボタンが押された場合
    fun onMakeAccountButtonClick(view: View?) {
        val intent = Intent(this@LoginActivity, MakeAccountActivity::class.java)
        startActivity(intent)
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