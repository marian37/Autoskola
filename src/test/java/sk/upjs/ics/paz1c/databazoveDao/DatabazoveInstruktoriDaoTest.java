package sk.upjs.ics.paz1c.databazoveDao;

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
        System.out.println("uloz");
        Instruktor instruktor = null;
        DatabazoveInstruktoriDao instance = null;
        instance.uloz(instruktor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testUprav() {
        System.out.println("uprav");
        Instruktor instruktor = null;
        DatabazoveInstruktoriDao instance = null;
        instance.uprav(instruktor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testVymaz() {
        System.out.println("vymaz");
        Instruktor instruktor = null;
        DatabazoveInstruktoriDao instance = null;
        instance.vymaz(instruktor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
