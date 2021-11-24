package com.example.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.RoomLayoutBinding

class RoomConfig : AppCompatActivity(){
    private lateinit var binding: RoomLayoutBinding

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RoomLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnExit.setOnClickListener { finish() }

        binding.btnEnterRoom.setOnClickListener {
            val intent = Intent(applicationContext, WaitRoomConfig::class.java)
            startActivity(intent)
        }

    }
}