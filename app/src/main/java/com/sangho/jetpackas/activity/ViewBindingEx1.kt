package com.sangho.jetpackas.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sangho.jetpackas.R
import com.sangho.jetpackas.databinding.ActivityViewBindingEx1Binding

class ViewBindingEx1 : AppCompatActivity() {
    private val binding by lazy { ActivityViewBindingEx1Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.run {
            viewBindingEx1Tv.text = "이거는 변경된 텍스트"
            viewBindingEx1Tv.setOnClickListener {
                startActivity(Intent(this@ViewBindingEx1, FragActivityEx1::class.java))
            }
        }
    }
}