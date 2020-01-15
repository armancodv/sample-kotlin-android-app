package com.armanco.test.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.armanco.test.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showBundleMessage()
    }

    private fun showBundleMessage() {
        val bundle : Bundle? = intent.extras
        val message = bundle!!.getString("message")
        tvMessage.text = message
    }
}