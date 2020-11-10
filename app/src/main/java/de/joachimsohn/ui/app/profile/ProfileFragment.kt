package de.joachimsohn.ui.app.profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import de.joachimsohn.R
import de.joachimsohn.ui.login.LoginActivity


class ProfileFragment : Fragment() {

    private lateinit var profileViewModel: ProfileViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        profileViewModel = ViewModelProviders.of(this).get(ProfileViewModel::class.java)
        return inflater.inflate(R.layout.fragment_profile_private, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.account_settings).setOnClickListener {
            findNavController().navigate(R.id.action_navigation_profile_to_accountSettings)
        }

        view.findViewById<Button>(R.id.sign_out).setOnClickListener {
            startActivity(Intent(requireContext(), LoginActivity::class.java))
            requireActivity().finish()
        }

        view.findViewById<Button>(R.id.notifications).setOnClickListener {
            findNavController().navigate(R.id.action_navigation_profile_to_notificationSettings)
        }

    }

}