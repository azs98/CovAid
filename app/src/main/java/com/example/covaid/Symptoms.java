package com.example.covaid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class Symptoms extends AppCompatActivity {

    Button button;
    Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        switch1 = (Switch) findViewById(R.id.switch1);
        button = (Button) findViewById(R.id.button_what);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (v.getId()==R.id.button_what) {
                    if (switch1.isChecked()){
                        Toast.makeText(getApplicationContext(), "Ve al hospi", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Quédate", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

}