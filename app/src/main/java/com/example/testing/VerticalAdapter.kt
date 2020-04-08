package com.example.testing

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_item_verticalrv.view.*

var myList = ArrayList<String>()
lateinit var mContext : Context

class VerticalAdapter(list : ArrayList<String>) :RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder>() {
    init {
        myList.addAll(list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {
        mContext = parent.context;
        return VerticalViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.single_item_verticalrv,parent,false))
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {
       holder.bind(myList[position])
    }

    class VerticalViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun bind(str:String) = with(itemView){
            Log.e("VerticalAdapter","bind ran")
            itemView.verticalTV.text = str
            itemView.horizontalRV.apply {
                adapter = HorizontalAdapter(MainActivity.listH)
                layoutManager = LinearLayoutManager(mContext,LinearLayoutManager.HORIZONTAL,false)
            }


        }

    }
}