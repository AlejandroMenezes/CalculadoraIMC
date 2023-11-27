package com.example.alejandroproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.EditText
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val txtImc: TextView = findViewById(R.id.txtImc)
        val txtIMCTipo: TextView = findViewById(R.id.txtIMCTipo)
        val imc = intent.getFloatExtra("EXTRA_RESULT", 0.1f)

        txtImc.text = imc.toString()

        val resultado: String =
            if (imc < 18.5) {
            ("Você está Abaixo do Peso")
          } else if (imc >= 18.5 && imc < 25){
            ("Você tem um Peso Normal")
          } else if (imc >= 25 && imc < 30){
            ("Você está com Sobrepeso")
          } else if (imc >= 30 && imc < 35){
            ("Você tem Obesidade Grau !")
          } else if (imc >= 35 && imc < 40){
            ("Você tem Obesidade Grau 2")
          } else {
            ("Você tem Obesidade Grau 3")
          }

        txtIMCTipo.text = resultado.toString()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }

}