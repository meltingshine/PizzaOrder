package com.example.pizzaorder

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.pizzaorder.Datas.PizzaStore
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import kotlinx.android.synthetic.main.activity_view_store.*
import java.util.jar.Manifest

class ViewStoreActivity : BaseActivity() {

    lateinit var store:PizzaStore

    override fun setValues() {
        store = intent.getSerializableExtra("store") as PizzaStore

        Glide.with(mContext).load(store.logoUrl).into(logoImg)
        nameTxt.text = store.name
        phoneNumTxt.text = store.phoneNum
    }

    override fun setupEvents() {
    callPhoneBtn.setOnClickListener{

        val permissionListener = object : PermissionListener{
            override fun onPermissionGranted() {
                val myUri = Uri.parse("tel:${store.phoneNum}")
                val myIntent =Intent(Intent.ACTION_CALL,myUri)
                startActivity(myIntent)
            }

            override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
             Toast.makeText(mContext,"권한 거부로 안도애ㅕㅁ",Toast.LENGTH_SHORT).show()

            }

        }

        TedPermission.with(mContext)
            .setPermissionListener(permissionListener)
            .setDeniedMessage("설정해야지")
            .setPermissions(android.Manifest.permission.CALL_PHONE)
            .check()
    }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store)
        setupEvents()
        setValues()
    }
}
