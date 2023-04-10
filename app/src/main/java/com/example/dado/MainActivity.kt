package com.example.dado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var dado :EditText
    lateinit var imagem :ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar(findViewById(R.id.toolbar))

        dado = findViewById(R.id.textonumero)
        imagem = findViewById(R.id.dado)


    }

    private fun supportActionBar() {
        TODO("Not yet implemented")
    }

    private fun supportActionBar(findViewById: Any) {

    }

    fun convertir():String{

        val numero =(1..6).random()

        return when{
            numero==1 ->"One"
            numero==2 ->"Two"
            numero==3 ->"Three"
            numero==4 ->"Four"
            numero==5 ->"Five"
            numero==6 ->"Six"
            else -> "Zero"
        }
    }

    fun jogarDado(view: View){
        val resultado=convertir()
        dado.setText(resultado)

        if (resultado.equals("One")){
            imagem.setImageResource(R.drawable.diceum)
        }
        if (resultado.equals("Two")) {
            imagem.setImageResource(R.drawable.dicedois)
        }
        if (resultado.equals("Three")) {
            imagem.setImageResource(R.drawable.dicetres)
        }
        if (resultado.equals("Four")) {
            imagem.setImageResource(R.drawable.dicequatro)
        }
        if (resultado.equals("Five")) {
            imagem.setImageResource(R.drawable.dicecinco)
        }
        if (resultado.equals("Six")) {
            imagem.setImageResource(R.drawable.diceseis)
        }
    }
}
