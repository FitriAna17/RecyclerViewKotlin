package com.example.recyclerviewkotlin

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SuperheroAdapter (private val context, Context, private val Superhero: List<Superhero>, val listener: (Superhero) -> Unit)
    : RecyclerView.Adapter<SuperheroAdapter.SuperheroViewHolder>(){

        class SuperheroViewHolder(view: View): RecyclerView.ViewHolder(view) {

            val imgsuperhero: View.findViewById<ImageView>(R.id.img_item_photo),
            val nameSuperhero: View.findViewById<TextView>(R.id.img_item_name),
            val desSuperhero: View.findViewById<TextView>(R.id.img_item_description),

            fun  bindView(Superhero: Superhero, listener: (Superhero) -> Unit){
                imgsuperhero.setImageResource(Superhero.imgsuperhero)
                nameSuperhero.text = Superhero.nameSuperhero
                desSuperhero.text = Superhero.desSuperhero
                itemView.setOnClickListener({
                    listener(superhero)}
            }

        }

    override fun onCreateViewHolder(parent: viewGroup, viewType: Int): SuperheroViewHolder {
        SuperheroViewHolder(layoutInflater.from(context).inflate(R.layout.item_superhero,parent,false))
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        holder.bindView(Superhero[position], listener)
    }

    override fun getItemCount(): Int = Superhero.size
    }