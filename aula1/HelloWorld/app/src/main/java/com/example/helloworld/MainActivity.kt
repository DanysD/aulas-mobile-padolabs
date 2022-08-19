package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editName = findViewById<EditText>(R.id.editName)
        val txtmessage = findViewById<TextView>(R.id.txtmessage)
        val btnOK = findViewById<Button>(R.id.btnOk)

        btnOK.setOnClickListener{
                if(editName.text.isEmpty()){
                    txtmessage.setText("Please, inform your name!!!")
                } else{
                    txtmessage.setText("Olá" + editName.text.trim() + " , welcome to mobile world!!")
                }
        }
    }
}