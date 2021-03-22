package com.tutorialsbuzz.viewmodelfactorysample.data

class ApiHelper {
    fun getUserInfo(): String = (0..10).random().toString() + " Hello World"
}