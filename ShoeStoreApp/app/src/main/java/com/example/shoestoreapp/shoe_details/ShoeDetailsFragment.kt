package com.example.shoestoreapp.shoe_details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.shoe.model.Shoe
import com.example.shoestoreapp.R
import com.example.shoestoreapp.databinding.FragmentShoeDetailsBinding
import com.example.shoestoreapp.viewmodel.ShoeViewModel

class ShoeDetailsFragment : Fragment() {

    lateinit var binding: FragmentShoeDetailsBinding
    private val viewModel: ShoeViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_details, container, false)

        setClickListeners()
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
            findNavController().navigate(R.id.action_shoeDetailsFragment_to_shoeListingsFragment)
        }
    }

    private fun saveShoeToList(shoe: Shoe){
        if (validateFields()){
            viewModel.addShoeToShoeList(shoe)
        }
    }

    private fun validateFields(): Boolean{
        return if (binding.shoeNameEditText.text.isEmpty()
            || binding.shoeColourEditText.text.isEmpty()
            || binding.shoeMakerEditText.text.isEmpty()
            || binding.shoeSizeEditText.text.isEmpty()){
            Toast.makeText(requireContext(), "Please complete all fields", Toast.LENGTH_SHORT).show()
            false
        } else {
            true
        }
    }



}