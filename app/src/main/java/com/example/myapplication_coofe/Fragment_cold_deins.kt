package com.example.myapplication_coofe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Fragment_cold_deins : Fragment() {


    var list :ArrayList<Drinkdata> = ArrayList()
    lateinit var hotdrin_adapter: drinkAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cold_deins, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        intilizelist()
        recyclerView = view.findViewById(R.id.recyclerviewidcold)
        hotdrin_adapter = drinkAdapter(list)
        recyclerView.adapter = hotdrin_adapter
    }
    fun intilizelist() {
        list = ArrayList<Drinkdata>()
        val objectDrinkdata = Drinkdata("pepsi                     ",20)
        val objectDrinkdata1 = Drinkdata("cola                       ",20)
        val objectDrinkdata2 = Drinkdata("ice coffe               ",25)
        val objectDrinkdata3 = Drinkdata("ice moka               ",35)
        val objectDrinkdata4= Drinkdata("strawberry juice  ",25)
        val objectDrinkdata5 = Drinkdata("mango juice         ",30)
        val objectDrinkdata6 = Drinkdata("watermelon juice",40)
        val objectDrinkdata7 = Drinkdata("guava juice          ",25)
        val objectDrinkdata8 = Drinkdata("fruit salad            ",50)
        val objectDrinkdata9 = Drinkdata("Red Bull               ",40)
        val objectDrinkdata10= Drinkdata("ice cream oreo   ",40)
        val objectDrinkdata11 = Drinkdata("Oreo milkshake  ",40)
        val objectDrinkdata12 = Drinkdata("ice tea                  ",20)
        val objectDrinkdata13 = Drinkdata("lemon                  ",25)
        val objectDrinkdata14= Drinkdata("ice spresoo         ",25)
        list.add(objectDrinkdata)
        list.add(objectDrinkdata1)
        list.add(objectDrinkdata2)
        list.add(objectDrinkdata3)
        list.add(objectDrinkdata4)
        list.add(objectDrinkdata5)
        list.add(objectDrinkdata6)
        list.add(objectDrinkdata7)
        list.add(objectDrinkdata8)
        list.add(objectDrinkdata9)
        list.add(objectDrinkdata10)
        list.add(objectDrinkdata11)
        list.add(objectDrinkdata12)
        list.add(objectDrinkdata13)
        list.add(objectDrinkdata14)
    }

}