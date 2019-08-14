package com.android.danhba

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter (var context: Context, var mangdanhba:ArrayList<DanhBa>) : BaseAdapter() {
    class ViewHolder (row:View){
        var avatar:ImageView
        var hoten:TextView
        var sodt:TextView

        init{
            avatar = row.findViewById(R.id.avatar) as ImageView
            hoten = row.findViewById(R.id.hoten) as TextView
            sodt  = row.findViewById(R.id.sodt) as TextView
        }
    }
    override fun getView(position: Int, convertview: View?, p2: ViewGroup?): View {
        var view : View?
        var viewholder : ViewHolder
        if (convertview == null){
            var layoutinflater:LayoutInflater = LayoutInflater.from(context)
            view = layoutinflater.inflate(R.layout.subdanhba,null)
            viewholder = ViewHolder(view)
            view.tag = viewholder
        }
        else {
            view = convertview
            viewholder = convertview.tag as ViewHolder
        }
        var danhba: DanhBa = getItem(position) as DanhBa
        viewholder.avatar.setImageResource(danhba.avatar)
        viewholder.hoten.text = danhba.hoten
        viewholder.sodt.text = danhba.sodt



        return view as View
    }

    override fun getItem(position: Int): Any {
        return mangdanhba.get(position)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return mangdanhba.size
    }
}