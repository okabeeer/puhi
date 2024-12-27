package com.example.myapplication;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AbdominalCrunchActivity extends AppCompatActivity {

    private TextView timerText;
    private Button startButton, resetButton;
    private CountDownTimer countDownTimer;
    private boolean isRunning = false;
    private long timeLeftInMillis = 60000; // 1 minute (60000ms)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abdominalcrunch);

        timerText = findViewById(R.id.timerText);
        startButton = findViewById(R.id.startButton);
        resetButton = findViewById(R.id.resetButton);

        updateTimerText();

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isRunning) {
                    pauseTimer();
                } else {
                    startTimer();
                }
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTimer();
            }
        });
    }

    private void startTimer() {
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateTimerText();
            }

            @Override
            public void onFinish() {
                isRunning = false;
                startButton.setText("START");
            }
        }.start();

        isRunning = true;
        startButton.setText("PAUSE");
    }

    private void pauseTimer() {
        countDownTimer.cancel();
        isRunning = false;
        startButton.setText("START");
    }

    private void resetTimer() {
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        timeLeftInMillis = 60000; // Reset to 1 minute
        updateTimerText();
        isRunning = false;
        startButton.setText("START");
    }

    private void updateTimerText() {
        int minutes = (int) (timeLeftInMillis / 1000) / 60;
        int seconds = (int) (timeLeftInMillis / 1000) % 60;
        timerText.setText(String.format("%02d:%02d", minutes, seconds));
}
}