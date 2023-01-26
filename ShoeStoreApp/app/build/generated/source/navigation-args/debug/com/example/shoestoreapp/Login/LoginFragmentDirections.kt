package com.example.shoestoreapp.Login

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.shoestoreapp.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToOnboardingFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_onboardingFragment)
  }
}
