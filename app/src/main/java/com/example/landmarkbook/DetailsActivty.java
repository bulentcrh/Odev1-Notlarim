package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.landmarkbook.databinding.ActivityDetailsActivtyBinding;

public class DetailsActivty extends AppCompatActivity {

    private ActivityDetailsActivtyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsActivtyBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        // Casting --> Gelen verinin ne olduğunu biliyoruz ve eminiz bu activty de göstermek için kullanırız.
        Landmark selectedLandmark = (Landmark) intent.getSerializableExtra("landmark");

        binding.nameText.setText(selectedLandmark.name);
        binding.nameText.setText(selectedLandmark.country);
        binding.nameText.setText(selectedLandmark.image);


    }
}