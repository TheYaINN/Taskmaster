package de.taskmaster.ui.app.list.editor

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import de.taskmaster.R
import de.taskmaster.R.string.edit
import de.taskmaster.ui.app.SubFragment
import java.time.LocalDateTime

class ListEditorFragment : SubFragment(R.layout.fragment_list_edit) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val picker = view.findViewById<DatePicker>(R.id.deadline_picker)

        view.findViewById<Button>(R.id.date_today).setOnClickListener {
            val current = LocalDateTime.now()
            picker.updateDate(current.year, current.monthValue, current.dayOfMonth)
        }
        view.findViewById<Button>(R.id.date_tomorrow).setOnClickListener {
            val tomorrow = LocalDateTime.now().plusDays(1L)
            picker.updateDate(tomorrow.year, tomorrow.monthValue, tomorrow.dayOfMonth)
        }
        view.findViewById<Button>(R.id.date_next_week).setOnClickListener {
            val nextWeek = LocalDateTime.now().plusDays(7L)
            picker.updateDate(nextWeek.year, nextWeek.monthValue, nextWeek.dayOfMonth)
        }

        val test = view.findViewById<LinearLayout>(R.id.place_linearLayout)
        test.addView(TextView(context).apply { text = "FICKEEEEN" })

        val toggle = view.findViewById<TextView>(R.id.edit_deadline)
        toggle.setOnClickListener {
            val pickerLayout = view.findViewById<LinearLayout>(R.id.lower_deadline)
            pickerLayout.visibility = when (pickerLayout.visibility) {
                View.GONE -> {
                    toggle.text = getString(R.string.select)
                    View.VISIBLE
                }
                View.VISIBLE -> {
                    toggle.text = getString(edit)
                    View.GONE
                }
                else -> error("not supposed to happen")
            }
        }

        val toggle2 = view.findViewById<TextView>(R.id.edit_repeating)
        toggle2.setOnClickListener {
            val pickerLayout = view.findViewById<LinearLayout>(R.id.lower_repeating)
            pickerLayout.visibility = when (pickerLayout.visibility) {
                View.GONE -> {
                    toggle2.text = getString(R.string.select)
                    View.VISIBLE
                }
                View.VISIBLE -> {
                    toggle2.text = getString(edit)
                    View.GONE
                }
                else -> error("not supposed to happen")
            }
        }

        val toggle3 = view.findViewById<TextView>(R.id.edit_place)
        toggle3.setOnClickListener {
            val pickerLayout = view.findViewById<ScrollView>(R.id.lower_place)
            pickerLayout.visibility = when (pickerLayout.visibility) {
                View.GONE -> {
                    toggle3.text = getString(R.string.select)
                    View.VISIBLE
                }
                View.VISIBLE -> {
                    toggle3.text = getString(edit)
                    View.GONE
                }
                else -> error("not supposed to happen")
            }
        }

        val toggle4 = view.findViewById<TextView>(R.id.edit_group)
        toggle4.setOnClickListener {
            val pickerLayout = view.findViewById<LinearLayout>(R.id.lower_group)
            pickerLayout.visibility = when (pickerLayout.visibility) {
                View.GONE -> {
                    toggle4.text = getString(R.string.select)
                    View.VISIBLE
                }
                View.VISIBLE -> {
                    toggle4.text = getString(edit)
                    View.GONE
                }
                else -> error("not supposed to happen")
            }
        }
    }
}