package com.example.whitelabelexample.common.ext

import android.app.Activity
import androidx.annotation.DrawableRes
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import com.example.whitelabelexample.R

fun Toolbar.initBackButton(activity: Activity?, @DrawableRes iconRes: Int = R.drawable.ic_back){
    val backDrawable = ContextCompat.getDrawable(context!!, iconRes)!!.mutate()
    val activeColor = ContextCompat.getColor(context!!, R.color.active)
    DrawableCompat.setTint(backDrawable, activeColor)
    navigationIcon = backDrawable
    setNavigationOnClickListener { activity?.onBackPressed() }
}
