package com.rakesh.clickeventmvvm;

import android.view.View;
import android.widget.Button;

import androidx.databinding.BindingAdapter;

public class MainActivityBindingAdapter {

    @BindingAdapter("onCustomBtnClick")
    public static void onCustomBtnClick(Button button, View.OnClickListener onClickListener) {
        button.setOnClickListener(onClickListener);
    }
}
