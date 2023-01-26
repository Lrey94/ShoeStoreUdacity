package com.example.shoestoreapp.Login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.shoestoreapp.R
import com.example.shoestoreapp.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        binding.loginButton.setOnClickListener{
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToOnboardingFragment())
        }

        binding.registerButton.setOnClickListener{
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToOnboardingFragment())
        }

        return binding.root
    }

    private fun onFinish(){
    }
}