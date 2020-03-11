package com.example.logindesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard2.*
import kotlinx.android.synthetic.main.activity_dashboard2.ibMenu
import kotlinx.android.synthetic.main.activity_valuations.*

class ValuationsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_valuations)

        ibMenu.setOnClickListener{
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

        ibBack.setOnClickListener{
            val intent = Intent(this, Dashboard2Activity::class.java)
            startActivity(intent)
        }
    }
}
