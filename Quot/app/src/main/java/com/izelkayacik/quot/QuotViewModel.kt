package com.izelkayacik.quot

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.izelkayacik.quot.template.Template
import com.izelkayacik.quot.template.templateList

class QuotViewModel : ViewModel(){
    val quote = MutableLiveData("")
    val author = MutableLiveData("")
    val book = MutableLiveData("")
    //TODO: replace empty list with an actual template list
    val templates = MutableLiveData(templateList)

//    //eventlerle uğraşmamak için tek satırda yazılmadı.
//    val authorCommaBook = MediatorLiveData<String>().apply {
//        addSource(author){
//            value = "${author.value!!}, ${book.value!!}"
//        }
//
//        addSource(book) {
//            value = "${author.value!!}, ${book.value!! }"
//        }
//
//    }


    fun onIntentWithTextExtra(textExtra: String) {
        quote.value = textExtra
    }
}