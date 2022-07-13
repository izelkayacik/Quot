package com.izelkayacik.quot

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuotViewModel : ViewModel(){
    val state = MutableLiveData(QuoteState())

    fun onIntentWithTextExtra(textExtra: String) {
        state.update {
            copy(quote = textExtra)
        }

        state()
    }
}