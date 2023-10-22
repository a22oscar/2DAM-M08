package com.oscar.ord_2dam_m08

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent



class ex56 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex56)

        val buttonLogcat = findViewById<Button>(R.id.buttonLogcat)
        val buttonToast = findViewById<Button>(R.id.buttonToast)

        buttonLogcat.setOnClickListener {
            Log.d("MiApp", "Botón Logcat apretado")
        }

        buttonToast.setOnClickListener {
            val text = "Botón Toast apretado"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }
        val buttonCambiarLayout: View = findViewById(R.id.btnCambiarLayout)

        buttonCambiarLayout.setOnClickListener {
            val intent = Intent(this, ex789::class.java)
            startActivity(intent)
            setContentView(R.layout.activity_ex789)


        }

    }
}
