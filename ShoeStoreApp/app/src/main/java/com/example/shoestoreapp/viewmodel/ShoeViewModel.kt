package com.example.shoestoreapp.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoe.model.Shoe

class ShoeViewModel: ViewModel() {

    private val _shoeList = MutableLiveData<List<Shoe>>()
    val shoeList: LiveData<List<Shoe>> get () =_shoeList

//    Blank variables set for data binding in shoe detail layout
    var shoeNameBlank = ""
    var shoeColourBlank = ""
    var shoeMakerBlank = ""
    var shoeSizeBlank = ""

    init {
        _shoeList.value = emptyList()
    }

    fun addShoeToShoeList(shoe: Shoe){
        _shoeList.value = _shoeList.value.orEmpty() + shoe
        Log.i("Contents of list in view model: ", _shoeList.value.orEmpty().size.toString())
    }
}