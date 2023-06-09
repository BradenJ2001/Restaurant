package com.braden.restaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var lookButton: Button
    private lateinit var favoritesButton: Button
    private lateinit var randomButton: Button
    private lateinit var viewedButton: Button
    private lateinit var mapsButton: Button
    private lateinit var storingButton: Button

    // did it work

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lookButton = findViewById(R.id.look_button)
        favoritesButton = findViewById(R.id.favorites_button)
        randomButton = findViewById(R.id.random_button)
        viewedButton = findViewById(R.id.viewed_button)
        mapsButton = findViewById(R.id.maps_button)
        storingButton = findViewById(R.id.storing_button)


        lookButton.setOnClickListener { view: View ->
            val Intent = Intent(this, LookUpActivity::class.java)
            startActivity(Intent)
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
        storingButton.setOnClickListener { view: View ->
            val intent = Intent(this, StoringActivity::class.java)
            startActivity(intent)
        }
        mapsButton.setOnClickListener { view: View ->
            val Intent = Intent(this, MapsActivity::class.java)
            startActivity(Intent)
        }
    }
}