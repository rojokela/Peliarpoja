/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peliarpoja.perusoliot;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kompuutteri
 */
public class Pelikokoelma {
    private List<Peli> pelit;

    public Pelikokoelma() {
        this.pelit = new ArrayList<>();
    }
    
    public void lisaaPeli(Peli peli) {
        this.pelit.add(peli);
    }
    
    public List<Peli> getPelit() {
        return pelit;
    }

    public void setPelit(List<Peli> pelit) {
        this.pelit = pelit;
    }
    
    
}
