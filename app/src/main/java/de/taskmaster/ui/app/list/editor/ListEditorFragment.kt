package de.taskmaster.ui.app.list.editor

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.LinearLayout
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import de.taskmaster.R
import de.taskmaster.ui.app.SubFragment
import java.time.LocalDateTime

class ListEditorFragment : SubFragment(R.layout.fragment_list_edit) {

    val model = ListEditorViewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.recurring).setOnClickListener {
            findNavController().navigate(R.id.action_list_editor_to_repeatingEventFragment)
        }

        val pickerLayout = view.findViewById<LinearLayout>(R.id.deadline_picker_layout)
        val picker = view.findViewById<DatePicker>(R.id.deadline_picker)
        val deadlineDate = view.findViewById<TextView>(R.id.deadline_date)
        picker.setOnDateChangedListener { _, year, monthOfYear, dayOfMonth ->
            deadlineDate.text = "${dayOfMonth}/${monthOfYear}/${year}"
        }

        view.findViewById<Button>(R.id.date_today).setOnClickListener {
            val current = LocalDateTime.now()
            picker.updateDate(current.year, current.monthValue, current.dayOfMonth)
        }
        view.findViewById<Button>(R.id.date_tomorrow).setOnClickListener {
            val current = LocalDateTime.now().plusDays(1L)
            picker.updateDate(current.year, current.monthValue, current.dayOfMonth)
        }
        view.findViewById<Button>(R.id.date_next_week).setOnClickListener {
            val current = LocalDateTime.now().plusDays(7L)
            picker.updateDate(current.year, current.monthValue, current.dayOfMonth)
        }
        view.findViewById<Button>(R.id.deadline_button).setOnClickListener {
            pickerLayout.visibility = when (pickerLayout.visibility) {
                View.GONE -> View.VISIBLE
                View.VISIBLE -> View.GONE
                else -> error("not supposed to happen")
            }
        }

        view.findViewById<Button>(R.id.place).setOnClickListener {
            findNavController().navigate(R.id.action_list_editor_to_mapsFragment)
        }
    }

}