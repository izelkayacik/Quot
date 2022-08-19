package com.izelkayacik.quot.template

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.izelkayacik.quot.QuotViewModel
import com.izelkayacik.quot.R
import com.izelkayacik.quot.databinding.ItemTemplateBinding

class TemplateAdapter(private val viewModel: QuotViewModel) :
    ListAdapter<Template,
            TemplateAdapter.TemplateHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TemplateHolder {
        val binding: ItemTemplateBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_template,
            parent,
            false
        )

        return TemplateHolder(binding, viewModel)
    }

    override fun onBindViewHolder(holder: TemplateHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class TemplateHolder(private val binding: ItemTemplateBinding, private val viewModel: QuotViewModel) : ViewHolder(binding.root) {
        fun bind(template: Template) {
            binding.item = template
            binding.viewModel = viewModel
            binding.executePendingBindings()
        }
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Template>() {
            override fun areItemsTheSame(oldItem: Template, newItem: Template) =
                oldItem.layoutId == newItem.layoutId

            override fun areContentsTheSame(oldItem: Template, newItem: Template) =
                oldItem == newItem

        }
    }
}