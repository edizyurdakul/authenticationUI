package com.example.opsc7311icetask2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.opsc7311icetask2.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSignIn.setOnClickListener() {
            Intent(this, HomeActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnBack.setOnClickListener() {
            finish()
        }
    }
}