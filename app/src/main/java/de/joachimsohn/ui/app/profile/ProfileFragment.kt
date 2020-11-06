package de.joachimsohn.ui.app.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import de.joachimsohn.R
import de.joachimsohn.ui.NavigationHelper


class ProfileFragment : Fragment() {

    private lateinit var profileViewModel: ProfileViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        profileViewModel = ViewModelProviders.of(this).get(ProfileViewModel::class.java)
        return inflater.inflate(R.layout.fragment_profile_private, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val accountSettings = view.findViewById<Button>(R.id.account_settings)
        accountSettings.setOnClickListener { NavigationHelper.navigateToFragment(this, AccountSettings(), true) }
    }

}