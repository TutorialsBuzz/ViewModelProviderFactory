package com.tutorialsbuzz.viewmodelfactorysample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tutorialsbuzz.viewmodelfactorysample.data.ApiHelper

class MainViewModel(private val apiHelper: ApiHelper) : ViewModel() {

    val userInfo = MutableLiveData<String>().apply { postValue("") }

    fun getUsersInfo() {
        userInfo.postValue(apiHelper.getUserInfo())
    }

}