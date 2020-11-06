package de.joachimsohn.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.*
import de.joachimsohn.R
import de.joachimsohn.ui.app.AppActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        tabLayout.tabGravity = GRAVITY_FILL
        val login = tabLayout.newTab()
        login.text = "Login"
        tabLayout.addTab(login)
        val register = tabLayout.newTab()
        register.text = "Register"
        tabLayout.addTab(register)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
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