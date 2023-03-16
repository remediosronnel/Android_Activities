package com.remedios.first_application

import android.os.Bundle
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class CreateAccount: AppCompatActivity() {
    lateinit var checkBox:CheckBox
    var firstString:String = resources.getString(R.string.termsPrefix)
    var secondString:String = resources.getString(R.string.termsSuffix)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_account)
        checkBox.text = firstString + secondString

    }

    fun onClick(){

    }

}