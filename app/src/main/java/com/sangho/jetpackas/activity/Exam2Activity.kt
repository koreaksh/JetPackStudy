package com.sangho.jetpackas.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sangho.jetpackas.R
import kotlinx.android.synthetic.main.activity_exam2.*

class Exam2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam2)

        exam2_btn1.text = "abcd"
    }
}