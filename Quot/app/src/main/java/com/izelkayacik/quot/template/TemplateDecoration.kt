package com.izelkayacik.quot.template

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.izelkayacik.quot.R

class TemplateDecoration : ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val spacing = view.resources.getDimensionPixelSize(R.dimen.template_item_spacing)

        //kaçıncı item ı renderladıgımızı nasıl anlayacağız?
        val isFirstItem = parent.getChildAdapterPosition(view) == 0 // 0'sa ilk elemana eşittir

        with(outRect){
            if (isFirstItem) outRect.top = spacing

            left = spacing
            right = spacing
            bottom = spacing
        }
    }
}