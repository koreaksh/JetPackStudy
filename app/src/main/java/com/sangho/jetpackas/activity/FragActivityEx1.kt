package com.sangho.jetpackas.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.sangho.jetpackas.R
import com.sangho.jetpackas.databinding.ActivityFragEx1Binding
import com.sangho.jetpackas.fragment.Fragment1

class FragActivityEx1 : AppCompatActivity() {
    private val binding by lazy { ActivityFragEx1Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager.commit {
            replace(R.id.FragActivityEx1_frame, Fragment1())
            setReorderingAllowed(true)
            addToBackStack("")
        }
    }
}