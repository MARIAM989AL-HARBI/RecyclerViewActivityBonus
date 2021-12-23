package com.example.recyclerviewactivitybonus_mariam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    lateinit var mainRview: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val arraylist = intent.extras?.getStringArrayList("data")
        mainRview = findViewById(R.id.rvtMain)

        if(!arraylist.isNullOrEmpty())
        {
            mainRview.adapter = RVAdapter(arraylist)
            mainRview.layoutManager  = LinearLayoutManager(this)
        }
    }
}
