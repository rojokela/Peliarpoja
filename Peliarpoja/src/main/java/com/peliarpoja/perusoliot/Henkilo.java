package com.peliarpoja.perusoliot;

import java.util.ArrayList;
import java.util.List;

public class Henkilo {

    private String nimi;
    private List<Peliarvostelu> arvostelut;

    public Henkilo(String nimi) {
        this.nimi = nimi;
        this.arvostelut = new ArrayList<>();

    }

    public void arvostelePeli(Peli peli, int arvosana) {
        Henkilo henkilo = this;
        Peliarvostelu a = new Peliarvostelu(henkilo, peli, arvosana);
        this.arvostelut.add(a);
    }
    

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public List<Peliarvostelu> getArvostelut() {
        return arvostelut;
    }

    public void setArvostelut(List<Peliarvostelu> arvostelut) {
        this.arvostelut = arvostelut;
    }

}
