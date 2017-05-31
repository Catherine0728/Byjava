package com.example.catherine.byjava.activity

import android.os.Bundle
import android.widget.Button
import com.example.catherine.byjava.R
import com.example.catherine.byjava.utill.L
import kotlinx.android.synthetic.main.activity_kt02.*


class Kt02Activity : BaseActivity() {
    var name: String = ""
    var password: String = ""

    override fun getArgs(bundle: Bundle?) {
        if (bundle != null) {
            name = bundle.getString("name")
            password = bundle.getString("password")
            L.line(name)
            L.line(password)
        }
    }

    override fun setView() = R.layout.activity_kt02

    override fun initView() {
        tvName.text = name
        tvPassword.text = password

        val button=Button(this@Kt02Activity).apply {
            text="臭牛牛，点我"
        }


    }

    override fun setListener() {
    }
}
