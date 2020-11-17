package de.taskmaster.ui.app.list.editor

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListEditorViewModel : ViewModel() {

    private val _title = MutableLiveData<String>().apply {
        value = "Gruppen"
    }
    val title: LiveData<String> = _title

}