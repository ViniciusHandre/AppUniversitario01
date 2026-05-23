package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PerfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        // Pegando os campos do layout
        val ivProfile = findViewById<ImageView>(R.id.ivProfile)
        val tvNome = findViewById<TextView>(R.id.tvNome)
        val tvCurso = findViewById<TextView>(R.id.tvCurso)
        val tvFaculdade = findViewById<TextView>(R.id.tvFaculdade)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        // Colocando os dados do aluno
        tvNome.text = "João Silva"
        tvCurso.text = "Engenharia de Software"
        tvFaculdade.text = "Univali"

        // Botão para voltar para a tela anterior
        btnVoltar.setOnClickListener {
            finish()
        }
    }
}

