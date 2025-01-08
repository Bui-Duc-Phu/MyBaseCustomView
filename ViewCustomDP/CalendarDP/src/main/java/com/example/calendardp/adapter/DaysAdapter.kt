package com.example.calendardp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.calendardp.R
import com.example.calendardp.model.DayItem

class DaysAdapter(private val days: List<DayItem>) : RecyclerView.Adapter<DaysAdapter.DayViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_day, parent, false)
        return DayViewHolder(view)
    }

    override fun onBindViewHolder(holder: DayViewHolder, position: Int) {
        val dayItem = days[position]
        holder.bind(dayItem)
    }


    fun getItemAt(position: Int): DayItem {
        return days[position]
    }

    override fun getItemCount(): Int = days.size

    class DayViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvDayOfWeek: TextView = itemView.findViewById(R.id.tvDayOfWeek)
        private val tvDay: TextView = itemView.findViewById(R.id.tvDay)
        private val tvMonth: TextView = itemView.findViewById(R.id.tvMonth)

        fun bind(dayItem: DayItem) {
            tvDayOfWeek.text = dayItem.dayOfWeek
            tvDay.text = dayItem.day.toString()
            tvMonth.text = "Tháng ${dayItem.month}"
        }
    }



}
