package sk.upjs.ics.paz1c.databazoveDao;

import java.sql.Date;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import sk.upjs.ics.paz1c.autoskola.BeanFactory;
import sk.upjs.ics.paz1c.dao.InstruktoriDao;
import sk.upjs.ics.paz1c.entity.Instruktor;

public class DatabazoveInstruktoriDaoTest {

    private static final int POCET_INSTRUKTOROV_V_DB = 5;

    private InstruktoriDao instruktoriDao = BeanFactory.INSTANCE.getInstruktoriDao();

    public DatabazoveInstruktoriDaoTest() {
    }

    @Test
    public void testDajVsetky() {
        List<Instruktor> instruktori = instruktoriDao.dajVsetky();
        assertEquals(POCET_INSTRUKTOROV_V_DB, instruktori.size());
    }

    @Test
    public void testUloz() {
        testUlozAVymaz();
    }

    @Test
    public void testUprav() {
        List<Instruktor> instruktori = instruktoriDao.dajVsetky();
        Instruktor instruktor = instruktori.get(0);
        String staryKontakt = instruktor.getKontakt();

        instruktor.setKontakt("abc");
        instruktoriDao.uprav(instruktor);
        instruktori = instruktoriDao.dajVsetky();
        assertEquals("abc", instruktori.get(0).getKontakt());

        // Vrati povodnu hodnotu
        instruktor.setKontakt(staryKontakt);
        instruktoriDao.uprav(instruktor);
    }

    @Test
    public void testVymaz() {
        testUlozAVymaz();
    }

    @Test
    public void testUlozAVymaz() {
        List<Instruktor> instruktori = instruktoriDao.dajVsetky();
        int staraVelkost = instruktori.size();

        Instruktor instruktor = new Instruktor();
        instruktor.setMeno("Artur");
        instruktor.setPriezvisko("VeÄ¾kÃ½");
        instruktor.setKontakt("0902345789");

        // Ulozi instruktora
        instruktoriDao.uloz(instruktor);

        instruktori = instruktoriDao.dajVsetky();

        assertEquals(staraVelkost + 1, instruktori.size());

        // Vrati povodny stav - vymaze ulozeneho instruktora        
        instruktoriDao.vymaz(instruktor);

        instruktori = instruktoriDao.dajVsetky();

        assertEquals(staraVelkost, instruktori.size());
    }

}
