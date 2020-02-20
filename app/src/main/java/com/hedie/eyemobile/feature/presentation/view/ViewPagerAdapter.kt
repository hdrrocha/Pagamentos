package com.example.pagamentos

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tutorialwing.viewpager.CardsFirstFragment
import com.tutorialwing.viewpager.CardsSecondFragment


class ViewPagerAdapter internal constructor(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val COUNT = 2

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = CardsFirstFragment()
            1 -> fragment = CardsSecondFragment()

        }

        return fragment!!
    }

    override fun getCount(): Int {
        return COUNT
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "Tab " + (position + 1)
    }
}
