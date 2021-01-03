package com.example.covaid;

public class VaccinationModel {

    private int id;
    private String name;
    private String priority;
    private boolean hea;
    private boolean res;
    private boolean big;
    private boolean eld;
    private boolean ris;
    private boolean com;
    private boolean soc;
    private boolean ess;
    private boolean edu;
    private boolean chi;
    private boolean tee;
    private boolean adu;
    private boolean hia;
    private boolean prg;
    private boolean pni;

    // constructors

    public VaccinationModel(int id, String name, boolean hea, boolean res, boolean big, boolean eld,
                            boolean ris, boolean com, boolean soc, boolean ess, boolean edu, boolean chi,
                            boolean tee, boolean adu, boolean hia, boolean prg, boolean pni) {
        this.id = id;
        this.name = name;
        this.hea = hea;
        this.res = res;
        this.big = big;
        this.eld = eld;
        this.ris = ris;
        this.com = com;
        this.soc = soc;
        this.ess = ess;
        this.edu = edu;
        this.chi = chi;
        this.tee = tee;
        this.adu = adu;
        this.hia = hia;
        this.prg = prg;
        this.pni = pni;

        if(this.hea || this.res || this.big || this.eld){
            this.priority = "Enero - Marzo";
        }else{
            this.priority = "A partir de Marzo";
        }
    }

    // getters and setters

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

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean isHea() {
        return hea;
    }

    public void setHea(boolean hea) {
        this.hea = hea;
    }

    public boolean isRes() {
        return res;
    }

    public void setRes(boolean res) {
        this.res = res;
    }

    public boolean isBig() {
        return big;
    }

    public void setBig(boolean big) {
        this.big = big;
    }

    public boolean isEld() {
        return eld;
    }

    public void setEld(boolean eld) {
        this.eld = eld;
    }

    public boolean isRis() {
        return ris;
    }

    public void setRis(boolean ris) {
        this.ris = ris;
    }

    public boolean isCom() {
        return com;
    }

    public void setCom(boolean com) {
        this.com = com;
    }

    public boolean isSoc() {
        return soc;
    }

    public void setSoc(boolean soc) {
        this.soc = soc;
    }

    public boolean isEss() {
        return ess;
    }

    public void setEss(boolean ess) {
        this.ess = ess;
    }

    public boolean isEdu() {
        return edu;
    }

    public void setEdu(boolean edu) {
        this.edu = edu;
    }

    public boolean isChi() {
        return chi;
    }

    public void setChi(boolean chi) {
        this.chi = chi;
    }

    public boolean isTee() {
        return tee;
    }

    public void setTee(boolean tee) {
        this.tee = tee;
    }

    public boolean isAdu() {
        return adu;
    }

    public void setAdu(boolean adu) {
        this.adu = adu;
    }

    public boolean isHia() {
        return hia;
    }

    public void setHia(boolean hia) {
        this.hia = hia;
    }

    public boolean isPrg() {
        return prg;
    }

    public void setPrg(boolean prg) {
        this.prg = prg;
    }

    public boolean isPni() {
        return pni;
    }

    public void setPni(boolean pni) {
        this.pni = pni;
    }

    @Override
    public String toString() {
        return "VaccinationModel{" +
                "name='" + name + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }
}
