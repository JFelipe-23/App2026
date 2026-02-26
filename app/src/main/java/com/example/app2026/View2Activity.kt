package com.example.app2026

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class View2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view2)
        // Conectar con las vistas del XML
        val etNumero1 = findViewById<EditText>(R.id.etNumero1)
        val etNumero2 = findViewById<EditText>(R.id.etNumero2)
        val btnSumar = findViewById<Button>(R.id.btnSumar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        // Configurar el listener del botón
        btnSumar.setOnClickListener {
            // Obtener los valores ingresados
            val num1 = etNumero1.text.toString().toIntOrNull() ?: 0
            val num2 = etNumero2.text.toString().toIntOrNull() ?: 0
            // Realizar la suma
            val resultado = num1 + num2
            // Mostrar el resultado
            tvResultado.text = "Resultado: $resultado"
        }
    }
}