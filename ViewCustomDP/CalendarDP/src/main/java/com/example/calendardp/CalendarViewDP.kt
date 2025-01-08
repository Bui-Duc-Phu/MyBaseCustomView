package com.example.calendardp


import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.calendardp.databinding.ViewCalendarBinding

import java.text.SimpleDateFormat
import java.util.*

class CalendarViewDP @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val binding: ViewCalendarBinding
    init {
        // Inflate layout
        val inflater = LayoutInflater.from(context)
        binding = ViewCalendarBinding.inflate(inflater, this, true)

        // Initialize current date
        setDateToCurrent()
    }

    private fun setDateToCurrent() {
        val calendar = Calendar.getInstance()
        val dayOfWeekFormat = SimpleDateFormat("EEEE", Locale.getDefault())
        val dayFormat = SimpleDateFormat("dd", Locale.getDefault())
        val monthFormat = SimpleDateFormat("MMMM", Locale.getDefault())
        val dayOfWeek = dayOfWeekFormat.format(calendar.time)
        val day = dayFormat.format(calendar.time)
        val month = monthFormat.format(calendar.time)

        binding.tvDayOfWeek.text = dayOfWeek
        binding.tvDay.text = day
        binding.tvMonth.text = month
    }
}
