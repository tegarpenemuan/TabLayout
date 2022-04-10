package com.tegarpenemuan.tablayout.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tegarpenemuan.tablayout.MainFragment
import com.tegarpenemuan.tablayout.R
import com.tegarpenemuan.tablayout.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Tab Fragment"

        if(savedInstanceState == null) {
            val fragment = MainFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainer, fragment, MainFragment::class.simpleName)
                .commit()
        }
    }
}