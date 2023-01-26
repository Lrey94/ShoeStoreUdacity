package com.example.shoestoreapp.Shoe_Listings

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.shoestoreapp.R
import com.example.shoestoreapp.viewmodel.ShoeListingsViewModel
import com.example.shoestoreapp.databinding.FragmentShoeListingsBinding
import com.example.shoestoreapp.model.Shoe
import kotlinx.android.synthetic.main.shoe_list_item.view.*

class ShoeListingsFragment : Fragment() {

    lateinit var binding: FragmentShoeListingsBinding
    private lateinit var viewModel: ShoeListingsViewModel
    private lateinit var newShoe: Shoe

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_listings, container, false)
        val view = layoutInflater.inflate(R.layout.shoe_list_item, null)
        binding.shoeItems.addView(view.listItemTextView)
        viewModel = ViewModelProvider(this)[ShoeListingsViewModel::class.java]

        binding.fabAddShoe.setOnClickListener{
            it.findNavController().navigate(R.id.action_shoeListingsFragment_to_shoeDetailsFragment)
        }
        viewModel.shoeList.observe(viewLifecycleOwner){
            binding.shoeItems.removeAllViews()
            for (x in it){

            }
        }
        return binding.root
    }


}