package com.example.catherine.byjava.activity


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.annotation.LayoutRes

abstract class BaseActivity : Activity() {
    lateinit var activity: Activity   //！！应该只是一个测试的方法

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getArgs(this.intent.extras)
        setContentView(setView())
        this.activity = this
        initView()
        setListener()
    }

    abstract fun getArgs(bundle: Bundle?)
    abstract fun setView(): Int
    abstract fun initView()
    abstract fun setListener()
    fun startActivity(className: Class<*>?, bundle: Bundle?) {
        this.startActivity(className, bundle, true)
    }

    fun startActivity(className: Class<*>?, bundle: Bundle?, isFinish: Boolean) {

        if (className != null) {
            if (!this.activity.isFinishing) {
                var intent = Intent()
                if (bundle != null) {
                    intent.putExtras(bundle)
                }
                intent.setClass(this.activity, className)
                startActivity(intent)
                if (isFinish) {
                    this.activity.finish()
                }

            }
        }

    }

}
