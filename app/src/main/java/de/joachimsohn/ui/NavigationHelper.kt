package de.joachimsohn.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import de.joachimsohn.R

class NavigationHelper {

    companion object {

        fun navigateToFragment(oldFragment: Fragment, newFragment: Fragment, isSubFragment: Boolean) {
            replaceFragment(oldFragment, newFragment, R.anim.slide_out_left, R.anim.slide_in_right)
            //newFragment.supportActionBar?.setDisplayHomeAsUpEnabled(isSubFragment)
        }


        private fun replaceFragment(oldFragment: Fragment, newFragment: Fragment, inAnim: Int, outAnim: Int) {
            val fragmentManager = oldFragment.childFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.setCustomAnimations(inAnim, outAnim)
            fragmentTransaction.replace(R.id.container, newFragment)
            fragmentTransaction.addToBackStack(newFragment.toString())
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            fragmentTransaction.commit()
        }
    }

}
