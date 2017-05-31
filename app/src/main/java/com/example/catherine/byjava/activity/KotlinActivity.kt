package com.example.catherine.byjava.activity

import android.os.Bundle
import com.example.catherine.byjava.R
import com.example.catherine.byjava.utill.L
import kotlinx.android.synthetic.main.activity_kotlin.*

class KotlinActivity : BaseActivity() {

    override fun getArgs(bundle: Bundle?) {
    }

    override fun setView(): Int = R.layout.activity_kotlin
    override fun initView() {
        L.line("initview")
        btn.text = "Dot me ,dot me"
    }

    override fun setListener() {
        btn.setOnClickListener {
            var name = etName.text
            var password = etPassword.text
            val bundle = Bundle()
            bundle.putString("name", name.toString())
            bundle.putString("password", password.toString())
            L.line(name)
            L.line(password)
            startActivity(Kt02Activity::class.java, bundle)
        }
    }


}
