package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABEL = "OBJECT_INTENT
    }
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Superherolist = listOf<Superhero>(
        ),
        Superhero(
            R.drawable.antman
            "Ant-man",
            "lorem lipsum lorem lipsum lorem lipsum"
        ),
        Superhero(
            R.drawable.black,
            "black panter",
            "lorem lipsum lorem lipsum lorem lipsum"
        ),
        Superhero(R.drawable.captain,
            "captain amerika",
            "lorem lipsum lorem lipsum lorem lipsum")
        ),
        Superhero(R.drawable.captain,
            "captain amerika",
            "lorem lipsum lorem lipsum lorem lipsum")
        ),
        Superhero(R.drawable.captain,
            "captain amerika",
            "lorem lipsum lorem lipsum lorem lipsum")
        ),
        Superhero(R.drawable.captain,
            "captain amerika",
            "lorem lipsum lorem lipsum lorem lipsum")
        )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.tv_hero)
        recyclerView.layoutManager = LinearLayoutManager(: this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter( :this, Superherolist){ it: Superhero
           val intent = Intent ( this,detailsuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            starActivity(intent)
}