package com.example.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.MenuLayoutBinding

class MenuConfig : AppCompatActivity(){
    private lateinit var binding: MenuLayoutBinding

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MenuLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnExit.setOnClickListener { finish() }

        binding.btnPlayPVP.setOnClickListener {
            val intent = Intent(applicationContext, RoomConfig::class.java)
            startActivity(intent)
        }

        binding.btnHelp.setOnClickListener {
            val intent = Intent(applicationContext, HelpConfig::class.java)
            startActivity(intent)
        }
    }
}