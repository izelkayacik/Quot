package com.izelkayacik.quot.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.izelkayacik.quot.QuotViewModel
import com.izelkayacik.quot.databinding.FragmentInfoBinding

class InfoFragment: Fragment() {
    val viewModel: QuotViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentInfoBinding.inflate(inflater)

        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel

        setUpNextButton(binding)

        return binding.root
    }

    private fun setUpNextButton(binding: FragmentInfoBinding) {
        binding.nextButton.setOnClickListener {
            findNavController().navigate(InfoFragmentDirections.actionTemplate())
        }
    }
}