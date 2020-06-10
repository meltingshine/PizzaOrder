package com.example.pizzaorder

import android.os.Bundle

class ViewStoreActivity : BaseActivity() {
    override fun setValues() {

    }

    override fun setupEvents() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store)
        setupEvents()
        setValues()
    }
}
