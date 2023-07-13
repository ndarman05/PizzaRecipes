package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        TextView titleTextView = findViewById(R.id.titleTextView);
        TextView recipeTextView = findViewById(R.id.recipeTextView);

        Intent intent = getIntent();
        if (intent != null) {
            titleTextView.setText(intent.getStringExtra("title"));
            recipeTextView.setText(intent.getStringExtra("recipe"));
        }
    }
}