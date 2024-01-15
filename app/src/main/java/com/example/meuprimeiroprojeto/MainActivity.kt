package com.example.meuprimeiroprojeto

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

        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val edtpeso: EditText = findViewById(R.id.edttext_peso)
        val edtaltura: EditText = findViewById(R.id.edttext_altura)


        btnCalcular.setOnClickListener {

            val alturaStr = edtaltura.text.toString()
            val pesofinalStr = edtpeso.text.toString()

            if (alturaStr.isNotEmpty() && pesofinalStr.isNotEmpty()) {
                val altura: Float = alturaStr.toFloat()
                val alturafinal = altura * altura
                val pesofinal = pesofinalStr.toFloat()
                val imc: Float = pesofinal / alturafinal


                val intent = Intent(this, segundapag::class.java)

                    .apply {
                        putExtra("EXTRA_RESULT", imc)
                    }
                startActivity(intent)


            }else {
                Toast.makeText(this,"Preencher todos os campos",Toast.LENGTH_LONG).show()
            }

        }
    }
}
