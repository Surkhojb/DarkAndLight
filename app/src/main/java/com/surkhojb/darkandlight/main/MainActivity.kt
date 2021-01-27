package com.surkhojb.darkandlight.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.surkhojb.darkandlight.R
import com.surkhojb.darkandlight.common.BaseActivity

class MainActivity : BaseActivity() {

    override var layoutId: Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findViewById<Button>(R.id.btn_go_to_second).setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }
    }
}