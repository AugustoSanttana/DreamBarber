package com.example.dreambarber

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dreambarber.databinding.ActivitySegundaTelaBinding

class SegundaTela : AppCompatActivity() {
    private lateinit var binding: ActivitySegundaTelaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnServicos.setOnClickListener {
            val navegarterceiraTela = Intent(this, TerceiraTela::class.java)
            startActivity(navegarterceiraTela)
        }
        binding.icPerfil.setOnClickListener {
            val navegarPerfil = Intent(this, Perfil::class.java)
            startActivity(navegarPerfil)
        }
    }
}