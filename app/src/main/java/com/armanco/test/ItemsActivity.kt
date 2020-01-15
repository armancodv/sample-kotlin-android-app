package com.armanco.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_items.*

class ItemsActivity : AppCompatActivity() {
    val items = listOf<ItemModel>(
            ItemModel("First"),
            ItemModel("Second"),
            ItemModel("Third"),
            ItemModel("Fourth")
        )
    val adapter = ItemsAdapter(this, items)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)
        createObjectList()
    }

    private fun createObjectList() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }
}