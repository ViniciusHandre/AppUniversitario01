package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContatoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contato)

        // Pegando os IDs
        val ivContact = findViewById<ImageView>(R.id.ivContact)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        val tvTelefone = findViewById<TextView>(R.id.tvTelefone)
        val tvRedes = findViewById<TextView>(R.id.tvRedes)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        // Dados de contato
        tvEmail.text = "aluno@email.com"
        tvTelefone.text = "(47) 99999-9999"
        tvRedes.text = "@aluno_univali"

        // Botão para voltar
        btnVoltar.setOnClickListener {
            finish()
        }
    }
}

