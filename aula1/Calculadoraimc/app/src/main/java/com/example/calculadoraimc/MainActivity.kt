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

        val editTextPeso = findViewById<EditText>(R.id.editTextPeso)
        val editTextAltura = findViewById<EditText>(R.id.editTextAltura)
        val resultado = findViewById<TextView>(R.id.resultado)
        val buttonCalcular = findViewById<Button>(R.id.buttonCalcular)

        buttonCalcular.setOnClickListener {
            if(editTextPeso.text.isEmpty()){
                resultado.setText("Please, inform your peso!!!")
            }
            else if(editTextAltura.text.isEmpty()) {
                resultado.setText("Please, inform your peso!!!")
            }
            else{
                resultado.setText("ola" + editTextAltura.text.trim())
            }
        }
    }

}