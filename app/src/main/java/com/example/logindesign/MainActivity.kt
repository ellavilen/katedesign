package com.example.logindesign

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSignIn.setOnClickListener{
            checkAnswer()
        }
    }

    private fun checkAnswer() {
        val usernameEntered = etName.text.toString()
        val passwordEntered = etPassword.text.toString()

        val validUsername = ""
        val validPassword = ""

        if (usernameEntered == validUsername && passwordEntered == validPassword) {
            Toast.makeText(this,getString(R.string.LoginSuccess), Toast.LENGTH_LONG).show()
            val intent = Intent(this, VerifyActivity::class.java)

            startActivity(intent)
        } else if (usernameEntered != validUsername && passwordEntered == validPassword){
            Toast.makeText(this, getString(R.string.UsernameWrong), Toast.LENGTH_LONG).show()
        } else if (usernameEntered == validUsername && passwordEntered != validPassword){
            Toast.makeText(this, getString(R.string.PasswordWrong), Toast.LENGTH_LONG).show()
        } else if (usernameEntered != validUsername && passwordEntered != validPassword){
            Toast.makeText(this, getString(R.string.AllWrong), Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this,getString(R.string.LoginFailed), Toast.LENGTH_LONG).show()
        }
    }
}
