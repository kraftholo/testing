package com.example.testing

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_item_horizontalrv.view.*

var myList2 = ArrayList<String>()

class HorizontalAdapter(list : ArrayList<String>) : RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder>() {
    init {
        myList2.addAll(list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {
        return HorizontalViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.single_item_horizontalrv,parent,false))
    }

    override fun getItemCount(): Int {
        return myList2.size
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {
        holder.bind(myList2[position])
    }


    class HorizontalViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun bind(str:String) = with(itemView){
            Log.e("HorizontalAdapter","bind ran!!")
            itemView.horizontalTV.text = str
            itemView.imageView.setImageResource(android.R.drawable.btn_star)
        }

    }

}