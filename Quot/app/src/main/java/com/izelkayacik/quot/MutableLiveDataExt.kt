package com.izelkayacik.quot

import androidx.lifecycle.MutableLiveData

fun <T> MutableLiveData<T>.update(transform: T.() -> T){
    value = value!!.transform()
}

operator fun MutableLiveData<*>.invoke() = value!!