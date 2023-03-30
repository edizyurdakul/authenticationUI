package com.example.opsc7311icetask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.opsc7311icetask2.databinding.ActivityHomeBinding
import com.example.opsc7311icetask2.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}