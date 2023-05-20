package com.example.pertemuanketujuh

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pertemuanketujuh.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding
    lateinit var sharedPrefs: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPrefs = getSharedPreferences("Datauser", Context.MODE_PRIVATE)

        val email = sharedPrefs.getString("user_email", "")
        val password = sharedPrefs.getString("user_password", "")

        binding.txtEmail.text = "Email: ${email.toString()}"
        binding.txtPassword.text = "Password: ${password.toString()}"

        binding.btnLogout.setOnClickListener{
            with(sharedPrefs.edit()){
                clear()
                apply()
            }
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}