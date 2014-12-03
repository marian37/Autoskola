/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.databazoveDao;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import sk.upjs.ics.paz1c.autoskola.BeanFactory;
import sk.upjs.ics.paz1c.dao.VozidlaDao;
import sk.upjs.ics.paz1c.entity.Vozidlo;

/**
 *
 * @author marian
 */
public class DatabazoveVozidlaDaoTest {

    private VozidlaDao vozidlaDao = BeanFactory.INSTANCE.getVozidlaDao();

    public DatabazoveVozidlaDaoTest() {
    }

    @Test
    public void testDajVsetky() {
        List<Vozidlo> vozidla = vozidlaDao.dajVsetky();
        assertEquals(5, vozidla.size());
    }

    @Test
    public void testUloz() {
        System.out.println("uloz");
        Vozidlo vozidlo = null;
        DatabazoveVozidlaDao instance = null;
        instance.uloz(vozidlo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testUprav() {
        System.out.println("uprav");
        Vozidlo vozidlo = null;
        DatabazoveVozidlaDao instance = null;
        instance.uprav(vozidlo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testVymaz() {
        System.out.println("vymaz");
        Vozidlo vozidlo = null;
        DatabazoveVozidlaDao instance = null;
        instance.vymaz(vozidlo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
