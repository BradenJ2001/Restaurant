package com.braden.restaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class LookUpActivity : AppCompatActivity() {
    private lateinit var getRestButton: Button
    private lateinit var screenResult: TextView
    // did it work

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_look_up)

        getRestButton = findViewById(R.id.get_button)
        screenResult = findViewById(R.id.screenResult)

        val context = this
        var db = DataBaseHandler(context)
        getRestButton.setOnClickListener { view: View ->
            Snackbar.make(
                view,
                R.string.action_text,
                Snackbar.LENGTH_SHORT
            ).show()

            var data = db.readData()
            screenResult.text=""
            for (i in 0..(data.size-1)) {
                screenResult.append(data.get(i).name + " " + data.get(i).star + " " + data.get(i).type + " " + data.get(i).address + "\n")
            }

        }
    }
}