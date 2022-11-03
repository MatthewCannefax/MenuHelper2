package com.dumbapp.menuhelper2.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.dumbapp.menuhelper2.R
import com.dumbapp.menuhelper2.model.Recipe
import com.dumbapp.menuhelper2.ui.OnClickListenerGeneric

class RecipeListAdapter(val clickListener: OnClickListenerGeneric<Recipe>) : ListAdapter<Recipe, RecipeViewHolder>(RecipeDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_recipe, parent, false))
            .setClickListener(clickListener)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}