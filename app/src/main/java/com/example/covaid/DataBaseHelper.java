package com.example.covaid;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String SYMPTOM_TABLE = "SYMPTOM_TABLE";
    public static final String COLUMN_SYMPTOM_NAME = "COLUMN_SYMPTOM_NAME";
    public static final String COLUMN_SYMPTOM_DTB = "COLUMN_SYMPTOM_DTB"; // Difficulty to breathe
    public static final String COLUMN_SYMPTOM_CPP = "COLUMN_SYMPTOM_CPP"; // Chest persistent pain
    public static final String COLUMN_SYMPTOM_CNF = "COLUMN_SYMPTOM_CNF"; // Confusion
    public static final String COLUMN_SYMPTOM_TSA = "COLUMN_SYMPTOM_TSA"; // To stay awake
    public static final String COLUMN_SYMPTOM_BLU = "COLUMN_SYMPTOM_BLU"; // Blue coloration
    public static final String COLUMN_SYMPTOM_FEV = "COLUMN_SYMPTOM_FEV"; // Fever
    public static final String COLUMN_SYMPTOM_COU = "COLUMN_SYMPTOM_COU"; // Cough
    public static final String COLUMN_SYMPTOM_FAT = "COLUMN_SYMPTOM_FAT"; // Fatigue
    public static final String COLUMN_SYMPTOM_MUS = "COLUMN_SYMPTOM_MUS"; // Muscle Pain
    public static final String COLUMN_SYMPTOM_HEA = "COLUMN_SYMPTOM_HEA"; // Headache
    public static final String COLUMN_SYMPTOM_LST = "COLUMN_SYMPTOM_LST"; // Loss of smell or taste
    public static final String COLUMN_SYMPTOM_THR = "COLUMN_SYMPTOM_THR"; // Throat pain
    public static final String COLUMN_SYMPTOM_CNG = "COLUMN_SYMPTOM_CNG"; // Congestion
    public static final String COLUMN_SYMPTOM_NAU = "COLUMN_SYMPTOM_NAU"; // Nausea
    public static final String COLUMN_SYMPTOM_DIA = "COLUMN_SYMPTOM_DIA"; // Diarrhea

    public static final String VACCINATION_TABLE = "VACCINATION_TABLE";
    public static final String COLUMN_VACC_NAME = "COLUMN_VACC_NAME";
    public static final String COLUMN_VACC_PRIORITY = "COLUMN_VACC_PRIORITY";
    public static final String COLUMN_VACC_HEP = "COLUMN_VACC_HEP"; // Health personnel
    public static final String COLUMN_VACC_RES = "COLUMN_VACC_RES"; // Residence for the elderly
    public static final String COLUMN_VACC_BIG = "COLUMN_VACC_BIG"; // Big dependents
    public static final String COLUMN_VACC_ELD = "COLUMN_VACC_ELD"; // Elderly
    public static final String COLUMN_VACC_RIS = "COLUMN_VACC_RIS"; // Health risk conditions
    public static final String COLUMN_VACC_COM = "COLUMN_VACC_COM"; // Community workers
    public static final String COLUMN_VACC_SOC = "COLUMN_VACC_SOC"; // Socioeconomic risk conditions
    public static final String COLUMN_VACC_ESS = "COLUMN_VACC_ESS"; // Essential workers
    public static final String COLUMN_VACC_EDU = "COLUMN_VACC_EDU"; // Education workers
    public static final String COLUMN_VACC_CHI = "COLUMN_VACC_CHI"; // Children
    public static final String COLUMN_VACC_TEE = "COLUMN_VACC_TEE"; // Teenagers
    public static final String COLUMN_VACC_ADU = "COLUMN_VACC_ADU"; // Adults
    public static final String COLUMN_VACC_HIA = "COLUMN_VACC_HIA"; // High incidence areas
    public static final String COLUMN_VACC_PRG = "COLUMN_VACC_PRG"; // Pregnant women
    public static final String COLUMN_VACC_PNI = "COLUMN_VACC_PNI"; // People with natural immunity


    public DataBaseHelper(@Nullable Context context) {
        super(context, "covaid.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createSymptomTableStatement = "CREATE TABLE " + SYMPTOM_TABLE +
                                        " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                            COLUMN_SYMPTOM_NAME + " TEXT, " +
                                            COLUMN_SYMPTOM_DTB + " BOOL, " +
                                            COLUMN_SYMPTOM_CPP + " BOOL, " +
                                            COLUMN_SYMPTOM_CNF + " BOOL, " +
                                            COLUMN_SYMPTOM_TSA + " BOOL, " +
                                            COLUMN_SYMPTOM_BLU + " BOOL, " +
                                            COLUMN_SYMPTOM_FEV + " BOOL, " +
                                            COLUMN_SYMPTOM_COU + " BOOL, " +
                                            COLUMN_SYMPTOM_FAT + " BOOL, " +
                                            COLUMN_SYMPTOM_MUS + " BOOL, " +
                                            COLUMN_SYMPTOM_HEA + " BOOL, " +
                                            COLUMN_SYMPTOM_LST + " BOOL, " +
                                            COLUMN_SYMPTOM_THR + " BOOL, " +
                                            COLUMN_SYMPTOM_CNG + " BOOL, " +
                                            COLUMN_SYMPTOM_NAU + " BOOL, " +
                                            COLUMN_SYMPTOM_DIA + " BOOL)";

        String createVaccinationTableStatement = "CREATE TABLE " + VACCINATION_TABLE +
                                        " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                            COLUMN_VACC_NAME + " TEXT, " +
                                            COLUMN_VACC_PRIORITY + " TEXT, " +
                                            COLUMN_VACC_HEP + " BOOL, " +
                                            COLUMN_VACC_RES + " BOOL, " +
                                            COLUMN_VACC_BIG + " BOOL, " +
                                            COLUMN_VACC_ELD + " BOOL, " +
                                            COLUMN_VACC_RIS + " BOOL, " +
                                            COLUMN_VACC_COM + " BOOL, " +
                                            COLUMN_VACC_SOC + " BOOL, " +
                                            COLUMN_VACC_ESS + " BOOL, " +
                                            COLUMN_VACC_EDU + " BOOL, " +
                                            COLUMN_VACC_CHI + " BOOL, " +
                                            COLUMN_VACC_TEE + " BOOL, " +
                                            COLUMN_VACC_ADU + " BOOL, " +
                                            COLUMN_VACC_HIA + " BOOL, " +
                                            COLUMN_VACC_PRG + " BOOL, " +
                                            COLUMN_VACC_PNI + " BOOL)";

        String insertSymptomsStatement = "INSERT INTO " + SYMPTOM_TABLE +
                " (ID, " + COLUMN_SYMPTOM_NAME + " , " + COLUMN_SYMPTOM_DTB + " , " +
                COLUMN_SYMPTOM_CPP + " , " + COLUMN_SYMPTOM_CNF + " , " +
                COLUMN_SYMPTOM_TSA + " , " + COLUMN_SYMPTOM_BLU + " , " +
                COLUMN_SYMPTOM_FEV + " , " + COLUMN_SYMPTOM_COU + " , " +
                COLUMN_SYMPTOM_FAT + " , " + COLUMN_SYMPTOM_MUS + " , " +
                COLUMN_SYMPTOM_HEA + " , " + COLUMN_SYMPTOM_LST + " , " +
                COLUMN_SYMPTOM_THR + " , " + COLUMN_SYMPTOM_CNG + " , " +
                COLUMN_SYMPTOM_NAU + " , " + COLUMN_SYMPTOM_DIA + ")" +
                " VALUES (1, 'unique', " +
                "0, 0, 0, 0, 0, 0, 0, 0, " +
                "0, 0, 0, 0, 0, 0, 0)";

        db.execSQL(createSymptomTableStatement);
        db.execSQL(createVaccinationTableStatement);
        db.execSQL(insertSymptomsStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean addOne(VaccinationModel vm){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_VACC_NAME , vm.getName());
        cv.put(COLUMN_VACC_PRIORITY, vm.getPriority());
        cv.put(COLUMN_VACC_HEP , vm.isHep());
        cv.put(COLUMN_VACC_RES , vm.isRes());
        cv.put(COLUMN_VACC_BIG , vm.isBig());
        cv.put(COLUMN_VACC_ELD , vm.isEld());
        cv.put(COLUMN_VACC_RIS , vm.isRis());
        cv.put(COLUMN_VACC_COM , vm.isCom());
        cv.put(COLUMN_VACC_SOC , vm.isSoc());
        cv.put(COLUMN_VACC_ESS , vm.isEss());
        cv.put(COLUMN_VACC_EDU , vm.isEdu());
        cv.put(COLUMN_VACC_CHI , vm.isChi());
        cv.put(COLUMN_VACC_TEE , vm.isTee());
        cv.put(COLUMN_VACC_ADU , vm.isAdu());
        cv.put(COLUMN_VACC_HIA , vm.isHia());
        cv.put(COLUMN_VACC_PRG , vm.isPrg());
        cv.put(COLUMN_VACC_PNI , vm.isPni());

        long insert = db.insert(VACCINATION_TABLE, null, cv);

        if(insert == -1){
            return false;
        } else {
            return true;
        }
    }

    public boolean updateSymptoms(SymptomsModel sm) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_SYMPTOM_NAME, sm.getName());
        cv.put(COLUMN_SYMPTOM_DTB, sm.isDtb());
        cv.put(COLUMN_SYMPTOM_CPP, sm.isCpp());
        cv.put(COLUMN_SYMPTOM_CNF, sm.isCnf());
        cv.put(COLUMN_SYMPTOM_TSA, sm.isTsa());
        cv.put(COLUMN_SYMPTOM_BLU, sm.isBlu());
        cv.put(COLUMN_SYMPTOM_FEV, sm.isFev());
        cv.put(COLUMN_SYMPTOM_COU, sm.isCou());
        cv.put(COLUMN_SYMPTOM_FAT, sm.isFat());
        cv.put(COLUMN_SYMPTOM_MUS, sm.isMus());
        cv.put(COLUMN_SYMPTOM_HEA, sm.isHea());
        cv.put(COLUMN_SYMPTOM_LST, sm.isLst());
        cv.put(COLUMN_SYMPTOM_THR, sm.isThr());
        cv.put(COLUMN_SYMPTOM_CNG, sm.isCng());
        cv.put(COLUMN_SYMPTOM_NAU, sm.isNau());
        cv.put(COLUMN_SYMPTOM_DIA, sm.isDia());

        int update = db.update(SYMPTOM_TABLE, cv, COLUMN_SYMPTOM_NAME + "= 'unique'", null);

        if(update == -1){
            return false;
        } else {
            return true;
        }
    }

    public SymptomsModel getSymptoms() {
        SymptomsModel sm;

        SQLiteDatabase db = this.getReadableDatabase();

        String queryString = "SELECT * FROM " + SYMPTOM_TABLE + " WHERE " + COLUMN_SYMPTOM_NAME + "='unique'";

        Cursor cursor = db.rawQuery(queryString, null);

        boolean eee = cursor.moveToFirst();

        if(cursor.moveToFirst()){
                int id = cursor.getInt(0);
                String name = cursor.getString(1);
                boolean dtb = cursor.getInt(2) == 1;
                boolean cpp = cursor.getInt(3) == 1;
                boolean cnf = cursor.getInt(4) == 1;
                boolean tsa = cursor.getInt(5) == 1;
                boolean blu = cursor.getInt(6) == 1;
                boolean fev = cursor.getInt(7) == 1;
                boolean cou = cursor.getInt(8) == 1;
                boolean fat = cursor.getInt(9) == 1;
                boolean mus = cursor.getInt(10) == 1;
                boolean hea = cursor.getInt(11) == 1;
                boolean lst = cursor.getInt(12) == 1;
                boolean thr = cursor.getInt(13) == 1;
                boolean cng = cursor.getInt(14) == 1;
                boolean nau = cursor.getInt(15) == 1;
                boolean dia = cursor.getInt(16) == 1;

                sm = new SymptomsModel(id, name, dtb, cpp, cnf, tsa, blu,
                        fev, cou, fat, mus, hea, lst, thr, cng, nau, dia);
        }else{
            sm = null;
        }
        cursor.close();
        db.close();
        return sm;
    }

    public List<VaccinationModel> getVaccinations(){
        List<VaccinationModel> returnList = new ArrayList<>();

        String queryString = "SELECT * FROM " + VACCINATION_TABLE;

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(queryString, null);

        if(cursor.moveToFirst()){
            do {
                int id = cursor.getInt(0);
                String name = cursor.getString(1);
                String priority = cursor.getString(2);
                boolean hep = cursor.getInt(3) == 1;
                boolean res = cursor.getInt(4) == 1;
                boolean big = cursor.getInt(5) == 1;
                boolean eld = cursor.getInt(6) == 1;
                boolean ris = cursor.getInt(7) == 1;
                boolean com = cursor.getInt(8) == 1;
                boolean soc = cursor.getInt(9) == 1;
                boolean ess = cursor.getInt(10) == 1;
                boolean edu = cursor.getInt(11) == 1;
                boolean chi = cursor.getInt(12) == 1;
                boolean tee = cursor.getInt(13) == 1;
                boolean adu = cursor.getInt(14) == 1;
                boolean hia = cursor.getInt(15) == 1;
                boolean prg = cursor.getInt(16) == 1;
                boolean pni = cursor.getInt(17) == 1;

                try {
                    VaccinationModel vc = new VaccinationModel(id, name, hep, res, big, eld, ris,
                            com, soc, ess, edu, chi, tee, adu, hia, prg, pni);
                    returnList.add(vc);
                }catch (Exception e){}

            } while (cursor.moveToNext());
        }else{

        }
        cursor.close();
        db.close();
        return returnList;
    }
}
