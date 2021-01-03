package com.example.covaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class VaccList extends AppCompatActivity {

    Button btn_addVaccination;
    ListView lv_vaccinationList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacc_list);

        btn_addVaccination = findViewById(R.id.btn_addVaccination);
        lv_vaccinationList = findViewById(R.id.lv_vaccinationList);

        DataBaseHelper dbh = new DataBaseHelper(VaccList.this);
        List<VaccinationModel> vaccinationList = dbh.getVaccinations();
        ArrayAdapter vaccArrayAdapter = new ArrayAdapter<VaccinationModel>(VaccList.this,
                android.R.layout.simple_list_item_1, vaccinationList);
        lv_vaccinationList.setAdapter(vaccArrayAdapter);
    }

    public void goToVaccination (View view) {
        Intent intent = new Intent(this, Vaccination.class);
        startActivity(intent);
    }
}