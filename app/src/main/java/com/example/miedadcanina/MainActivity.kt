package com.example.miedadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.miedadcanina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("MainActivity", "Activity created")
        Log.v("log de prueba","Tipo Verbose")
        Log.d("log de prueba","Tipo Debug")
        Log.i("log de prueba","Tipo Info")
        Log.w("log de prueba","Tipo Warning")
        Log.e("log de prueba","Tipo Error")

        binding.button.setOnClickListener {
            if (binding.ageEdit.text.isEmpty()) {
                Toast.makeText(this, getString(R.string.you_must_insert_your_age), Toast.LENGTH_SHORT).show()
                Log.w("MainActivity","No introdujo edad")
            } else {
                var age = binding.ageEdit.text.toString().toInt()
                var result = age * 7
                binding.resultText.text = getString(R.string.result_text,result)
            }
        }
    }
}