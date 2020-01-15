package com.armanco.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        eventListeners()
    }

    private fun eventListeners() {
        btnToast.setOnClickListener {
            btnToastClick()
        }
        btnActivity.setOnClickListener {
            btnActivityClick()
        }
        btnOtherApp.setOnClickListener {
            btnOtherAppClick()
        }
        btnRecyclerView.setOnClickListener {
            btnRecyclerViewClick()
        }
    }

    private fun btnToastClick() {
        val message = etMessage.text.toString()
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun btnActivityClick() {
        val message = etMessage.text.toString()
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("message", message)
        startActivity(intent)
    }

    private fun btnOtherAppClick() {
        val message = etMessage.text.toString()
        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.putExtra(Intent.EXTRA_TEXT, message)
        intent.type = "text/plain"
        startActivity(Intent.createChooser(intent, "Share to:"))
    }

    private fun btnRecyclerViewClick() {
        val intent = Intent(this, ItemsActivity::class.java)
        startActivity(intent)
    }

}
