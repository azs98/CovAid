package com.example.covaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSymptoms (View view) {
        Intent intent = new Intent(this, Symptoms.class);
        startActivity(intent);
    }

    public void goToVaccination (View view) {
        Intent intent = new Intent(this, Vaccination.class);
        startActivity(intent);
    }
}