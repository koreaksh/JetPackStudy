package com.sangho.jetpackas.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sangho.jetpackas.R
import kotlinx.android.synthetic.main.activity_exam1.*
import kotlinx.android.synthetic.main.activity_exam2.*

// 기존에는 findViewById로 가져와서 사용했다
// kotlin Extensions < 구글에서 사용하지말라
// ViewBinding
// DataBinding   이것들을 사용해라

class Exam1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam1)

        // kotlin Extensions
        exam1_btn1.text = "abcd"
        exam1_btn2.text = "abcd"
        exam1_btn3.text = "abcd"

        //구글이 사용하지 말라고 했다. 그 이유는 아래코드를 실행시 문제가 생긴다

        //exam2_btn1.text = "abcd" < 다른 activity

    }
}