package sk.upjs.ics.paz1c.databazoveDao;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import sk.upjs.ics.paz1c.autoskola.BeanFactory;
import sk.upjs.ics.paz1c.dao.JazdyDao;
import sk.upjs.ics.paz1c.entity.Jazda;

public class DatabazoveJazdyDaoTest {

    private static final int POCET_JAZD_V_DB = 5;

    private JazdyDao jazdyDao = BeanFactory.INSTANCE.getJazdyDao();

    public DatabazoveJazdyDaoTest() {
    }

    @Test
    public void testDajVsetky() {
        List<Jazda> jazdy = jazdyDao.dajVsetky();
        assertEquals(POCET_JAZD_V_DB, jazdy.size());
    }

    @Test
    public void testUloz() {
    }

    @Test
    public void testUprav() {
    }

    @Test
    public void testVymaz() {
    }

}
