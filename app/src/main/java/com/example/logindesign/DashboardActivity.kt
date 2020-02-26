package com.example.logindesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_verify.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        btnLogOut.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("You're trying to log out")
            builder.setMessage("Are you sure?")

            builder.setPositiveButton(android.R.string.yes) { dialog, which ->
                //Toast.makeText(applicationContext,
                //android.R.string.yes, Toast.LENGTH_SHORT).show()

                val intent = Intent(this, MainActivity::class.java)

                // start the next activity
                startActivity(intent)
            }

            builder.setNegativeButton(android.R.string.no) { dialog, which ->
                //Toast.makeText(applicationContext,
                //android.R.string.no, Toast.LENGTH_SHORT).show()
            }

            builder.show()
        }
    }
}
