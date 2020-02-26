package com.example.logindesign

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_verify.*

class VerifyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        btnVerify.setOnClickListener{
            checkVerification()
        }
    }

    private fun checkVerification(){
        val codeEntered = etVerCode.text.toString()

        val validCode = "12345"

        if (codeEntered == validCode) {
            Toast.makeText(this, getString(R.string.verificationSuccess), Toast.LENGTH_LONG).show()

            val intent = Intent(this, DashboardActivity::class.java)

            startActivity(intent)
        }else{
            Toast.makeText(this,getString(R.string.verificationFailed), Toast.LENGTH_LONG).show()
        }
    }
}
