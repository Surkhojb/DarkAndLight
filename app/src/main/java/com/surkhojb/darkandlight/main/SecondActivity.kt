package com.surkhojb.darkandlight.main

import android.os.Bundle
import android.widget.Button
import com.surkhojb.darkandlight.R
import com.surkhojb.darkandlight.common.BaseActivity

class SecondActivity : BaseActivity() {
    override var layoutId: Int = R.layout.activity_second

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findViewById<Button>(R.id.btn_got_to_main).setOnClickListener {
            this.onBackPressed()
        }
    }

}