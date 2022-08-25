package com.example.myapplication_coofe;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
    public class drinkAdapter extends RecyclerView.Adapter<drinkAdapter.Drinkviewholder> {



        ArrayList<Drinkdata> list = new ArrayList<Drinkdata>();

        public drinkAdapter(ArrayList<Drinkdata> list) {
            this.list = list;
        }

        @NonNull
        @Override
        public Drinkviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view, parent, false);
            return new Drinkviewholder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull Drinkviewholder holder, @SuppressLint("RecyclerView") int position) {
            Drinkdata objectDrinkdata = list.get(position);
            holder.TextViewrecyclerview.setText(objectDrinkdata.name);
           // holder.addbutton.setText(objectDrinkdata.price);
            holder.addbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onitemcliclisner.onclic(position,objectDrinkdata);

                }
            });
        }
        Onitemcliclisner onitemcliclisner;
        interface Onitemcliclisner{
            public void onclic(int index,Drinkdata item);

        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        class Drinkviewholder extends RecyclerView.ViewHolder {
            TextView TextViewrecyclerview;
            Button addbutton;
            public Drinkviewholder(@NonNull View itemView) {
                super(itemView);
                TextViewrecyclerview = itemView.findViewById(R.id.TextViewrecyclerview);
                addbutton = itemView.findViewById(R.id.recycler_view_addbuttn);
            }
        }
}
