/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peliarpoja;

import com.peliarpoja.arpoja.Arpoja;
import com.peliarpoja.perusoliot.Henkilo;
import com.peliarpoja.perusoliot.Peli;
import com.peliarpoja.perusoliot.Pelikokoelma;

/**
 *
 * @author Kompuutteri
 */
public class Main {

    public static void main(String [] args) {
        Arpoja arpoja = new Arpoja();
        Henkilo a = new Henkilo("Roni");
        Pelikokoelma pelit = new Pelikokoelma();
        Peli Monopoli = new Peli("Monopoli", 2, 6);
        Peli Monopoli2 = new Peli("Monopoli2", 2, 6);
        Peli Monopoli3 = new Peli("Monopoli3", 2, 6);
        pelit.lisaaPeli(Monopoli);
        System.out.println(arpoja.arvoPeli(pelit.getPelit()));
    }
    
    
}
