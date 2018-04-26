package com.example.jonmid.practicaborder.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jonmid.practicaborder.Models.Food;
import com.example.jonmid.practicaborder.R;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.Viewholder> {


    List<Food> foodList = new ArrayList<>();

    Context context;

    // Constuctor de la clase
    public FoodAdapter(List<Food> countryList, Context context) {
        this.foodList = foodList;
        this.context = context;

    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //configuracion inicial
        // Obtener el archivo de item (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);

        //Pasar el archivo .xml al ViewHolder
        Viewholder viewHolder = new Viewholder(item);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        //Asignar los valores a la vista
        holder.textViewTitle.setText(foodList.get(position).getTitle());


    }

    @Override
    public int getItemCount() {

        return foodList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        TextView textViewTitle;


        public Viewholder(View itemView) {
            super(itemView);

            textViewTitle = (TextView) itemView.findViewById(R.id.id_txv_food_title);

        }
    }
}
