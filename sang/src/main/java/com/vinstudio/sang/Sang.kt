package com.vinstudio.sang

import android.content.Context
import android.widget.Toast

object Sang{
    fun showMessage(context: Context,message: String){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show()
    }
}
