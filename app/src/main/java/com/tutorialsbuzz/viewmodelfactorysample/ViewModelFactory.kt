package com.tutorialsbuzz.viewmodelfactorysample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tutorialsbuzz.viewmodelfactorysample.data.ApiHelper

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(apiHelper) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}