package com.rays95.cinemarays

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter: RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        (holder.itemView as TextView).text = "${position+1}"
    }

    override fun getItemCount(): Int {
        return 200
    }
}