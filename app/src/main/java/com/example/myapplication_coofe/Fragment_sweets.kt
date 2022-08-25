package com.example.myapplication_coofe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Fragment_sweets : Fragment() {

    var list: ArrayList<Drinkdata> = ArrayList()
    lateinit var hotdrin_adapter: drinkAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sweets, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        intilizelist()
        recyclerView = view.findViewById(R.id.recyclerviewidsweets)
        hotdrin_adapter = drinkAdapter(list)
        recyclerView.adapter = hotdrin_adapter


    }


    fun intilizelist() {
        list = ArrayList<Drinkdata>()
        val objectDrinkdata = Drinkdata("BISCUITS",50)
        val objectDrinkdata1 = Drinkdata("PASTRIES",60)
        val objectDrinkdata2 = Drinkdata("MASHPOTATO",65)
        val objectDrinkdata3 = Drinkdata("OREO",70)
        val objectDrinkdata4= Drinkdata("BISCUITS",75)
        val objectDrinkdata5 = Drinkdata("PASTRIES",40)
        val objectDrinkdata6 = Drinkdata("MASHPOTATO",45)
        val objectDrinkdata7 = Drinkdata("OREO",60)
        list.add(objectDrinkdata)
        list.add(objectDrinkdata1)
        list.add(objectDrinkdata2)
        list.add(objectDrinkdata3)
        list.add(objectDrinkdata4)
        list.add(objectDrinkdata5)
        list.add(objectDrinkdata6)
        list.add(objectDrinkdata7)
    }
}