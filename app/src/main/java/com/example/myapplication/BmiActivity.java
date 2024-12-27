package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BmiActivity extends AppCompatActivity {

    // Déclaration des variables
    EditText etHeight, etWeight;
    TextView tvBMIValue;
    Button btnCheckResult, btnCheckChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        // Liaison des composants XML avec le code Java
        etHeight = findViewById(R.id.etHeight);
        etWeight = findViewById(R.id.etWeight);
        tvBMIValue = findViewById(R.id.tvBMIValue);
        btnCheckResult = findViewById(R.id.btnCheckResult);
        btnCheckChart = findViewById(R.id.btnCheckChart);

        // Action pour calculer le BMI
        btnCheckResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String heightStr = etHeight.getText().toString();
                String weightStr = etWeight.getText().toString();

                if (!heightStr.isEmpty() && !weightStr.isEmpty()) {
                    double height = Double.parseDouble(heightStr) / 100; // Convertir en mètres
                    double weight = Double.parseDouble(weightStr);
                    double bmi = weight / (height * height); // Formule du BMI

                    tvBMIValue.setText(String.format("%.2f", bmi));
                } else {
                    Toast.makeText(BmiActivity.this, "Veuillez entrer la taille et le poids", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Action pour afficher le graphique (placeholder)
        btnCheckChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BmiActivity.this, "Graphique à venir !", Toast.LENGTH_SHORT).show();
            }
});
}
}
