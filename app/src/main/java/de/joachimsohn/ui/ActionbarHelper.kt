package de.joachimsohn.ui

import android.app.Activity
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import de.joachimsohn.R
import de.joachimsohn.ui.app.AppActivity

class ActionbarHelper {

    companion object {

        fun navigateUp(v: Boolean, view: View) {
            val actionBar = view.findViewById<Toolbar>(R.id.actionbar)
            //TODO:
            // 1. no home action
            // 2. inflate with correct menu depending on the view (use when case below)
            when (v) {
                v -> println("2")
                !v -> print("1")
                else -> print("help 2")
            }
        }

        fun navigateDown() {
            //TODO:
            // 1. back arrow action
            // 2. inflate with correct menu depending on the view (use when case below)
//            (activity as MainActivity).getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_left)
        }

        fun replaceFragment(activity: Activity, inAnim: Int, outAnim: Int, newFragment: Fragment) {
            val fragmentManager: FragmentManager = (activity as AppActivity).supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.setCustomAnimations(inAnim, outAnim)
            fragmentTransaction.replace(R.id.nav_host_fragment, newFragment)
            fragmentTransaction.addToBackStack(newFragment.toString())
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            fragmentTransaction.commit()
        }

    }

}
