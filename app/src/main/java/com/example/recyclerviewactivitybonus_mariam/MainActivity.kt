package com.example.recyclerviewactivitybonus_mariam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var Name: EditText
    lateinit var Age: EditText
    lateinit var Location: EditText
    lateinit var Phone: EditText
    lateinit var saveBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initVars()

        saveBtn.setOnClickListener {
            startActivity(
                // الصفحة التانية
                Intent(this, MainActivity2::class.java).putExtra(
                    "data", arrayListOf(
                        Name.text.toString(),
                        Age.text.toString(),
                        Location.text.toString(),
                        Phone.text.toString()
                    )
                )
            )
        }
    }

    fun initVars() {
        Name = findViewById(R.id.Name)
        Age = findViewById(R.id.Age)
        Location = findViewById(R.id.Location)
        Phone = findViewById(R.id.Phone)
        saveBtn = findViewById(R.id.Go)
    }

}