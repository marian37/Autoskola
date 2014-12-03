package sk.upjs.ics.paz1c.databazoveDao;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import sk.upjs.ics.paz1c.dao.VozidlaDao;
import sk.upjs.ics.paz1c.entity.Vozidlo;

public class DatabazoveVozidlaDao implements VozidlaDao {

    private JdbcTemplate jdbcTemplate;

    private VozidloRowMapper vozidloRowMapper = new VozidloRowMapper();

    public DatabazoveVozidlaDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Vozidlo> dajVsetky() {
        return jdbcTemplate.query("SELECT * FROM Vozidlo", vozidloRowMapper);
    }

    @Override
    public void uloz(Vozidlo vozidlo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.       
    }

    @Override
    public void uprav(Vozidlo vozidlo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vymaz(Vozidlo vozidlo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
