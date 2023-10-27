package com.example.figmadisigne.recadapters
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.figmadisigne.R

class StateRecycler (val context:Context, val list: ArrayList<state>) : RecyclerView.Adapter<StateRecycler.MyVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateRecycler.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.state_adapter,parent,false)
        return MyVH(root)
    }

    override fun onBindViewHolder(holder: MyVH, position: Int) {
        holder.image.setImageResource(list[position].image_state)
        holder.titletemp.setText(list[position].title)
        holder.abouttemp.setText(list[position].text_state)
    }

    class MyVH(itemView: View): RecyclerView.ViewHolder(itemView){
        val  image: ImageView = itemView.findViewById(R.id.image_template)
        val  titletemp: TextView = itemView.findViewById(R.id.title_template)
        val  abouttemp: TextView = itemView.findViewById(R.id.about_template)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}