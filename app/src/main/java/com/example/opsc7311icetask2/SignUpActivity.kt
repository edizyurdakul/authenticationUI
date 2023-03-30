package com.example.opsc7311icetask2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.opsc7311icetask2.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions



class SignUpActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var googleSignInClient: GoogleSignInClient
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var googleSignUp: Button
    private lateinit var appleSignUp: Button
    private lateinit var facebookSignUp: Button
    private lateinit var emailSignUp: Button


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)

        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()

        googleSignInClient = GoogleSignIn.getClient(this, gso)

        auth = Firebase.auth
        setContentView(binding.root)

        binding.btnSignUpGoogle.setOnClickListener() {

            Intent(this, HomeActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnSignUpApple.setOnClickListener() {
            Intent(this, HomeActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.btnSignUpFacebook.setOnClickListener() {
            Intent(this, HomeActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.btnSignUpEmail.setOnClickListener() {
            Intent(this, HomeActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}