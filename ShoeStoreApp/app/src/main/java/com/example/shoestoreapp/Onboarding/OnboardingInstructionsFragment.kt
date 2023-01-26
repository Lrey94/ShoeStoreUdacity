package com.example.shoestoreapp.Onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.shoestoreapp.R
import com.example.shoestoreapp.databinding.FragmentOnboardingBinding
import com.example.shoestoreapp.databinding.FragmentOnboardingInstructionsBinding

class OnboardingInstructionsFragment : Fragment() {

    lateinit var binding: FragmentOnboardingInstructionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_onboarding_instructions,
            container,
            false
        )

        binding.instructionsTextview.text = getString(R.string.instructions_body)

        binding.shoeListingsButton.setOnClickListener{
            findNavController().navigate(OnboardingInstructionsFragmentDirections.actionOnboardingInstructionsFragmentToShoeListingsFragment())
        }

        return binding.root
    }
}