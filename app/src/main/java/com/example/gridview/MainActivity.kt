package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var gridView : GridView
    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridView)
        fillArrays()
        val adapter = CarAdapter(this, nameList, imageList)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(applicationContext, "You selected the ${nameList[position]}"
                , Toast.LENGTH_SHORT).show()
        }
    }

    fun fillArrays(){
        nameList.add("Mercedes AMG GT")
        nameList.add("Bentley Continental GT")
        nameList.add("Lamborghini Aventador SVJ")
        nameList.add("BMW M8")
        nameList.add("Pagani Huyara BC")
        nameList.add("Bugatti Chiron")
        nameList.add("koenegsegg Agera R")
        nameList.add("Porsche 911 GT")
        nameList.add("Apollo IE")
        nameList.add("Ford GT")
        nameList.add("Rolls Royce Wraith")
        nameList.add("Ferrari 458 Italia")

        imageList.add(R.drawable.amggt169)
        imageList.add(R.drawable.continentalgt169)
        imageList.add(R.drawable.newsvj169)
        imageList.add(R.drawable.m8169)
        imageList.add(R.drawable.bc169)
        imageList.add(R.drawable.bugatti169)
        imageList.add(R.drawable.koensegg_169)
        imageList.add(R.drawable.gt911169)
        imageList.add(R.drawable.apollo169)
        imageList.add(R.drawable.ford169)
        imageList.add(R.drawable.royce169)
        imageList.add(R.drawable.ferrari458italia169)


    }
}