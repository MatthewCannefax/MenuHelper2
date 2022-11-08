package com.dumbapp.menuhelper2.main

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.dumbapp.menuhelper2.R
import com.dumbapp.menuhelper2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }

        binding.cookbookButton.setOnClickListener { handleCookbookClick() }
        binding.menuButton.setOnClickListener { handleMenuClick() }
        binding.groceryButton.setOnClickListener { handleGroceryClick() }
    }

    private fun handleGroceryClick() {

    }

    private fun handleMenuClick() {

    }

    private fun handleCookbookClick() {

    }
}