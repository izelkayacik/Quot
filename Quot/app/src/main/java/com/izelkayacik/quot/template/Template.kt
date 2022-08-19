package com.izelkayacik.quot.template

import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import com.izelkayacik.quot.R

data class Template(
    @LayoutRes val layoutId: Int,
    val isSelected: Boolean = false
) {
    val strokeWidth = when{
        isSelected -> R.dimen.card_stroke_width
        else -> R.dimen.zero
    }
}
