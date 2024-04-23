package com.sena.ciclovida

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity", "onCreate Called PRUEBA DE QUE SIRVE")
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart Called Avr si funciona")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume Called Sirve el resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause Called Sirve el pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop Called Sirve el stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy called Sirve el destroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart Called Sirve el restart")
    }
}