package com.example.pizzaorder.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.pizzaorder.fragments.ChickenStoreListFragment
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
            else -> ChickenStoreListFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}