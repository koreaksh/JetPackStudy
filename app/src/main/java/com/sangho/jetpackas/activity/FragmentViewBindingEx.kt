package com.sangho.jetpackas.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sangho.jetpackas.R
import com.sangho.jetpackas.databinding.ActivityFragmentViewBindingExBinding

class FragmentViewBindingEx : AppCompatActivity() {
    private val binding by lazy {ActivityFragmentViewBindingExBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}