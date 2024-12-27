package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private Button btnStart, btnBMI, btnCalendar, btnSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home); // Assuming your XML is saved as activity_home.xml

        // Initialize buttons
        btnStart = findViewById(R.id.btnStart);
        btnBMI = findViewById(R.id.btnBMI);
        btnCalendar = findViewById(R.id.btnCalendar);
        btnSettings = findViewById(R.id.btnSettings);

        // Set onClickListeners for each button
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start your main screen or any other activity
                Intent intent = new Intent(HomeActivity.this, StartActivity.class); // Replace with your desired activity
                startActivity(intent);
            }
        });

        btnBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start BMI activity
                Intent intent = new Intent(HomeActivity.this, BmiActivity.class); // Replace with your BMI Activity
                startActivity(intent);
            }
        });

        btnCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Calendar activity
                Intent intent = new Intent(HomeActivity.this, CalenderActivity.class); // Replace with your Calendar Activity
                startActivity(intent);
            }
        });
/*
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Settings activity
                Intent intent = new Intent(HomeActivity.this, SettingsActivity.class); // Replace with your Settings Activity
                startActivity(intent);
            }
        });

         */
    }
}
