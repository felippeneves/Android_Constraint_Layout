package com.felippe_neves.android_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CoffeActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffe)
        hideToolbar()
    }

    private fun hideToolbar()
    {
        if(supportActionBar != null)
            supportActionBar!!.hide()
    }
}