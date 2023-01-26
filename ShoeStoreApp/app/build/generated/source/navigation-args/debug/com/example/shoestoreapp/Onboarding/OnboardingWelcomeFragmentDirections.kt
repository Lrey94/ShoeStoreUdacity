package com.example.shoestoreapp.Onboarding

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.shoestoreapp.R

public class OnboardingWelcomeFragmentDirections private constructor() {
  public companion object {
    public fun actionOnboardingFragmentToOnboardingInstructionsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_onboardingFragment_to_onboardingInstructionsFragment)
  }
}
