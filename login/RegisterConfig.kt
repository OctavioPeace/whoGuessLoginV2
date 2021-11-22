package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.RegisterLayoutBinding

class RegisterConfig: AppCompatActivity() {
    private lateinit var binding: RegisterLayoutBinding

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RegisterLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegisterToLogin.setOnClickListener { finish() }

        binding.btnRegister.setOnClickListener { }
    }
}