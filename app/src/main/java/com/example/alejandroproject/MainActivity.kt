package com.example.alejandroproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculator: Button = findViewById<Button>(R.id.calculator)
        val edtPeso: EditText = findViewById(R.id.edtPeso)
        val edtAltura: EditText = findViewById(R.id.edtAltura)


        calculator.setOnClickListener{
            // Mostro uma nova mensagem no TextView

           val alturaString = edtAltura.text.toString()
           val pesoString = edtPeso.text.toString()

           if (alturaString.isNotEmpty() && pesoString.isNotEmpty()) {

               val altura: Float = edtAltura.text.toString().toFloat()
               val alturaFinal = altura * altura
               val peso: Float = edtPeso.text.toString().toFloat()
               val imc = peso / (alturaFinal)


               val intent = Intent(this, ResultActivity::class.java)
                   .apply {
                       putExtra("EXTRA_RESULT", imc)
                   }
               startActivity(intent)

           }  else {
               Toast.makeText(this, "Preencher todos os campos", Toast.LENGTH_LONG).show()
           }

        }


    }
}