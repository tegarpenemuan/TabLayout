package com.tegarpenemuan.tablayout.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.tegarpenemuan.tablayout.fragment.DuaFragment
import com.tegarpenemuan.tablayout.fragment.SatuFragment

class AdapterViewPagerFragment(fragment: Fragment) :
    FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 2

    //akan menghasilkan fragment yang ingin ditampilkan
    override fun createFragment(position: Int): Fragment {
        var fragment = Fragment()
        when(position) {
            0 -> fragment = SatuFragment()
            1 -> fragment = DuaFragment()
        }
        return fragment
    }
}