package com.dumbapp.menuhelper2.ui

fun interface OnClickListenerGeneric<T> {
    fun onClick(data: T)
}