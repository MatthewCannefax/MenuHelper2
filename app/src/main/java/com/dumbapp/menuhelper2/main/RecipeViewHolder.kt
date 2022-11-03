package com.dumbapp.menuhelper2.main

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dumbapp.menuhelper2.R
import com.dumbapp.menuhelper2.model.Recipe
import com.dumbapp.menuhelper2.ui.OnClickListenerGeneric

class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    lateinit var itemClickListener: OnClickListenerGeneric<Recipe>
    val name: TextView

    init {
        name = itemView.findViewById(R.id.name)
    }

    fun bind(recipe: Recipe) {
        name.text = recipe.name
        itemView.setOnClickListener { itemClickListener.onClick(recipe) }
    }

    fun setClickListener(clickListener: OnClickListenerGeneric<Recipe>): RecipeViewHolder {
        itemClickListener = clickListener
        return this
    }
}