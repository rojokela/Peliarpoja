package com.peliarpoja.perusoliot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
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
public class PelikokoelmaTest {

    private Pelikokoelma pelit;
    private Peli monopoli;

    public PelikokoelmaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        pelit = new Pelikokoelma();
        monopoli = new Peli("Monopoli", 2, 6);
        pelit.lisaaPeli(monopoli);

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
    public void peliLisaantyyOikeinKokoelmaan() {
        
        List<Peli> lista = pelit.getPelit();
        assertEquals(monopoli, lista.get(0));
    }

    @Test
    public void haePelitPalauttaaOikeanPelin() {
        assertEquals(monopoli, pelit.haePeli("Monopoli"));
    }
    
     @Test
     public void haePelitPalauttaaNullJosEiOleListassa(){
         assertEquals(null, pelit.haePeli("Robottien Sota IV: Harry Potterin Paluu"));
         
}

}
