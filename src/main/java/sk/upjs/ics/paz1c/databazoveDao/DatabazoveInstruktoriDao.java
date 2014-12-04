package sk.upjs.ics.paz1c.databazoveDao;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import sk.upjs.ics.paz1c.entity.Instruktor;
import sk.upjs.ics.paz1c.dao.InstruktoriDao;

public class DatabazoveInstruktoriDao implements InstruktoriDao {

    private JdbcTemplate jdbcTemplate;

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private InstruktorRowMapper instruktorRowMapper = new InstruktorRowMapper();

    public DatabazoveInstruktoriDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.jdbcTemplate);
    }

    @Override
    public List<Instruktor> dajVsetky() {
        return jdbcTemplate.query("SELECT     \n"
                + "    Instruktor.id AS InstruktorId,\n"
                + "    Instruktor.meno AS InstruktorMeno,\n"
                + "    Instruktor.priezvisko AS InstruktorPriezvisko,\n"
                + "    Instruktor.kontakt AS InstruktorKontakt\n"
                + "FROM Instruktor", instruktorRowMapper);
    }

    @Override
    public void uloz(Instruktor instruktor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void uprav(Instruktor instruktor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vymaz(Instruktor instruktor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
