package com.peliarpoja.perusoliot;

public class Peliarvostelu {

    private Henkilo arvostelija;
    private Peli peli;
    private int arvosana;

    public int getArvosana() {
        return arvosana;
    }

    public void setArvosana(int arvosana) {
        this.arvosana = arvosana;
    }

    public Henkilo getArvostelija() {
        return arvostelija;
    }

    public void setArvostelija(Henkilo arvostelija) {
        this.arvostelija = arvostelija;
    }

    public Peli getPeli() {
        return peli;
    }

    public void setPeli(Peli peli) {
        this.peli = peli;
    }

    public Peliarvostelu(Henkilo arvostelija, Peli peli, int arvosana) {
        this.arvostelija = arvostelija;
        this.peli = peli;
        this.arvosana = arvosana;
    }

}
