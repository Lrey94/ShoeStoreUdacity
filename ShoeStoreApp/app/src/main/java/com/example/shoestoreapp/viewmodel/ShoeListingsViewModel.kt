package com.example.shoestoreapp.viewmodel

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoe.model.Shoe

class ShoeListingsViewModel: ViewModel() {

    private val _shoeList = MutableLiveData<MutableList<Shoe>>()
    val shoeList: LiveData<MutableList<Shoe>> get() = _shoeList

    init {
        _shoeList.value = mutableListOf()
    }

    fun addShoeToShoeList(shoe: Shoe){
        _shoeList.value!!.add(shoe)
        Log.i("Contents of list in view model: ", _shoeList.value!!.size.toString())
    }

}