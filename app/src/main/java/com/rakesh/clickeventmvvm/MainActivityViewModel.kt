package com.rakesh.clickeventmvvm

import android.view.View
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {


    private val _btnMessage = MutableLiveData("Message")

    var btnMessage : LiveData<String> = _btnMessage


    fun clickOnBtn(){

        _btnMessage.value = "!!!!!!!!! Click On Default Button !!!!!!!!!"
    }

    fun clickOnCustomBtn() : View.OnClickListener{

        return View.OnClickListener{view ->

            _btnMessage.value = view.context.resources.getString(R.string.msg_custom_btn)

        }
    }

    fun openToastMessage() : View.OnClickListener{

        return View.OnClickListener{view ->

            _btnMessage.value = view.context.resources.getString(R.string.msg_toast_btn)

            Toast.makeText(view.context,view.context.resources.getString(R.string.msg_toast_btn),Toast.LENGTH_LONG).show()

        }
    }




}