package com.dumbapp.menuhelper2.model

data class Recipe(val name: String = "", val category: String = "", val directions: String = "",
                  val ingredients: List<Ingredient> = ArrayList())
