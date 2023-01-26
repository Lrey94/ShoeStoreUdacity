package com.example.shoestoreapp.Onboarding

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.shoestoreapp.R

public class OnboardingInstructionsFragmentDirections private constructor() {
  public companion object {
    public fun actionOnboardingInstructionsFragmentToShoeListingsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_onboardingInstructionsFragment_to_shoeListingsFragment)
  }
}
