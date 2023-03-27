package com.braden.restaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var lookButton: Button
    private lateinit var favoritesButton: Button
    private lateinit var randomButton: Button
    private lateinit var viewedButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lookButton = findViewById(R.id.look_button)
        favoritesButton = findViewById(R.id.favorites_button)
        randomButton = findViewById(R.id.random_button)
        viewedButton = findViewById(R.id.viewed_button)

        lookButton.setOnClickListener { view: View ->
            Snackbar.make(
                view,
                R.string.action_text,
                Snackbar.LENGTH_SHORT
            ).show()
        }
        favoritesButton.setOnClickListener { view: View ->
            Snackbar.make(
                view,
                R.string.action_text,
                Snackbar.LENGTH_SHORT
            ).show()
        }
        randomButton.setOnClickListener { view: View ->
            Snackbar.make(
                view,
                R.string.action_text,
                Snackbar.LENGTH_SHORT
            ).show()
        }
        viewedButton.setOnClickListener { view: View ->
            Snackbar.make(
                view,
                R.string.action_text,
                Snackbar.LENGTH_SHORT
            ).show()
        }
    }
}