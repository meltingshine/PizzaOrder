package com.example.pizzaorder.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.pizzaorder.fragments.ChickenFragment
import com.example.pizzaorder.fragments.PizzaStoreListFragment

class FragmentAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "피자 주문"
            else -> "치킨 주문"
        }
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> PizzaStoreListFragment()
            else -> ChickenFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}