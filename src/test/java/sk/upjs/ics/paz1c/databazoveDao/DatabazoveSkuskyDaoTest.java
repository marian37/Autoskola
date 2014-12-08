package sk.upjs.ics.paz1c.databazoveDao;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import sk.upjs.ics.paz1c.autoskola.BeanFactory;
import sk.upjs.ics.paz1c.dao.InstruktoriDao;
import sk.upjs.ics.paz1c.dao.SkuskyDao;
import sk.upjs.ics.paz1c.dao.StudentiDao;
import sk.upjs.ics.paz1c.entity.Skuska;

public class DatabazoveSkuskyDaoTest {

    private static final int POCET_SKUSOK_V_DB = 5;

    private SkuskyDao skuskyDao = BeanFactory.INSTANCE.getSkuskyDao();

    private InstruktoriDao instruktoriDao = BeanFactory.INSTANCE.getInstruktoriDao();

    private StudentiDao studentiDao = BeanFactory.INSTANCE.getStudentiDao();

    public DatabazoveSkuskyDaoTest() {
    }

    @Test
    public void testDajVsetky() {
        List<Skuska> skusky = skuskyDao.dajVsetky();
        assertEquals(POCET_SKUSOK_V_DB, skusky.size());
    }

    @Test
    public void testUloz() {
        testUlozAVymaz();
    }

    @Test
    public void testUprav() {
        List<Skuska> skusky = skuskyDao.dajVsetky();
        Skuska skuska = skusky.get(0);
        String staryPolicajt = skuska.getPolicajt();

        skuska.setPolicajt("abc");
        skuskyDao.uprav(skuska);
        skusky = skuskyDao.dajVsetky();
        assertEquals("abc", skusky.get(0).getPolicajt());

        // Vrati povodnu hodnotu
        skuska.setPolicajt(staryPolicajt);
        skuskyDao.uprav(skuska);
    }

    @Test
    public void testVymaz() {
        testUlozAVymaz();
    }

    @Test
    public void testUlozAVymaz() {
        List<Skuska> skusky = skuskyDao.dajVsetky();
        int staraVelkost = skusky.size();

        Skuska skuska = new Skuska();
        skuska.setDatum(Date.valueOf("2014-12-08"));
        skuska.setCas(Time.valueOf("09:00:00"));
        skuska.setInstruktor(instruktoriDao.dajVsetky().get(0));
        skuska.setPolicajt("mjr. Michal LeÅ¡ko");
        skuska.setStudenti(studentiDao.dajVsetky().subList(0, 2));

        // Ulozi skusku
        skuskyDao.uloz(skuska);

        skusky = skuskyDao.dajVsetky();

        assertEquals(staraVelkost + 1, skusky.size());

        // Vrati povodny stav - vymaze ulozenu skusku        
        skuskyDao.vymaz(skuska);

        skusky = skuskyDao.dajVsetky();

        assertEquals(staraVelkost, skusky.size());
    }

}
