package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Pegando os IDs dos botões
        val btnPerfil = findViewById<Button>(R.id.btnPerfil)
        val btnContato = findViewById<Button>(R.id.btnContato)
        val btnSite = findViewById<Button>(R.id.btnSite)
        val btnEmail = findViewById<Button>(R.id.btnEmail)

        // Botão para abrir o perfil
        btnPerfil.setOnClickListener {
            val intent = Intent(this, PerfilActivity::class.java)
            startActivity(intent)
        }

        // Botão para abrir o contato
        btnContato.setOnClickListener {
            val intent = Intent(this, ContatoActivity::class.java)
            startActivity(intent)
        }

        // Botão para abrir o site da faculdade no navegador
        btnSite.setOnClickListener {
            val url = "https://www.google.com"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        // Botão para mandar email
        btnEmail.setOnClickListener {
            val email = "aluno@email.com"
            val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:$email"))
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contato do App")
            startActivity(intent)
        }
    }
}

