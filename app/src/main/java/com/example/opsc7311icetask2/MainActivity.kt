package com.example.opsc7311icetask2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import com.example.opsc7311icetask2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSignIn.setOnClickListener() {
            Intent(this, SignInActivity::class.java).also {
                startActivity(it)
            }
        }
        val signUpText = "Don’t have an account? Sign up."
        val spannableString = SpannableString(signUpText)

        val clickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                startActivity(Intent(this@MainActivity, SignUpActivity::class.java))
            }
        }
        spannableString.setSpan(
            clickableSpan,
            signUpText.indexOf("Sign up"),
            signUpText.length,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        binding.tvSignUp.text = spannableString
        binding.tvSignUp.movementMethod = LinkMovementMethod.getInstance()
    }
}