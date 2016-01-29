/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peliarpoja.arpoja;

import com.peliarpoja.perusoliot.Peli;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kompuutteri
 */
public class Arpoja {
    private int pelaajienMaara;
    public Arpoja() {

    }

    public Peli arvoPeli(List<Peli> lista) {
        if(lista.isEmpty()) {
            return null;
        }
        int x = (int) (Math.random() * lista.size());
        return lista.get(x);

    }

    public Peli arvoPeliPelaajienMaaranMukaan(List<Peli> lista) {
        List<Peli> toinenLista = new ArrayList<>();
        boolean lapi = true;
        for (Peli peli : lista) {
            if (pelaajienMaara <= peli.getMaksimiPelaajaMaara() && pelaajienMaara >= peli.getMinimiPelaajaMaara()) {
                toinenLista.add(peli);
                lapi = false;
            }

        }
        if(lapi) {
            return null;
        }
        return arvoPeli(toinenLista);
    }

    public int getPelaajienMaara() {
        return pelaajienMaara;
    }

    public void setPelaajienMaara(int n) {
        this.pelaajienMaara = n;
    }

}
