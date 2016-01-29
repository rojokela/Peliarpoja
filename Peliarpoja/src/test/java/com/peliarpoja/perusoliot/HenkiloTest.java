/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peliarpoja.perusoliot;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kompuutteri
 */
public class HenkiloTest {
    private Henkilo hlo;
    public HenkiloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        hlo = new Henkilo("Teppo Testaaja");
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void toStringToimiiOikein() {
        assertEquals("Teppo Testaaja", hlo.toString());
        
    }
     @Test
    public void arvostelulistaOnTyhjäAlkuun(){
        assertEquals(true, hlo.getArvostelut().isEmpty());
    }
    @Test
    public void peliArvostelujenLuontiToimiiOikein() {
        Peli peli = new Peli("Pullonpyöritys", 2, 360);
        hlo.arvostelePeli(peli, 2);
        
        assertEquals(2,hlo.getArvostelut().get(0).getArvosana());
    }
    
   
}
