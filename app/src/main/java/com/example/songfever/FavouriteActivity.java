package com.example.songfever;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.songfever.databinding.ActivityFavouriteBinding;

public class FavouriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Songfever);
        setContentView(R.layout.activity_favourite);
        ActivityFavouriteBinding binding = ActivityFavouriteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //for the back button which returns to the home screen
        binding.backBtn.setOnClickListener(v -> {
            Intent intent = new Intent(FavouriteActivity.this, MainActivity.class);
            startActivity(intent);
        });

        //for the shuffle button which returns to the shuffle screen
        binding.favShuffleBtn.setOnClickListener(v -> {
            Intent intent = new Intent(FavouriteActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}