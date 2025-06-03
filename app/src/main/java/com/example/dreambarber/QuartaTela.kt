package com.example.dreambarber

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dreambarber.databinding.ActivityQuartaTelaBinding
import com.example.dreambarber.databinding.ActivityTerceiraTelaBinding

class QuartaTela : AppCompatActivity() {
    private lateinit var binding: ActivityQuartaTelaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuartaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnManha.setOnClickListener {
            val navegarQuintaTela = Intent(this, QuintaTela::class.java)
            startActivity(navegarQuintaTela)
        }
        binding.btnTarde.setOnClickListener {
            val navegarQuartaTela = Intent(this, QuintaTela::class.java)
            startActivity(navegarQuartaTela)
        }
        binding.btnNoite.setOnClickListener {
            val navegarQuintaTela = Intent(this, QuintaTela::class.java)
            startActivity(navegarQuintaTela)
        }
        binding.icHome.setOnClickListener {
            val navegarHome = Intent(this, SegundaTela::class.java)
            startActivity(navegarHome)
        }
        binding.icPerfil.setOnClickListener {
            val navegarPerfil = Intent(this, SextaTela::class.java)
            startActivity(navegarPerfil)
        }
    }
}