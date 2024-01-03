package com.example.songfever;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.songfever.databinding.ActivityPlaylistBinding;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Songfever);
        setContentView(R.layout.activity_playlist);
        ActivityPlaylistBinding binding = ActivityPlaylistBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //for the back button which returns to the home screen
        binding.backBtn.setOnClickListener(v -> {
            Intent intent = new Intent(PlaylistActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}