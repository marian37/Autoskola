package sk.upjs.ics.paz1c.databazoveDao;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import sk.upjs.ics.paz1c.entity.Skuska;
import sk.upjs.ics.paz1c.dao.SkuskyDao;

public class DatabazoveSkuskyDao implements SkuskyDao {

    private JdbcTemplate jdbcTemplate;

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private SkuskaRowMapper skuskaRowMapper = new SkuskaRowMapper();

    public DatabazoveSkuskyDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.jdbcTemplate);
    }

    @Override
    public List<Skuska> dajVsetky() {
        return jdbcTemplate.query(SqlQueries.SELECT_ALL_SKUSKA, skuskaRowMapper);
    }

    @Override
    public void uloz(Skuska skuska) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void uprav(Skuska skuska) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vymaz(Skuska skuska) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
