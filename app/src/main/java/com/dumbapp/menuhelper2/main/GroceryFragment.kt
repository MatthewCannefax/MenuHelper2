package com.dumbapp.menuhelper2.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dumbapp.menuhelper2.databinding.FragmentGroceryBinding

class GroceryFragment : Fragment() {

    private lateinit var binding: FragmentGroceryBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = FragmentGroceryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}