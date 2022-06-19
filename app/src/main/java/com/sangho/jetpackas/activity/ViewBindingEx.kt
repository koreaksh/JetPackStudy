package com.sangho.jetpackas.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sangho.jetpackas.R
import com.sangho.jetpackas.databinding.ActivityViewBindingExBinding

class ViewBindingEx : AppCompatActivity() {

    private val binding by lazy { ActivityViewBindingExBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.run {
            viewBindingExTv.text = "뷰바인딩에 의해 변경된 텍스트"
            viewBindingExTv.setOnClickListener {
                startActivity(Intent(this@ViewBindingEx, FragmentViewBindingEx::class.java))
            }
        }
    }
}