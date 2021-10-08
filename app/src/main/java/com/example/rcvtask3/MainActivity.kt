package com.example.rcvtask3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    lateinit var foods: ArrayList<String>
    lateinit var edf : EditText
    lateinit var btf : Button
    lateinit var lLayout : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv)
        edf = findViewById(R.id.edf)
        btf = findViewById(R.id.btn)
        lLayout = findViewById<LinearLayout>(R.id.LMain)

        foods = ArrayList()

        foods.add("pizza")
        foods.add("soup")
        foods.add("rise")


        recyclerView.adapter = Myadapter(foods)
        recyclerView.layoutManager = LinearLayoutManager(this)

        btf.setOnClickListener {
            val food = edf.text.toString()
            if (edf.text.toString().isEmpty()){
                Snackbar.make(lLayout, "please add food", Snackbar.LENGTH_LONG).show()
            }else if (edf.text.toString().isNotBlank()) {
                foods.add(food)
                edf.text.clear()
                edf.clearFocus()

                recyclerView.adapter?.notifyDataSetChanged()
            }
        }
    }
}
