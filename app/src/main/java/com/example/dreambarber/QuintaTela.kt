package com.example.dreambarber

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dreambarber.databinding.ActivityQuartaTelaBinding
import com.example.dreambarber.databinding.ActivityQuintaTelaBinding

class QuintaTela : AppCompatActivity() {
    private lateinit var binding: ActivityQuintaTelaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuintaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icHome.setOnClickListener {
            val navegarHome = Intent(this, SegundaTela::class.java)
            startActivity(navegarHome)
        }
        binding.icPerfil.setOnClickListener {
            val navegarPerfil = Intent(this, Perfil::class.java)
            startActivity(navegarPerfil)
        }
    }
}