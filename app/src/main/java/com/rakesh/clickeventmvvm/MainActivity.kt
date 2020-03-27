package com.rakesh.clickeventmvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.rakesh.clickeventmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var dataBinding : ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        dataBinding  = DataBindingUtil.setContentView(this,R.layout.activity_main)

        viewModel =  ViewModelProviders.of(this).get(MainActivityViewModel::class.java)

        dataBinding.mainVM = viewModel

        dataBinding.lifecycleOwner = this

    }

}
