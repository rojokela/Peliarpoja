package com.peliarpoja.perusoliot;

public class Peli {

    private String nimi;
    private int minimiPelaajaMaara;
    private int maksimiPelaajaMaara;

    public Peli(String nimi, int minimiPelaajaMaara, int maksimiPelaajaMaara) {
        this.nimi = nimi;
        this.minimiPelaajaMaara = minimiPelaajaMaara;
        this.maksimiPelaajaMaara = maksimiPelaajaMaara;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getMinimiPelaajaMaara() {
        return minimiPelaajaMaara;
    }

    public void setMinimiPelaajaMaara(int minimiPelaajaMaara) {
        this.minimiPelaajaMaara = minimiPelaajaMaara;
    }

    public int getMaksimiPelaajaMaara() {
        return maksimiPelaajaMaara;
    }

    public void setMaksimiPelaajaMaara(int maksimiPelaajaMaara) {
        this.maksimiPelaajaMaara = maksimiPelaajaMaara;
    }
    
    public String toString(){
        return this.nimi;
    }

}
