package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numField1 = findViewById<EditText>(R.id.number_1)
        var numField2 = findViewById<EditText>(R.id.number_2)

        findViewById<Button>(R.id.button).setOnClickListener {
            compareNumbers(
                Integer.parseInt(numField1.text.toString()),
                Integer.parseInt(numField2.text.toString())
            )
        }
    }

    fun compareNumbers(num1: Int, num2: Int) {
        if(num1 > num2) {
            Toast.makeText(this, "O primeiro numero é maior que o segundo", Toast.LENGTH_SHORT).show()
        } else if(num1 < num2) {
            Toast.makeText(this, "O segundo numero é maior que o primeiro", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Os números são iguais", Toast.LENGTH_SHORT).show()
        }
    }
}