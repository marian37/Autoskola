package sk.upjs.ics.paz1c.databazoveDao;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import sk.upjs.ics.paz1c.autoskola.BeanFactory;
import sk.upjs.ics.paz1c.dao.SkuskyDao;
import sk.upjs.ics.paz1c.entity.Skuska;

public class DatabazoveSkuskyDaoTest {

    private static final int POCET_SKUSOK_V_DB = 5;

    private SkuskyDao skuskyDao = BeanFactory.INSTANCE.getSkuskyDao();

    public DatabazoveSkuskyDaoTest() {
    }

    @Test
    public void testDajVsetky() {
        List<Skuska> skusky = skuskyDao.dajVsetky();
        assertEquals(POCET_SKUSOK_V_DB, skusky.size());
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
