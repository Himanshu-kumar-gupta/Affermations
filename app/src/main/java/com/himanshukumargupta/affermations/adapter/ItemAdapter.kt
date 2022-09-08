package com.himanshukumargupta.affermations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.himanshukumargupta.affermations.databinding.ListItemBinding
import com.himanshukumargupta.affermations.model.Affirmation

//Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.
class ItemAdapter(private val context: Context,
                  private val dataset: List<Affirmation>):
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(ListItemBinding.inflate(LayoutInflater.from(context),parent,false))
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataset.size

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation object.
    class ItemViewHolder(binding:ListItemBinding): RecyclerView.ViewHolder(binding.root) {
        val textView = binding.itemTitle
    }
}