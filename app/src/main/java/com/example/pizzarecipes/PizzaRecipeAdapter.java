package com.example.pizzarecipes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class PizzaRecipeAdapter extends RecyclerView.Adapter<PizzaRecipeAdapter.PizzaRecipeViewHolder> {

    ArrayList<PizzaRecipeItem> pizzaRecipeItems;

    public PizzaRecipeAdapter(ArrayList<PizzaRecipeItem> pizzaRecipeItems) {
        this.pizzaRecipeItems = pizzaRecipeItems;
    }
    @NonNull
    @Override
    public PizzaRecipeAdapter.PizzaRecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pizza_recipe_item, parent, false);
        PizzaRecipeViewHolder pizzaRecipeViewHolder = new PizzaRecipeViewHolder(view);
        return pizzaRecipeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaRecipeViewHolder viewHolder, int position) {
        PizzaRecipeItem pizzaRecipeItem = pizzaRecipeItems.get(position);

        viewHolder.pizzaImageView.setImageResource(pizzaRecipeItem.getImageResource());
        viewHolder.title.setText(pizzaRecipeItem.getTitle());
        viewHolder.description.setText(pizzaRecipeItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return pizzaRecipeItems.size();
    }

    public static class PizzaRecipeViewHolder extends RecyclerView.ViewHolder {

        public ImageView pizzaImageView;
        public TextView title;
        public TextView description;

        public PizzaRecipeViewHolder(@NonNull View itemView) {
            super(itemView);

            pizzaImageView = itemView.findViewById(R.id.pizzaImageView);
            title = itemView.findViewById(R.id.titleTextView);
            description = itemView.findViewById(R.id.descriptionTextView);
        }
    }
}
