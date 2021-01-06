package com.example.covaid;

public class SymptomsModel {

    private int id;
    private String name;
    private boolean dtb;
    private boolean cpp;
    private boolean cnf;
    private boolean tsa;
    private boolean blu;
    private boolean fev;
    private boolean cou;
    private boolean fat;
    private boolean mus;
    private boolean hea;
    private boolean lst;
    private boolean thr;
    private boolean cng;
    private boolean nau;
    private boolean dia;

    // constructors

    public SymptomsModel(int id, String name, boolean dtb, boolean cpp, boolean cnf, boolean tsa,
                         boolean blu, boolean fev, boolean cou, boolean fat, boolean mus, boolean hea,
                         boolean lst, boolean thr, boolean cng, boolean nau, boolean dia) {
        this.id = id;
        this.name = name;
        this.dtb = dtb;
        this.cpp = cpp;
        this.cnf = cnf;
        this.tsa = tsa;
        this.blu = blu;
        this.fev = fev;
        this.cou = cou;
        this.fat = fat;
        this.mus = mus;
        this.hea = hea;
        this.lst = lst;
        this.thr = thr;
        this.cng = cng;
        this.nau = nau;
        this.dia = dia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDtb() {
        return dtb;
    }

    public void setDtb(boolean dtb) {
        this.dtb = dtb;
    }

    public boolean isCpp() {
        return cpp;
    }

    public void setCpp(boolean cpp) {
        this.cpp = cpp;
    }

    public boolean isCnf() {
        return cnf;
    }

    public void setCnf(boolean cnf) {
        this.cnf = cnf;
    }

    public boolean isTsa() {
        return tsa;
    }

    public void setTsa(boolean tsa) {
        this.tsa = tsa;
    }

    public boolean isBlu() {
        return blu;
    }

    public void setBlu(boolean blu) {
        this.blu = blu;
    }

    public boolean isFev() {
        return fev;
    }

    public void setFev(boolean fev) {
        this.fev = fev;
    }

    public boolean isCou() {
        return cou;
    }

    public void setCou(boolean cou) {
        this.cou = cou;
    }

    public boolean isFat() {
        return fat;
    }

    public void setFat(boolean fat) {
        this.fat = fat;
    }

    public boolean isMus() {
        return mus;
    }

    public void setMus(boolean mus) {
        this.mus = mus;
    }

    public boolean isHea() {
        return hea;
    }

    public void setHea(boolean hea) {
        this.hea = hea;
    }

    public boolean isLst() {
        return lst;
    }

    public void setLst(boolean lst) {
        this.lst = lst;
    }

    public boolean isThr() {
        return thr;
    }

    public void setThr(boolean thr) {
        this.thr = thr;
    }

    public boolean isCng() {
        return cng;
    }

    public void setCng(boolean cng) {
        this.cng = cng;
    }

    public boolean isNau() {
        return nau;
    }

    public void setNau(boolean nau) {
        this.nau = nau;
    }

    public boolean isDia() {
        return dia;
    }

    public void setDia(boolean dia) {
        this.dia = dia;
    }
}

