package com.example.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.LoginLayoutBinding

class LoginConfig : AppCompatActivity() {

    private lateinit var binding: LoginLayoutBinding

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLoginToRegister.setOnClickListener() {
            val intent = Intent(applicationContext, RegisterConfig::class.java)
            startActivity(intent)
        }
        binding.btnExit.setOnClickListener { finish() }

        binding.btnLogin.setOnClickListener {
            val intent = Intent(applicationContext, MenuConfig::class.java)
            startActivity(intent)
        }
    }
}