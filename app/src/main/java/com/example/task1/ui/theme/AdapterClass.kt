package com.example.task1.ui.theme

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task1.R

class AdapterClass(private val dataList : ArrayList<DataClass>): RecyclerView.Adapter<AdapterClass.ViewHolderClass>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = dataList[position]
        holder.rvImageProfile.setImageResource(currentItem.profileImage)
        holder.rvImagePost.setImageResource(currentItem.postImage)
        holder.rvImageShare.setImageResource(currentItem.shareImage)

        holder.rvName.text = currentItem.name
        holder.rvTime.text = currentItem.time
        holder.rvCaption.text = currentItem.caption
        holder.rvLink.text = currentItem.link
        holder.rvNumberOfLikes.text = currentItem.numberOFLikes
        holder.rvNumberOfShares.text = currentItem.numberOfShares

    }

    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView) {

        var rvImageProfile : ImageView = itemView.findViewById(R.id.profileImage)
        var rvImagePost : ImageView = itemView.findViewById(R.id.yellowImagePost)
        var rvImageShare : ImageView = itemView.findViewById(R.id.yellowImageShare)

        var rvName : TextView = itemView.findViewById(R.id.nameText)
        var rvTime : TextView = itemView.findViewById(R.id.timeText)
        var rvCaption : TextView = itemView.findViewById(R.id.caption)
        var rvLink : TextView = itemView.findViewById(R.id.captionLink)
        var rvNumberOfLikes : TextView = itemView.findViewById(R.id.numberOfLikes)
        var rvNumberOfShares : TextView = itemView.findViewById(R.id.numberOfShares)

    }
}