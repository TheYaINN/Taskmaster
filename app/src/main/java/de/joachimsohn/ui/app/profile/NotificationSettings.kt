package de.joachimsohn.ui.app.profile

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import de.joachimsohn.R
import de.joachimsohn.ui.app.AppActivity

class NotificationSettings : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        setHasOptionsMenu(true)
        return layoutInflater.inflate(R.layout.fragment_notification, container, false)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        (activity as AppActivity).supportActionBar?.setHomeAsUpIndicator(R.drawable.arrow_back)
    }

}