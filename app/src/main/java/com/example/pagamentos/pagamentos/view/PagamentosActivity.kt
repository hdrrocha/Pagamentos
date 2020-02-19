package com.example.pagamentos.pagamentos.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.pagamentos.R
import com.example.pagamentos.ViewPagerAdapter
import me.relex.circleindicator.CircleIndicator

class PagamentosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagamentos)

        val indicator = findViewById<CircleIndicator>(R.id.indicator)



//
        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        if (viewPager != null) {
            val adapter = ViewPagerAdapter(supportFragmentManager)
            viewPager.adapter = adapter

        }
        indicator.setViewPager(viewPager)

    }
}
