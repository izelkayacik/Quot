package com.izelkayacik.quot

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

@Suppress("UNCHECKED_CAST")
@BindingAdapter("items", "adapter")
fun <T, VH: ViewHolder> RecyclerView.items(items: List<T>?, listAdapter: ListAdapter<T, VH>?){
    if(items == null || listAdapter == null) return
    if(adapter == null) adapter = listAdapter

    (adapter as ListAdapter<T, VH>).submitList(items)

}

@BindingAdapter("itemDecoration")
fun RecyclerView.itemDecoration(itemDecoration: RecyclerView.ItemDecoration?){
    if(itemDecoration == null) return

    if(itemDecorationCount == 0) addItemDecoration(itemDecoration)
}

//TODO: This inflates and finds views with every bind operation. This is not at all optimal.
@BindingAdapter("layoutId", "viewModel")
fun ViewGroup.childView(@LayoutRes layoutId: Int, viewModel: QuotViewModel){
    if(childCount == 0) {
        val view = LayoutInflater.from(context).inflate(layoutId, this, false)

        view.findViewById<TextView>(R.id.quoteText).text = viewModel.quote.value!!
        view.findViewById<TextView>(R.id.authorCommaBookText).text = viewModel.author.value!! + "," + viewModel.book.value!!

        addView(view)
    }

}