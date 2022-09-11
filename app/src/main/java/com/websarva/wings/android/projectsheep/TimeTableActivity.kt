package com.websarva.wings.android.projectsheep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.websarva.wings.android.projectsheep.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_time_table.*

class TimeTableActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val tabTitleArray = arrayOf(
        "月",
        "火",
        "水",
        "木",
        "金"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_table)



        val viewPager2: ViewPager2 = findViewById(R.id.viewPager2)
        val tabLayout: TabLayout = findViewById(R.id.tabLayout)

        viewPager2.adapter = TimeTableViewPagerAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = tabTitleArray[position]
        }.attach()

        topAppBar.setNavigationOnClickListener {
            drawerLayout.open()
        }

        navigationView.setNavigationItemSelectedListener {
            it.isChecked = true
            drawerLayout.close()
            true
        }
    }

    fun onMon1MapClick(view: View) {
        startActivity(Intent(this@TimeTableActivity, MapViewActivity::class.java))
    }
}