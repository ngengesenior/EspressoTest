package com.apps.ngenge.espressotest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonLogin.setOnClickListener {
            if (username.text.isNotEmpty() && password.text.length >= 6)
            {
                startActivity(Intent(this@MainActivity,WelcomeActivity::class.java))
            }

            else{
                loginFailure.visibility = View.VISIBLE
                buttonLogin.visibility = View.INVISIBLE
            }
        }
    }
}
