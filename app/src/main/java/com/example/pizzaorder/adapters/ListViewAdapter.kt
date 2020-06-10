package com.example.pizzaorder.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class StudentAdapter(context: Context, resId: Int, list : List<>) : ArrayAdapter<Student>(context,resId,list) {


val mContext = context
val mList = list
val inf = LayoutInflater.from(mContext)

//뒤에 ? 찍은건 null일수도 있다는 뜻
override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
    var tempRow = convertView

    if (tempRow == null) {
        tempRow = inf.inflate(R.layout.student_list_item, null)
        //inflate는 xml을 실제로 그려서 객체로 만드는 것
        //if안에 들어왔다는건 돌려막을 convertView가 없다는 뜻.
        //inflate는 실제로 View를 만드는 것
    }

    // 요 temp를 활용하고 if를 쓰는 방식이 재활용하는 로직임.
    val row = tempRow!! // !! -> null이 절대 아니다 란 뜻.

}
