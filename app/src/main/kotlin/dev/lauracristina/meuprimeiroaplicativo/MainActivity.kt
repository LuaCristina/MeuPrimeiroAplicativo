package dev.lauracristina.meuprimeiroaplicativo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val primeiraVal: TextView = findViewById(R.id.novo_texto)

        val textOriginal = primeiraVal.text
        val textNovo = "ai que delícia ser viado"

        val cor1 = ContextCompat.getColor(baseContext, R.color.green)
        val cor2 = ContextCompat.getColor(baseContext, R.color.black)

        primeiraVal.setOnClickListener {
            if (primeiraVal.text.equals(textOriginal)) {
                primeiraVal.text = textNovo
                primeiraVal.setTextColor(cor1)
            } else {
                primeiraVal.text = textOriginal
                primeiraVal.setTextColor(cor2)

            }

        }

    }
}

//tamanho de fonte, italico
// DESAFIO: adicone outro texto quando clicar
