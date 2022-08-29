package com.example.catalogo_pado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.widget.Button
import android.widget.Toast

class Fde600wPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fde600w_page)

        val btnComprar = findViewById<Button>(R.id.btnComprar)
        btnComprar.setOnClickListener{
           val toast = Toast.makeText(this,
               "Ainda não implementado",
                Toast.LENGTH_SHORT)

                toast.show()
        }
//        val btn = findViewById<Button>(R.id.button2)
//
//        btn.setOnClickListener {
//            startActivity(Intent(this,
//                MainActivity::class.java)
//            )
//        }
    }
}