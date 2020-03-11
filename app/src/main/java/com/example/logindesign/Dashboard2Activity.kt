package com.example.logindesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard2.*

class Dashboard2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard2)

        ibMenu.setOnClickListener{
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

        rlValuations.setOnClickListener{
            val intent = Intent(this, ValuationsActivity::class.java)
            startActivity(intent)
        }
        mvSearchComp.setOnClickListener{
            val intent = Intent(this, SearchcompActivity::class.java)
            startActivity(intent)
        }
    }
}
