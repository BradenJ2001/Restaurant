package com.braden.restaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class StoringActivity : AppCompatActivity() {
    private lateinit var insertButton: Button
    private lateinit var etvName: EditText
    private lateinit var etvStar: EditText
    private lateinit var etvType: EditText
    private lateinit var etvAddress: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_storing)

        insertButton = findViewById(R.id.insertButton)
        etvName = findViewById(R.id.etvName)
        etvStar = findViewById(R.id.etvStar)
        etvType = findViewById(R.id.etvType)
        etvAddress = findViewById(R.id.etvAddress)
        val context = this
        insertButton.setOnClickListener {
            if (etvName.text.toString().length > 0 &&
                etvStar.text.toString().length > 0 &&
                etvType.text.toString().length > 0 &&
                etvAddress.text.toString().length > 0
            ) {
                var restaurant = Restaurant(
                    etvName.text.toString(),
                    etvStar.text.toString(),
                    etvType.text.toString(),
                    etvAddress.text.toString()
                )
                var db = DataBaseHandler(context)
                db.insertData(restaurant)
            } else {
                Toast.makeText(context, "Please Fill All Data's", Toast.LENGTH_SHORT).show()
            }
        }
    }
}