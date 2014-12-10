package sk.upjs.ics.paz1c.databazoveDao;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import sk.upjs.ics.paz1c.autoskola.BeanFactory;
import sk.upjs.ics.paz1c.dao.InstruktoriDao;
import sk.upjs.ics.paz1c.dao.JazdyDao;
import sk.upjs.ics.paz1c.dao.StudentiDao;
import sk.upjs.ics.paz1c.dao.VozidlaDao;
import sk.upjs.ics.paz1c.entity.Jazda;

public class DatabazoveJazdyDaoTest {

    private static final int POCET_JAZD_V_DB = 5;

    private final JazdyDao jazdyDao = BeanFactory.INSTANCE.getJazdyDao();

    private final StudentiDao studentiDao = BeanFactory.INSTANCE.getStudentiDao();

    private final InstruktoriDao instruktoriDao = BeanFactory.INSTANCE.getInstruktoriDao();

    private final VozidlaDao vozidlaDao = BeanFactory.INSTANCE.getVozidlaDao();

    public DatabazoveJazdyDaoTest() {
    }

    @BeforeClass
    public static void setUpTests() {
        System.setProperty("testovaciRezim", "true");
    }

    @Test
    public void testDajVsetky() {
        List<Jazda> jazdy = jazdyDao.dajVsetky();
        assertEquals(POCET_JAZD_V_DB, jazdy.size());
    }

    @Test
    public void testUprav() {
        List<Jazda> jazdy = jazdyDao.dajVsetky();
        Jazda jazda = jazdy.get(0);
        Time staryCas = jazda.getCas();

        jazda.setCas(Time.valueOf("00:00:00"));
        jazdyDao.uprav(jazda);
        jazdy = jazdyDao.dajVsetky();
        assertEquals(Time.valueOf("00:00:00"), jazdy.get(0).getCas());

        // Vrati povodnu hodnotu
        jazda.setCas(staryCas);
        jazdyDao.uprav(jazda);
    }

    @Test
    public void testUlozAVymaz() {
        List<Jazda> jazdy = jazdyDao.dajVsetky();
        int staraVelkost = jazdy.size();

        Jazda jazda = new Jazda();
        jazda.setStudent(studentiDao.dajVsetky().get(0));
        jazda.setInstruktor(instruktoriDao.dajVsetky().get(0));
        jazda.setVozidlo(vozidlaDao.dajVsetky().get(0));
        jazda.setDatum(Date.valueOf("2014-12-09"));
        jazda.setCas(Time.valueOf("08:30:00"));
        jazda.setKm(20);
        jazda.setvPremavke(true);
        jazda.setNaCvicisku(false);
        jazda.setsVozikom(false);

        // Ulozi jazdu
        jazdyDao.uloz(jazda);

        jazdy = jazdyDao.dajVsetky();

        assertEquals(staraVelkost + 1, jazdy.size());

        // Vrati povodny stav - vymaze ulozenu jazdu
        jazdyDao.vymaz(jazda);

        jazdy = jazdyDao.dajVsetky();

        assertEquals(staraVelkost, jazdy.size());
    }

}
