package com.izelkayacik.quot.template

import com.izelkayacik.quot.QuotViewModel

class TemplateViewBinding(private val viewModel: QuotViewModel) {
    val adapter = TemplateAdapter(viewModel)
    val itemDecoration = TemplateDecoration()
}