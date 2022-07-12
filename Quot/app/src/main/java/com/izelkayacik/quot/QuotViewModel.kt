package com.izelkayacik.quot

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuotViewModel : ViewModel(){
    val state = MutableLiveData(
        QuotState(

        )
    )
}