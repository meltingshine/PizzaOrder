package com.example.pizzaorder

import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.pizzaorder.Datas.PizzaStore
import kotlinx.android.synthetic.main.activity_view_store.*

class ViewStoreActivity : BaseActivity() {

    lateinit var store:PizzaStore

    override fun setValues() {
        store = intent.getSerializableExtra("store") as PizzaStore

        Glide.with(mContext).load(store.logoUrl).into(logoImg)
        nameTxt.text = store.name
        phoneNumTxt.text = store.phoneNum
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
