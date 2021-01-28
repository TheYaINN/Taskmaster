package de.taskmaster.ui.app.list.editor

import android.view.View
import android.widget.DatePicker
import androidx.databinding.BindingAdapter
import de.taskmaster.R
import java.time.LocalDateTime

@BindingAdapter("dateOnClick")
fun onClick(view: View, daysAhead: Int) {
    val current = LocalDateTime.now()
    view.findViewById<DatePicker>(R.id.deadline_picker).updateDate(current.year, current.monthValue, current.dayOfMonth)
}
