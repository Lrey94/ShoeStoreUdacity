package com.example.shoestoreapp.Shoe_Details

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.shoestoreapp.R

public class ShoeDetailsFragmentDirections private constructor() {
  public companion object {
    public fun actionShoeDetailsFragmentToShoeListingsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_shoeDetailsFragment_to_shoeListingsFragment)
  }
}
