package com.example.pizzaorder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pizzaorder.adapter.FragmentAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    lateinit var myAdapter: FragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setValues() {
        myAdapter = FragmentAdapter(supportFragmentManager)
        orderViewPager.adapter = myAdapter
//
//        탭레이아웃과 뷰페이저를 연결
        mainTapLayout.setupWithViewPager(orderViewPager)
    }

    override fun setupEvents() {

    }

}
