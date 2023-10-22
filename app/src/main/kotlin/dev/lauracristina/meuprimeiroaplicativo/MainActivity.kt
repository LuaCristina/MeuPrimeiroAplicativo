package dev.lauracristina.meuprimeiroaplicativo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    lateinit var primeiraVal: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        primeiraVal = findViewById(R.id.novo_texto)

        val textoOriginal = primeiraVal.text
        val corOriginal = primeiraVal.textColors
        val tamanhoOriginal = primeiraVal.textSize

        val corNovo = ContextCompat.getColor(baseContext, R.color.green)
        val tamanhoNovo =  R.dimen.text_size_novo
        val textoNovo = getString(R.string.second_label)

        with(primeiraVal){
            setOnClickListener {
                if (text.equals(textoOriginal)) {
                    text = textoNovo
                    setTextColor(corNovo)
                    setTextSize(TypedValue.COMPLEX_UNIT_PX, baseContext.resources.getDimension(tamanhoNovo))
                } else {
                    text = textoOriginal
                    setTextColor(corOriginal)
                    setTextSize(TypedValue.COMPLEX_UNIT_PX, tamanhoOriginal)
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        primeiraVal.text = "entrou no onResume"
    }

    override fun onDestroy() {
        super.onDestroy()
        primeiraVal.text = "entrou no onDestroy"
        Log.e("MainActivity", "ENTROU NO onDestroy")
    }

    override fun onPause() {
        super.onPause()
        primeiraVal.text = "entrou no onPause"
        Log.i("MainActivity", "ENTROU NO ONPAUSE")
    }
}

//tamanho de fonte, italico
// DESAFIO: adicone outro texto quando clicar
