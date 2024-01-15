package com.example.meuprimeiroprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class segundapag : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segundapag)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvResult = findViewById<TextView>(R.id.textview_result)
        val tvClassificacao = findViewById<TextView>(R.id.textview_classificacao)


        val result = intent.getFloatExtra("EXTRA_RESULT", 0.1f)
        tvResult.text = result.toString()


        val classificacao = if (result < 18.5f) {
             "ABAIXO DO PESO"
        } else if (result in 18.5f..24.99f) {
            "NORMAL"
        } else if (result in 25f..29.9f){
            "SOBREPESO"
        }else if (result in 30.0f..39.9f){
           " OBESIDADE"
        }else  {
            "OBESIDADE GRAVE"
        }

        tvClassificacao.text = getString(R.string.message_classificaçao, classificacao)




            }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
        }
