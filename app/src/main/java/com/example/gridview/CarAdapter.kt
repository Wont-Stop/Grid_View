package com.example.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CarAdapter(
    var context: Context,
    var nameList: ArrayList<String>,
    var imageList: ArrayList<Int>
            //we need to delete the lateinit keyword in primary constructor
) : BaseAdapter() {

    override fun getCount(): Int {
       return nameList.size
    }

    override fun getItem(position: Int): Any? {
            return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view : View = LayoutInflater.from(parent!!.context)
            .inflate(R.layout.custom_layout,parent,false)

        var CarName : TextView = view.findViewById(R.id.textView)
        var CarImage : ImageView = view.findViewById(R.id.imageView)

        CarName.text = nameList[position]
        CarImage.setImageResource(imageList.get(position))

        return  view
    }
}