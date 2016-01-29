/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peliarpoja.arpoja;

import com.peliarpoja.perusoliot.Peli;
import java.util.ArrayList;
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
public class ArpojaTest {

    private Arpoja arpoja;
    private List<Peli> lista;

    public ArpojaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        arpoja = new Arpoja();
        lista = new ArrayList<>();

    }

    @After
    public void tearDown() {
    }

    @Test
    public void tyhjallaListallaArvottaessaPalauttaaNull() {
        assertEquals(null, arpoja.arvoPeli(lista));
    }

    @Test
    public void arvotteassaListallaJokaSisaltaaYhdenPelinPalauttaaSenPelin() {
        Peli peli = new Peli("Monopoli", 2, 8);
        lista.add(peli);
        assertEquals(peli, arpoja.arvoPeli(lista));
    }
    
    @Test
    public void arvottaessaListallaJossaEiOlePelaajaMaaraanSopivaaPeliaPalauttaaNull() {
        Peli peli = new Peli("Ristiseiska", 2, 4);
        lista.add(peli);
        arpoja.setPelaajienMaara(5);
        assertEquals(null, arpoja.arvoPeliPelaajienMaaranMukaan(lista));
    }
    
    @Test
    public void arvottaessaMaksimiTaiMinimiMaarallaPelaajiaPalautuuPeli() {
        Peli peli = new Peli("Monopoli", 2, 8);
        lista.add(peli);
        arpoja.setPelaajienMaara(2);
        assertEquals(peli, arpoja.arvoPeliPelaajienMaaranMukaan(lista));
        arpoja.setPelaajienMaara(8);
        assertEquals(peli, arpoja.arvoPeliPelaajienMaaranMukaan(lista));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
