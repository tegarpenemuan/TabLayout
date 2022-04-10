package com.tegarpenemuan.tablayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tegarpenemuan.tablayout.activity.SecondActivity
import com.tegarpenemuan.tablayout.activity.ThirdActivity
import com.tegarpenemuan.tablayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupListener()
    }

    private fun setupListener() {
        binding.btnActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        binding.btnFragment.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
    }
}