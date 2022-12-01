package com.example.login.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.login.R
import com.example.login.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding = ActivityHomeBinding.inflate(layoutInflater)

        binding.textView.text = "您还未激活，请输入激活码"
        setContentView(binding.root)
    }
}