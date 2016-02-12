/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peliarpoja.perusoliot;

import java.util.ArrayList;
import java.util.List;


public class Pelisessio {
    
    private List<Henkilo> pelaajat;

    public Pelisessio() {
        pelaajat = new ArrayList<>();
    }
    
    public void lisaaPelaaja(Henkilo h) {
        pelaajat.add(h);
    }
    
    public void poistaPelaaja(Henkilo h) {
        pelaajat.remove(h);
    }
    
    public List<Henkilo> getPelaajat() {
        return pelaajat;
    }
    
    public List<Peli> haeArvosteluLista(){
        List<Peli> lista = new ArrayList<>();
        for (Henkilo henkilo : pelaajat) {
            List<Peliarvostelu> henkiloLista = henkilo.getArvostelut();
            for (Peliarvostelu peliarvostelu : henkiloLista) {
                if(peliarvostelu.getArvosana() > 0 ) {
                    lista.add(peliarvostelu.getPeli());
                }
            }
        }
        
        return lista;
    }
 
    
}
