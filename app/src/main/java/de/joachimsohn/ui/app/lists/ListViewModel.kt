package de.joachimsohn.ui.app.lists

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Lists Fragment"
    }
    val text: LiveData<String> = _text
}