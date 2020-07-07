package com.vidalbenjoe.ph.android.smarttablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems
import com.vidalbenjoe.ph.android.smarttablayout.fragments.FirstFragment
import com.vidalbenjoe.ph.android.smarttablayout.fragments.FourthFragment
import com.vidalbenjoe.ph.android.smarttablayout.fragments.SecondFragment
import com.vidalbenjoe.ph.android.smarttablayout.fragments.ThirdFragment
import kotlinx.android.synthetic.main.main_tab_layout.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_tab_layout)
        val adapter = FragmentPagerItemAdapter(
            supportFragmentManager, FragmentPagerItems.with(this)
                .add("First Fragment", FirstFragment::class.java)
                .add("Second Fragment", SecondFragment::class.java)
                .add("Third Fragment", ThirdFragment::class.java)
                .add("Fourth Fragment", FourthFragment::class.java)
                .create()
        )
        viewPager.adapter = adapter
        viewPagerTab.setViewPager(viewPager)
    }
}