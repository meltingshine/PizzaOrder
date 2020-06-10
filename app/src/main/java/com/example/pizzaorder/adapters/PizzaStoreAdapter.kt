package com.example.pizzaorder.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.pizzaorder.Datas.PizzaStore
import com.example.pizzaorder.R

class PizzaStoreAdapter(
    val mContext: Context,
    val resId: Int,
    val list: List<PizzaStore>
) : ArrayAdapter<PizzaStore>(mContext, resId, list) {


    val inf = LayoutInflater.from(mContext)

    //뒤에 ? 찍은건 null일수도 있다는 뜻
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        tempRow?.let {
        }.let {
            tempRow = inf.inflate(R.layout.pizza_store_list_item,null)
        }
        val row = tempRow!!

        val logoImg = row.findViewById<ImageView>(R.id.logoImg)
        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)

        val data = list[position]
        nameTxt.text = data.name
        Glide.with(mContext).load(data.logoUrl).into(logoImg)

        return row


    }
    }
