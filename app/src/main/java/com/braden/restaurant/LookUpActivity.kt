package com.braden.restaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class LookUpActivity : AppCompatActivity() {
    private lateinit var testButton: Button
    // did it work

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_look_up)

        testButton = findViewById(R.id.test_button)

        testButton.setOnClickListener { view: View ->
            Snackbar.make(
                view,
                R.string.action_text,
                Snackbar.LENGTH_SHORT
            ).show()
        }
    }
}