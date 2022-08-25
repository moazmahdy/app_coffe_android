package com.example.myapplication_coofe

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication_coofe.drinkAdapter.Onitemcliclisner
import java.util.logging.Logger

class Fragment_hot_drinks : Fragment() {
    var list :ArrayList<Drinkdata> = ArrayList()
    lateinit var button_add:Button
    lateinit var second_screem_textview_title: TextView
    lateinit var text_textrecyclerview: TextView
    lateinit var hotdrin_adapter: drinkAdapter
    lateinit var recyclerView:RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hot_drinks, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        intilizelist()
             //second_screem_textview_title = view.findViewById(R.id.second_screem_textview_title)
//        text_textrecyclerview = view.findViewById(R.id.TextViewrecyclerview)
//        button_add = view.findViewById(R.id.addbuttn)
        recyclerView = view.findViewById(R.id.recyclerviewidhot)
        val adapter  = drinkAdapter(list)
        adapter.onitemcliclisner = object : Onitemcliclisner, drinkAdapter.Onitemcliclisner {
            @SuppressLint("LongLogTag")
            override fun onclic(index: Int, item: Drinkdata?) {
                Log.e("fragment hot adapter on clic","done")
                DataClass.textView.text = list[index].price.toString()
            }
        }







//        hotdrin_adapter =
//        recyclerView.adapter = hotdrin_adapter
//        hotdrin_adapter.onitemcliclisner = drinkAdapter.Onitemcliclisner { index, item ->
//
//        }


//        button_add.setOnClickListener { item->
//            if(text_textrecyclerview.equals(list.get(0).getName())){
//               second_screem_textview_title.setText(list.get(0).getPrice())
//
//            }
//        }
    }
    val onitemcliclisner: Onitemcliclisner? = null
    interface Onitemcliclisner {
        fun onclic(index: Int, item: Drinkdata?)
    }




    fun intilizelist() {
        list = ArrayList<Drinkdata>()
        val objectDrinkdata = Drinkdata("tea                  ",10)
        val objectDrinkdata1 = Drinkdata("milk                ",20)
        val objectDrinkdata2 = Drinkdata("hoot choclet  ",30)
        val objectDrinkdata3 = Drinkdata("cappuccino    ",30)
        val objectDrinkdata4= Drinkdata("coffe               ",25)
        val objectDrinkdata5 = Drinkdata("spresoo          ",40)
        val objectDrinkdata6 = Drinkdata("orchid             ",45)
        val objectDrinkdata7 = Drinkdata("anise               ",15)
        val objectDrinkdata8 = Drinkdata("roselle             ",30)
        val objectDrinkdata9 = Drinkdata("ginger              ",15)
        val objectDrinkdata10= Drinkdata("cinnamon        ",25)
        val objectDrinkdata11 = Drinkdata("fenugreek        ",15)
        val objectDrinkdata12 = Drinkdata("green tea         ",20)
        val objectDrinkdata13 = Drinkdata("Nescafe           ",25)
        val objectDrinkdata14= Drinkdata("Nescafe Black",25)
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
