package com.example.shoestoreapp.Shoe_Details

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.shoestoreapp.MainActivity
import com.example.shoestoreapp.R
import com.example.shoestoreapp.databinding.FragmentShoeDetailsBinding
import com.example.shoestoreapp.model.Shoe
import com.example.shoestoreapp.viewmodel.ShoeListingsViewModel

class ShoeDetailsFragment : Fragment() {

    lateinit var binding: FragmentShoeDetailsBinding
    private val viewModel: ShoeListingsViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_details, container, false)
//        viewModel = ViewModelProvider(this)[ShoeListingsViewModel::class.java]

        binding.lifecycleOwner = this
        setClickListeners()
        watchForChanges()
        return binding.root
    }

    private fun createShoeFromInputs(): Shoe {
        val shoeNameString = binding.shoeNameEditText.text.toString()
        val shoeColourString = binding.shoeColourEditText.text.toString()
        val shoeMakerString = binding.shoeMakerEditText.text.toString()
        val shoeSizeString = binding.shoeSizeEditText.text.toString()

        return Shoe(shoeNameString, shoeColourString, shoeMakerString, shoeSizeString)
    }

    private fun setClickListeners(){
        binding.saveButtonShoeDetails.setOnClickListener{
            saveShoeToList(createShoeFromInputs())
        }

        binding.cancelButtonShoeDetails.setOnClickListener{
//            returnToList()
        }
    }

    private fun saveShoeToList(shoe: Shoe){
        if (validateFields()){
            viewModel.addShoeToShoeList(shoe)
        }
    }

    private fun validateFields(): Boolean{
        if (binding.shoeNameEditText.text.isEmpty()
            || binding.shoeColourEditText.text.isEmpty()
            || binding.shoeMakerEditText.text.isEmpty()
            || binding.shoeSizeEditText.text.isEmpty()){
            Toast.makeText(requireContext(), "Please complete all fields", Toast.LENGTH_SHORT).show()
            return false
        } else {
            return true
        }
    }

    private fun watchForChanges(){
        viewModel.shoeList.observe(viewLifecycleOwner) {
            Log.i("Contents of list: ", it.size.toString())
        }
        }

    private fun watchForChange(){
        viewModel.shoeList.observe(viewLifecycleOwner, Observer {  })
    }
}