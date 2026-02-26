package com.example.app2026

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class View3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view3)
        // Conectar con las vistas del XML
        val etTarea = findViewById<EditText>(R.id.etTarea)
        val ListaTareas = findViewById<TextView>(R.id.ListaTareas)
        val btnSumit = findViewById<Button>(R.id.btnEnviar)
        // Configurar el listener del botón
        btnSumit.setOnClickListener {
            // Obtener los valores ingresados
            val Tarea = etTarea.text.toString()
            // Mostrar la tarea y las tareas anteriores
            ListaTareas.text = "\n$Tarea\n${ListaTareas.text}"
        }
    }
}