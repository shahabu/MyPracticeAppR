package com.example.myappr;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        // Set activity name as title (default is the activity label in AndroidManifest.xml)
        getSupportActionBar().setDisplayShowTitleEnabled(true); // Enable title
        getSupportActionBar().setTitle("Profile");  // Set Title
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


        Button infoButton = findViewById(R.id.info_btn);
        Button myCarButton = findViewById(R.id.mycar_btn);
        Button saveButton = findViewById(R.id.profile_save_btn);

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "No Information Available", Toast.LENGTH_SHORT).show();
            }
        });

        myCarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "No Cars Available", Toast.LENGTH_SHORT).show();
            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Your Profile Updated Successfully", Toast.LENGTH_SHORT).show();
            }
        });


    }
}