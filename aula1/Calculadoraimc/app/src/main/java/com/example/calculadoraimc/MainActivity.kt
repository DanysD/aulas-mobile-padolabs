package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peso = findViewById<EditText>(R.id.peso)
        val altura = findViewById<EditText>(R.id.altura)
        val calcular = findViewById<Button>(R.id.calcular)
        val resultado = findViewById<TextView>(R.id.resultado)


        calcular.setOnClickListener {
            val Altura = altura.text.toString().toDouble()
            val Peso = peso.text.toString().toDouble()

            val imc = (Peso/(Altura*Altura))
            val imcf = "%.2f".format(imc)

            if (imc < 19) {
                resultado.setText("Seu imc é =" + imcf + "Peso Baixo")
            } else if (imc >= 19 && imc < 24.9) {
                resultado.setText("Seu imc é =" +imcf + "Peso normal")
            } else if (imc >=25 && imc <= 29.9) {
                resultado.setText("Seu imc é =" + imcf + "Pré Obesidade")
            } else if (imc >= 30 && imc <= 34.9) {
                resultado.setText("Seu imc é = "+ imcf + "Obesidade")
            } else if (imc >= 35 && imc <= 39.9) {
                resultado.setText("Seu imc é =" + imcf + "Obesidade grave")
            }
        }
    }
}