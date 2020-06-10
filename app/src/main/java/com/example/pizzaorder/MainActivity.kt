package com.example.pizzaorder

import android.os.Bundle
import com.example.pizzaorder.adapters.StoreFragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    lateinit var myAdapter: StoreFragmentPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setValues() {
        myAdapter = StoreFragmentPagerAdapter(supportFragmentManager)
        storeViewPager.adapter = myAdapter
//
//        탭레이아웃과 뷰페이저를 연결
        mainTapLayout.setupWithViewPager(storeViewPager)
    }

    override fun setupEvents() {

    }

}
