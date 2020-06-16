package com.example.picassoview

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.items.view.*

class ImageAdapter(var versionList: ArrayList<Version>):RecyclerView.Adapter<ImageAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageAdapter.ViewHolder {
    var view: View = LayoutInflater.from(parent.context).inflate(R.layout.items, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = versionList.size

    override fun onBindViewHolder(holder: ImageAdapter.ViewHolder, position: Int) {
        holder.bindItems(versionList[position])
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(version : Version){
            val imageView = itemView.findViewById<ImageView>(R.id.imageview)
            Picasso.get().load(version.imageURL).into(imageView)
        }
    }

}