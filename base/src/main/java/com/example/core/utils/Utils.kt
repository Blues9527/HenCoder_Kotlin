package com.example.core.utils

import android.content.res.Resources
import android.util.TypedValue
import android.widget.Toast
import com.example.core.BaseApplication
import com.example.core.BaseApplication.Companion.currentApplication

object Utils {
    private val displayMetrics = Resources.getSystem().displayMetrics

    fun Float.dp2px() = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this, displayMetrics)

    @JvmOverloads
    fun toast(string: String?, duration: Int = Toast.LENGTH_SHORT) = Toast.makeText(BaseApplication.currentApplication, string, duration).show()
}