package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    private LinearLayout mountainClimberLayout, abdominalCrunchLayout, squatTwistLayout, russianTwistLayout,
            pushUpFromKneeLayout, pushUpWithOneHandLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        // Initialize layouts
        mountainClimberLayout = findViewById(R.id.LY1);
        abdominalCrunchLayout = findViewById(R.id.LY2);
        squatTwistLayout = findViewById(R.id.LY3);
        russianTwistLayout = findViewById(R.id.LY4);
        pushUpFromKneeLayout = findViewById(R.id.LY5);
        pushUpWithOneHandLayout = findViewById(R.id.LY6);

        // Set click listeners for each exercise layout
        mountainClimberLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, MountainClimberActivity.class); // Replace with your desired activity
                startActivity(intent);
            }
        });

        abdominalCrunchLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, AbdominalCrunchActivity.class); // Replace with your desired activity
                startActivity(intent);
            }
        });

        squatTwistLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, SquatJumpActivity.class); // Replace with your desired activity
                startActivity(intent);
            }
        });

        russianTwistLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, RussianTwistActivity.class); // Replace with your desired activity
                startActivity(intent);
            }
        });

        pushUpFromKneeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, PUSKActivity.class); // Replace with your desired activity
                startActivity(intent);
            }
        });

        pushUpWithOneHandLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, PushUpWithOneHandActivity.class); // Replace with your desired activity
                startActivity(intent);
            }
        });


    }

}
