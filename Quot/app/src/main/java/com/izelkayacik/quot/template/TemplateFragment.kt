package com.izelkayacik.quot.template

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.izelkayacik.quot.QuotViewModel
import com.izelkayacik.quot.databinding.FragmentTemplateBinding

class TemplateFragment : Fragment() {
    val viewModel: QuotViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentTemplateBinding.inflate(inflater)
        binding.viewModel = viewModel
        binding.viewBinding = TemplateViewBinding(viewModel)
        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }
}