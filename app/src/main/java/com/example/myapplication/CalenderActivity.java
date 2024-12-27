package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CalenderActivity extends AppCompatActivity {

    private TimePicker timePicker;
    private Button btnCancel, btnOk, btnCancelAlarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        // Crée le canal de notification
        NotificationHelper.createNotificationChannel(this);

        timePicker = findViewById(R.id.timePicker);
        btnCancel = findViewById(R.id.btnCancel);
        btnOk = findViewById(R.id.btnOk);
        btnCancelAlarm = findViewById(R.id.btnCancelAlarm);

        btnCancel.setOnClickListener(v -> {
            // Action pour annuler
            Toast.makeText(CalenderActivity.this, "Annulé", Toast.LENGTH_SHORT).show();
        });

        btnOk.setOnClickListener(v -> {
            // Action pour confirmer
            int hour = timePicker.getCurrentHour();
            int minute = timePicker.getCurrentMinute();
            Toast.makeText(CalenderActivity.this, "Alarme réglée à " + hour + ":" + minute, Toast.LENGTH_SHORT).show();

            // Affiche la notification
            NotificationHelper.showNotification(this, "Alarme déclenchée", "Il est " + hour + ":" + minute);
        });

        btnCancelAlarm.setOnClickListener(v -> {
            // Action pour annuler l'alarme
            Toast.makeText(CalenderActivity.this, "Alarme annulée", Toast.LENGTH_SHORT).show();
   });
}
}