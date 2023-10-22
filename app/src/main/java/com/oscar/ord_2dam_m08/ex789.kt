package com.oscar.ord_2dam_m08

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button // Importa Button
import android.widget.EditText // Importa EditText
import android.widget.TextView // Importa TextView

class ex789 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex789)
        val buttonCambiarLayout: View = findViewById(R.id.btnCambiarLayout)

        buttonCambiarLayout.setOnClickListener {
            setContentView(R.layout.activity_ex789)
        }

        val btnShowValue = findViewById<Button>(R.id.btnShowValue)
        val etExample = findViewById<EditText>(R.id.etExample)
        val textView = findViewById<TextView>(R.id.textView)

        btnShowValue.setOnClickListener {
            val textoIngresado = etExample.text.toString()
            textView.text = textoIngresado
        }
        buttonCambiarLayout.setOnClickListener {
            val intent = Intent(this, ex789::class.java)
            startActivity(intent)
            setContentView(R.layout.activity_ex789)


        }
    }
}
