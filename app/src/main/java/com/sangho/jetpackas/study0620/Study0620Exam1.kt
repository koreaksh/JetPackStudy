package com.sangho.jetpackas.study0620

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sangho.jetpackas.R
import com.sangho.jetpackas.databinding.ActivityStudy0620Exam1Binding

// DataBinding 과 ViewBinding 이랑 뭐가 다른가?
// 이름처럼 데이터를 연결해주는 역할을 할 수 있습니다.


class Study0620Exam1 : AppCompatActivity() {
    private lateinit var binding: ActivityStudy0620Exam1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_study0620_exam1)
    }
}