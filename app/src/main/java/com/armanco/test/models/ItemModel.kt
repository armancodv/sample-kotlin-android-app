package com.armanco.test.models

data class ItemModel(val title: String) {
    companion object {
        val items = listOf(
            ItemModel("First"),
            ItemModel("Second"),
            ItemModel("Third"),
            ItemModel("Fourth")
        )
    }
}