package com.example.covaid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class Symptoms extends AppCompatActivity {

    Button button;
    SwitchCompat sw_dtb, sw_cpp, sw_cnf, sw_tsa, sw_blu, sw_fev, sw_cou, sw_fat, sw_mus, sw_hea, sw_lst, sw_thr, sw_cng, sw_nau, sw_dia;
    SymptomsModel symptoms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        button = (Button) findViewById(R.id.button_what);
        sw_dtb = findViewById(R.id.sw_dtb);
        sw_cpp = findViewById(R.id.sw_cpp);
        sw_cnf = findViewById(R.id.sw_cnf);
        sw_tsa = findViewById(R.id.sw_tsa);
        sw_blu = findViewById(R.id.sw_blu);
        sw_fev = findViewById(R.id.sw_fev);
        sw_cou = findViewById(R.id.sw_cou);
        sw_fat = findViewById(R.id.sw_fat);
        sw_mus = findViewById(R.id.sw_mus);
        sw_hea = findViewById(R.id.sw_hea);
        sw_lst = findViewById(R.id.sw_lst);
        sw_thr = findViewById(R.id.sw_thr);
        sw_cng = findViewById(R.id.sw_cng);
        sw_nau = findViewById(R.id.sw_nau);
        sw_dia = findViewById(R.id.sw_dia);

        DataBaseHelper dbh = new DataBaseHelper(Symptoms.this);

        symptoms = dbh.getSymptoms();

        if(symptoms != null)
        {
            sw_dtb.setChecked(symptoms.isDtb());
            sw_cpp.setChecked(symptoms.isCpp());
            sw_cnf.setChecked(symptoms.isCnf());
            sw_tsa.setChecked(symptoms.isTsa());
            sw_blu.setChecked(symptoms.isBlu());
            sw_fev.setChecked(symptoms.isFev());
            sw_cou.setChecked(symptoms.isCou());
            sw_fat.setChecked(symptoms.isFat());
            sw_mus.setChecked(symptoms.isMus());
            sw_hea.setChecked(symptoms.isHea());
            sw_lst.setChecked(symptoms.isLst());
            sw_thr.setChecked(symptoms.isThr());
            sw_cng.setChecked(symptoms.isCng());
            sw_nau.setChecked(symptoms.isNau());
            sw_dia.setChecked(symptoms.isDia());
        }


        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (v.getId()==R.id.button_what) {
                    if (sw_dtb.isChecked()){
                        //Toast.makeText(getApplicationContext(), "Acude a tu centro de salud más cercano", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Quédate en casa", Toast.LENGTH_SHORT).show();
                    }

                    if(symptoms != null)
                    {
                        try {
                            symptoms.setBlu(sw_blu.isChecked());
                            symptoms.setCnf(sw_cnf.isChecked());
                            symptoms.setCng(sw_cng.isChecked());
                            symptoms.setCou(sw_cou.isChecked());
                            symptoms.setCpp(sw_cpp.isChecked());
                            symptoms.setDia(sw_dia.isChecked());
                            symptoms.setDtb(sw_dtb.isChecked());
                            symptoms.setFat(sw_fat.isChecked());
                            symptoms.setFev(sw_fev.isChecked());
                            symptoms.setThr(sw_thr.isChecked());
                            symptoms.setLst(sw_lst.isChecked());
                            symptoms.setTsa(sw_tsa.isChecked());
                            symptoms.setMus(sw_mus.isChecked());
                            symptoms.setHea(sw_hea.isChecked());
                            symptoms.setNau(sw_nau.isChecked());

                            Toast.makeText(getApplicationContext(), "Guardado", Toast.LENGTH_SHORT).show();

                        } catch (Exception e) {
                            Toast.makeText(getApplicationContext(), "Guardado vacío", Toast.LENGTH_SHORT).show();

                        }

                        boolean b = dbh.updateSymptoms(symptoms);
                    }
                }
            }
        });
    }

}