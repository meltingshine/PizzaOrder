package com.example.pizzaorder

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    val mContext= this
    abstract fun setValues()
    abstract fun setupEvents()
}