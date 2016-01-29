/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peliarpoja.arpoja;

import com.peliarpoja.perusoliot.Peli;
import java.util.List;

/**
 *
 * @author Kompuutteri
 */
public class Arpoja {
    

    public Arpoja() {
       
    }
    
    public Peli arvoPeli(List<Peli> lista) {
        int x = (int)(Math.random() * lista.size());
        return lista.get(x);
        
    }
    
}
