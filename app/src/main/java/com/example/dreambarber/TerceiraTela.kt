package com.example.dreambarber

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dreambarber.databinding.ActivityMainBinding
import com.example.dreambarber.databinding.ActivityTerceiraTelaBinding

class TerceiraTela : AppCompatActivity() {
    private lateinit var binding: ActivityTerceiraTelaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTerceiraTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCabelo.setOnClickListener {
            val navegarQuartaTela = Intent(this, QuartaTela::class.java)
            startActivity(navegarQuartaTela)
        }
        binding.btnBarba.setOnClickListener {
            val navegarQuartaTela = Intent(this, QuartaTela::class.java)
            startActivity(navegarQuartaTela)
        }
        binding.btnCabeloBarba.setOnClickListener {
            val navegarQuartaTela = Intent(this, QuartaTela::class.java)
            startActivity(navegarQuartaTela)
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