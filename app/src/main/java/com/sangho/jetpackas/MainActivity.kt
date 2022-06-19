package com.sangho.jetpackas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sangho.jetpackas.activity.Exam1Activity
import com.sangho.jetpackas.activity.ViewBindingEx1
import com.sangho.jetpackas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.run {
            mainGoBtn.setOnClickListener {
                startActivity(Intent(this@MainActivity, ViewBindingEx1::class.java))
            }
        }
    }
}