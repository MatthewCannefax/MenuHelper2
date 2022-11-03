package com.dumbapp.menuhelper2.main

import androidx.recyclerview.widget.DiffUtil
import com.dumbapp.menuhelper2.model.Recipe

class RecipeDiffUtil : DiffUtil.ItemCallback<Recipe>() {
    override fun areItemsTheSame(oldItem: Recipe, newItem: Recipe): Boolean {
        return oldItem.hashCode() == newItem.hashCode()
    }

    override fun areContentsTheSame(oldItem: Recipe, newItem: Recipe): Boolean {
        return oldItem.equals(newItem)
    }
}