package com.example.viewcustomdp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewcustomdp.databinding.ActivityCalendarBinding

class CalendarActivity : AppCompatActivity() {

  private val binding: ActivityCalendarBinding by lazy {
      ActivityCalendarBinding.inflate(layoutInflater)
  }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.dayViewDp.setMonth(1,2025)
        binding.dayViewDp.setOnDayFocusChangeListener { dayItem ->
            // Handle the focused day
            println("Focused day: ${dayItem.day}, Month: ${dayItem.month}")
        }



    }
}