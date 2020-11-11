package de.joachimsohn.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.*
import de.joachimsohn.R
import de.joachimsohn.ui.app.AppActivity

class LoginActivity : AppCompatActivity() {

    private var indicatorWidth: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val indicator = findViewById<View>(R.id.tab_indicator)

        tabLayout.tabGravity = GRAVITY_FILL
        val login = tabLayout.newTab()
        login.text = "Login"
        tabLayout.addTab(login)
        val register = tabLayout.newTab()
        register.text = "Register"
        tabLayout.addTab(register)

        viewPager.adapter = TabAdapter(2, this, supportFragmentManager)
        tabLayout.setupWithViewPager(viewPager)
        viewPager.addOnPageChangeListener(TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: Tab) {
                viewPager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: Tab) {}
            override fun onTabReselected(tab: Tab) {}
        })

        tabLayout.post {
            indicatorWidth = tabLayout.width / tabLayout.tabCount
            val indicatorParams: FrameLayout.LayoutParams = indicator.layoutParams as FrameLayout.LayoutParams
            indicatorParams.width = indicatorWidth
            indicator.layoutParams = indicatorParams
        }

        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                val params = indicator.layoutParams as FrameLayout.LayoutParams

                //Multiply positionOffset with indicatorWidth to get translation
                val translationOffset: Float = (positionOffset + position) * indicatorWidth
                params.leftMargin = translationOffset.toInt()
                indicator.layoutParams = params
            }

            override fun onPageSelected(position: Int) {}

            override fun onPageScrollStateChanged(state: Int) {}

        })

    }

    fun login(view: View) {
        //TODO: some checking and show error if wrong
        if (true) {
            startActivity(Intent(this, AppActivity::class.java))
            finish()
        } else {
            //TODO: show some error on UI
        }
    }

}