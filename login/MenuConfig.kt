package com.example.login

import android.content.Intent
import android.os.Bundle
import android.view.MenuInflater
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.MenuLayoutBinding

class MenuConfig : AppCompatActivity() {
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

    fun showPopup(v : View){
        val popup = PopupMenu(this, v)
        val inflater: MenuInflater = popup.menuInflater
        inflater.inflate(R.menu.popup_menu, popup.menu)
        popup.setOnMenuItemClickListener { menuItem ->
            when(menuItem.itemId){
                R.id.item1-> {
                    Toast.makeText(this, "Item1", Toast.LENGTH_SHORT).show()
                    true
                }
            }
            true
        }
        popup.show()
    }

    fun showMenu(v: View) {
        PopupMenu(this, v).apply {
            // MainActivity implements OnMenuItemClickListener
            setOnMenuItemClickListener(this@MenuConfig)
            inflate(R.menu.popup_menu)
            show()
        }
    }

    private fun setOnMenuItemClickListener(menuConfig: MenuConfig) {

    }
}

