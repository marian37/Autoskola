package sk.upjs.ics.paz1c.databazoveDao;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import sk.upjs.ics.paz1c.autoskola.BeanFactory;
import sk.upjs.ics.paz1c.dao.StudentiDao;
import sk.upjs.ics.paz1c.entity.Student;

public class DatabazoveStudentiDaoTest {

    private static final int POCET_STUDENTOV_V_DB = 5;

    private StudentiDao studentiDao = BeanFactory.INSTANCE.getStudentiDao();

    public DatabazoveStudentiDaoTest() {
    }

    @Test
    public void testDajVsetky() {
        List<Student> studenti = studentiDao.dajVsetky();
        assertEquals(POCET_STUDENTOV_V_DB, studenti.size());
    }

    @Test
    public void testUloz() {
        System.out.println("uloz");
        Student student = null;
        DatabazoveStudentiDao instance = null;
        instance.uloz(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testUprav() {
        System.out.println("uprav");
        Student student = null;
        DatabazoveStudentiDao instance = null;
        instance.uprav(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testVymaz() {
        System.out.println("vymaz");
        Student student = null;
        DatabazoveStudentiDao instance = null;
        instance.vymaz(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
