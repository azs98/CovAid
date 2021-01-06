package com.example.covaid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class Symptoms extends AppCompatActivity {

    Button button;
    Switch sw_dtb, sw_cpp, sw_cnf, sw_tsa, sw_blu, sw_fev, sw_cou, sw_fat, sw_mus, sw_hea, sw_lst, sw_thr, sw_cng, sw_nau, sw_dia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        button = (Button) findViewById(R.id.button_what);
        sw_dtb = (Switch) findViewById(R.id.sw_dtb);
        sw_cpp = (Switch) findViewById(R.id.sw_cpp);
        sw_tsa = (Switch) findViewById(R.id.sw_tsa);
        sw_blu = (Switch) findViewById(R.id.sw_blu);
        sw_fev = (Switch) findViewById(R.id.sw_fev);
        sw_cou = (Switch) findViewById(R.id.sw_cou);
        sw_fat = (Switch) findViewById(R.id.sw_fat);
        sw_mus = (Switch) findViewById(R.id.sw_mus);
        sw_hea = (Switch) findViewById(R.id.sw_hea);
        sw_lst = (Switch) findViewById(R.id.sw_lst);
        sw_thr = (Switch) findViewById(R.id.sw_thr);
        sw_cng = (Switch) findViewById(R.id.sw_cng);
        sw_nau = (Switch) findViewById(R.id.sw_nau);
        sw_dia = (Switch) findViewById(R.id.sw_dia);

        DataBaseHelper dbh = new DataBaseHelper(Symptoms.this);

        if(dbh.getSymptoms() != null)
        {
            sw_dtb.setChecked(true);
            sw_dtb.setChecked(dbh.getSymptoms().isDtb());
            sw_cpp.setChecked(dbh.getSymptoms().isCpp());
            sw_tsa.setChecked(dbh.getSymptoms().isTsa());
            sw_blu.setChecked(dbh.getSymptoms().isBlu());
            sw_fev.setChecked(dbh.getSymptoms().isFev());
            sw_cou.setChecked(dbh.getSymptoms().isCou());
            sw_fat.setChecked(dbh.getSymptoms().isFat());
            sw_mus.setChecked(dbh.getSymptoms().isMus());
            sw_hea.setChecked(dbh.getSymptoms().isHea());
            sw_lst.setChecked(dbh.getSymptoms().isLst());
            sw_thr.setChecked(dbh.getSymptoms().isThr());
            sw_cng.setChecked(dbh.getSymptoms().isCng());
            sw_nau.setChecked(dbh.getSymptoms().isNau());
            sw_dia.setChecked(dbh.getSymptoms().isDia());
        }


        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (v.getId()==R.id.button_what) {
                    if (sw_dtb.isChecked()){
                        Toast.makeText(getApplicationContext(), "Acude a tu centro de salud más cercano", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Quédate en casa", Toast.LENGTH_SHORT).show();
                    }


                    if(dbh.getSymptoms() == null)
                    {
                        SymptomsModel sm;
                        try {
                            sm = new SymptomsModel(-1, "aaa",
                                    sw_dtb.isChecked(), sw_cpp.isChecked(), sw_cnf.isChecked(), sw_tsa.isChecked(),
                                    sw_blu.isChecked(), sw_fev.isChecked(), sw_cou.isChecked(), sw_fat.isChecked(),
                                    sw_mus.isChecked(), sw_hea.isChecked(), sw_lst.isChecked(), sw_thr.isChecked(),
                                    sw_cng.isChecked(), sw_nau.isChecked(), sw_dia.isChecked());
                            Toast.makeText(getApplicationContext(), "Guardado", Toast.LENGTH_SHORT).show();

                        } catch (Exception e) {
                            sm = new SymptomsModel(-1, "",
                                    false, false, false, false,
                                    false, false, false, false,
                                    false, false, false, false,
                                    false, false, false);
                            Toast.makeText(getApplicationContext(), "Guardado vacío", Toast.LENGTH_SHORT).show();

                        }

                        boolean b = dbh.addSymptoms(sm);
                    }
                }
            }
        });
    }

}