package com.example.pizzaorder

import android.os.Bundle
import com.example.pizzaorder.adapters.StoreFragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    lateinit var storePagerAdapter: StoreFragmentPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setValues() {
        storePagerAdapter = StoreFragmentPagerAdapter(supportFragmentManager)
        storeViewPager.adapter = storePagerAdapter
        myTabLayout.setupWithViewPager(storeViewPager)

    }

    override fun setupEvents() {

    }

}
