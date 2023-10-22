package com.oscar.ord_2dam_m08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class ex1234 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.xml1234)

        val buttonCambiarLayout: View = findViewById(R.id.btnCambiarLayout)

        buttonCambiarLayout.setOnClickListener {
            val intent = Intent(this, ex56::class.java)
            startActivity(intent)
                setContentView(R.layout.activity_ex56)


        }
    }
}
