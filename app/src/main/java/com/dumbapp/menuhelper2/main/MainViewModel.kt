package com.dumbapp.menuhelper2.main

import androidx.lifecycle.ViewModel
import com.dumbapp.menuhelper2.model.Recipe

class MainViewModel : ViewModel() {
    val recipes = ArrayList<Recipe>()
        get() {
            if (field.isEmpty()) {
                field.add(
                    Recipe(
                        "Cashew Chicken", "Chinese",
                        "Drive to HKI, order Cashew Chicken Special"
                    )
                )
                field.add(
                    Recipe(
                        "Orange Chicken", "Chinese",
                        "Drive to HKI, order Orange Chicken Special"
                    )
                )
                field.add(
                    Recipe(
                        "General Chicken", "Chinese",
                        "Drive to HKI, order General Chicken Special"
                    )
                )
                field.add(
                    Recipe(
                        "Tacos", "Mexican",
                        "Drive to Garcia's, order tacos"
                    )
                )
                field.add(
                    Recipe(
                        "Enchiladas", "Mexican",
                        "Drive to Garcia's, order enchiladas"
                    )
                )
                field.add(
                    Recipe(
                        "Fajitas", "Mexican",
                        "Drive to Garcia's, order Fajitas"
                    )
                )
            }
            return field;
        }
}