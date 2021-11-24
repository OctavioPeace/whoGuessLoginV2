package com.example.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.HelpLayoutBinding

class HelpConfig : AppCompatActivity(){
    private lateinit var binding: HelpLayoutBinding

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HelpLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnExit.setOnClickListener { finish() }
    }
}