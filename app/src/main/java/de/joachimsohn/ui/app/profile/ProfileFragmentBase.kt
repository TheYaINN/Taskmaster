package de.joachimsohn.ui.app.profile

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import de.joachimsohn.R
import de.joachimsohn.ui.app.AppActivity

open class ProfileFragmentBase(private val resourceID: Int) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppActivity).supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            show()
        }
        setHasOptionsMenu(true)
        return inflater.inflate(resourceID, container, false)
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        (activity as AppActivity).supportActionBar?.setHomeAsUpIndicator(R.drawable.arrow_back)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                findNavController().popBackStack()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}