package com.example.covaid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.switchmaterial.SwitchMaterial;

import java.sql.DatabaseMetaData;
import java.util.List;

public class Vaccination extends AppCompatActivity {

    //references
    Button btn_saveVaccination;
    EditText et_vaccinationName;
    SwitchCompat sw_hep, sw_res, sw_big, sw_eld, sw_ris, sw_com, sw_soc,
            sw_ess, sw_edu, sw_chi, sw_tee, sw_adu, sw_hia, sw_prg, sw_pni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccination);

        btn_saveVaccination = findViewById(R.id.btn_saveVaccination);
        et_vaccinationName = findViewById(R.id.et_vaccinationName);
        sw_hep = findViewById(R.id.sw_hep);
        sw_res = findViewById(R.id.sw_res);
        sw_big = findViewById(R.id.sw_big);
        sw_eld = findViewById(R.id.sw_eld);
        sw_ris = findViewById(R.id.sw_ris);
        sw_com = findViewById(R.id.sw_com);
        sw_soc = findViewById(R.id.sw_soc);
        sw_ess = findViewById(R.id.sw_ess);
        sw_edu = findViewById(R.id.sw_edu);
        sw_chi = findViewById(R.id.sw_chi);
        sw_tee = findViewById(R.id.sw_tee);
        sw_adu = findViewById(R.id.sw_adu);
        sw_hia = findViewById(R.id.sw_hia);
        sw_prg = findViewById(R.id.sw_prg);
        sw_pni = findViewById(R.id.sw_pni);

        btn_saveVaccination.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                VaccinationModel vm;
                try {
                    vm = new VaccinationModel(-1, et_vaccinationName.getText().toString(),
                            sw_hep.isChecked(), sw_res.isChecked(), sw_big.isChecked(), sw_eld.isChecked(),
                            sw_ris.isChecked(), sw_com.isChecked(), sw_soc.isChecked(), sw_ess.isChecked(),
                            sw_edu.isChecked(), sw_chi.isChecked(), sw_tee.isChecked(), sw_adu.isChecked(),
                            sw_hia.isChecked(), sw_prg.isChecked(), sw_pni.isChecked());

                    DataBaseHelper dataBaseHelper = new DataBaseHelper(Vaccination.this);
                    boolean b = dataBaseHelper.addOne(vm);

                    Toast.makeText(Vaccination.this, getApplicationContext().getString(R.string.toast_added_vacc), Toast.LENGTH_SHORT).show();

                } catch (Exception e) {
                    /*vm = new VaccinationModel(-1, "error", false, false, false, false,
                                                false, false, false, false, false, false,
                                                false, false, false, false, false);*/
                    if(e.getMessage().equals("name")){
                        Toast.makeText(Vaccination.this, getApplicationContext().getString(R.string.toast_input_name),
                                Toast.LENGTH_LONG).show();
                    }
                    if(e.getMessage().equals("age")){
                        Toast.makeText(Vaccination.this, getApplicationContext().getString(R.string.toast_groups),
                                Toast.LENGTH_LONG).show();
                    }
                }
                goToVaccList(v);
                //Toast.makeText(Vaccination.this, "Success = " + b, Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void goToVaccList (View view) {
        Intent intent = new Intent(this, VaccList.class);
        startActivity(intent);
    }
}