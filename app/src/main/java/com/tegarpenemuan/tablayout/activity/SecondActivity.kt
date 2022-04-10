package com.tegarpenemuan.tablayout.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.tegarpenemuan.tablayout.R
import com.tegarpenemuan.tablayout.adapter.AdapterViewPager
import com.tegarpenemuan.tablayout.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private lateinit var adapterViewPager: AdapterViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Tab Activity"
        adapterViewPager = AdapterViewPager(supportFragmentManager,lifecycle)

        with(binding) {
            viewPager.adapter = adapterViewPager

            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                when(position) {
                    0 -> tab.text = "First Tab"
                    1 -> tab.text = "Second Tab"
                }
            }.attach()
        }
    }
}