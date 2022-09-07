package com.websarva.wings.android.projectsheep

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

private const val NUM_TABS = 5

class TimeTableViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle):
    FragmentStateAdapter(fragmentManager, lifecycle){

    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return MondayFragment()
            1 -> return TuesdayFragment()
            2 -> return WednesdayFragment()
            3 -> return ThursdayFragment()
            4 -> return FridayFragment()
        }
        return MondayFragment()
    }
}