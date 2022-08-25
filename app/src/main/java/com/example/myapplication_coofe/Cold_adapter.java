package com.example.myapplication_coofe;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Cold_adapter extends RecyclerView.Adapter<Cold_adapter.Cold_view_holder> {

    ArrayList<Drinkdata> coldlist = new ArrayList();

    public Cold_adapter(ArrayList<Drinkdata> coldlist) {
        this.coldlist = coldlist;
    }

    @NonNull
    @Override
    public Cold_view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view,parent,false);
        return new Cold_view_holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Cold_view_holder holder, int position) {
    Drinkdata objdrinkdata = coldlist.get(position);
    holder.TextViewrecyclerview.setText(objdrinkdata.getName());
    }

    @Override
    public int getItemCount() {
        return coldlist.size();
    }

    class Cold_view_holder extends RecyclerView.ViewHolder{

        TextView TextViewrecyclerview;
        Button addbutton;

         public Cold_view_holder(@NonNull View itemView) {
             super(itemView);
             TextViewrecyclerview = itemView.findViewById(R.id.TextViewrecyclerview);
             addbutton = itemView.findViewById(R.id.recycler_view_addbuttn);



         }
     }

}
