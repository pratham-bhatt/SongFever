package com.example.songfever;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.songfever.databinding.ActivityPlayerBinding;

public class Player_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Songfever);
        setContentView(R.layout.activity_player);
        ActivityPlayerBinding binding = ActivityPlayerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //for the back button which returns to the home screen
        binding.backBtn.setOnClickListener(v -> {
            Intent intent = new Intent(Player_Activity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}