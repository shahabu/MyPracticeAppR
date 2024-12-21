package com.example.myappr;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NearestVehicle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nearest_vehicle);

        // Set activity name as title (default is the activity label in AndroidManifest.xml)
        getSupportActionBar().setDisplayShowTitleEnabled(true); // Enable title
        getSupportActionBar().setTitle("Nearest Vehicle");  // Set Title
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);  // show back button

        // Set a custom status bar color
        //  getWindow().setStatusBarColor(getResources().getColor(com.google.android.material.R.color.design_default_color_primary_variant));
        getWindow().setStatusBarColor(getResources().getColor(R.color.customStatusBarColor));

        //  Change the back arrow color
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow); // Set the custom back arrow


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}