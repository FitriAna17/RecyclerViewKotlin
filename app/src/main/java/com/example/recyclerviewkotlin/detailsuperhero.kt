package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class detailsuperhero : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailsuperhero)

        supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)

        val superhero = intent.getParcelableArrayExtra<Superhero>(MainActivity.INTENT_PARCELABEL)

        val imgsuperhero = findViewById<ImageView>(R.id.img_item_photo)
        val namasuperhero = findViewById<TextView>(R.id.tv_item_name)
        val decsuperhero = findViewById<TextView>(R.id.tv_item_description)

        imgsuperhero.setImageResource(superhero?.imgsuperhero!!)
        namasuperhero.text = superhero.namesuperhero
        decsuperhero.text = superhero.decsuperhero
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}