package com.tutorialsbuzz.viewmodelfactorysample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.tutorialsbuzz.viewmodelfactorysample.data.ApiHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViewModel()
        setUpObserver()

        update.setOnClickListener({
            viewModel.getUsersInfo()
        })

    }

    private fun setupViewModel() {
        viewModel = ViewModelProviders.of(
            this,
            ViewModelFactory(ApiHelper())
        ).get(MainViewModel::class.java)
    }

    private fun setUpObserver() {
        viewModel.userInfo.observe(this, {
            tvNumber.text = it
        })
    }

}