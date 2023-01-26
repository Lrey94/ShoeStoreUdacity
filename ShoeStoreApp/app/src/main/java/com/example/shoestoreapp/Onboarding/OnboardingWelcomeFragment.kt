package com.example.shoestoreapp.Onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.shoestoreapp.R
import com.example.shoestoreapp.databinding.FragmentLoginBinding
import com.example.shoestoreapp.databinding.FragmentOnboardingBinding

class OnboardingWelcomeFragment : Fragment() {

    lateinit var binding: FragmentOnboardingBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_onboarding, container, false)

        binding.instructionsButton.setOnClickListener{
            findNavController().navigate(OnboardingWelcomeFragmentDirections.actionOnboardingFragmentToOnboardingInstructionsFragment())
        }
        return binding.root
    }
}