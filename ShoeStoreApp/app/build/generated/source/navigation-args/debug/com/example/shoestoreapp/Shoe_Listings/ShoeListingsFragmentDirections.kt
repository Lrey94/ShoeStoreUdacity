package com.example.shoestoreapp.Shoe_Listings

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.shoestoreapp.R

public class ShoeListingsFragmentDirections private constructor() {
  public companion object {
    public fun actionShoeListingsFragmentToShoeDetailsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_shoeListingsFragment_to_shoeDetailsFragment)
  }
}
