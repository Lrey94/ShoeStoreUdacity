package com.example.shoestoreapp.Shoe_Listings

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.shoestoreapp.R
import com.example.shoestoreapp.viewmodel.ShoeViewModel
import com.example.shoestoreapp.databinding.FragmentShoeListingsBinding
import kotlinx.android.synthetic.main.shoe_list_item.view.*

class ShoeListingsFragment : Fragment() {

    lateinit var binding: FragmentShoeListingsBinding
    private val viewModel: ShoeViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_listings, container, false)

        viewModel.shoeList.observe(viewLifecycleOwner){
            binding.shoeItems.removeAllViews()
            for (shoe in it){
                addShoeToList(shoe.shoeName)
            }
        }

        binding.fabAddShoe.setOnClickListener{
            it.findNavController().navigate(R.id.action_shoeListingsFragment_to_shoeDetailsFragment)
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    private fun addShoeToList(shoeName: String){
        val listView = layoutInflater.inflate(R.layout.shoe_list_item, null)
        listView.listItemShoeName.text = shoeName
        binding.shoeItems.addView(listView.listItemShoeName)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_logout, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        findNavController().navigate(R.id.action_shoeListingsFragment_to_loginFragment)
        return super.onOptionsItemSelected(item)
    }
}