package de.joachimsohn.ui

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import de.joachimsohn.R
import de.joachimsohn.ui.app.home.HomeFragment
import de.joachimsohn.ui.login.LoginActivity

class NavigationHelper {


    companion object {
        fun home(activity: Activity) {
            navigateToFragment(
                activity as LoginActivity,
                HomeFragment(),
                R.anim.slide_in_bottom,
                R.anim.slide_out_top
            )
        }

        fun onStartReplace(activity: LoginActivity, fragment: Fragment) {
            navigateToFragment(activity, fragment, 0, 0)
        }

        private fun navigateToFragment(
            activity: LoginActivity,
            fragment: Fragment,
            inAnim: Int,
            outAnim: Int
        ) {
            val fragmentManager = activity.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.setCustomAnimations(inAnim, outAnim)
            fragmentTransaction.replace(R.id.container, fragment)
            fragmentTransaction.addToBackStack(fragment.toString())
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            fragmentTransaction.commit()
        }

        fun navigateDown(
            activity: Activity, fragment: Fragment
        ) {
            (activity as LoginActivity).supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_home_black_24dp)
            navigateToFragment(activity, fragment, R.anim.slide_in_top, R.anim.slide_out_bottom)
        }

    }

}
