package sk.upjs.ics.paz1c.databazoveDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import sk.upjs.ics.paz1c.entity.Vozidlo;

public class VozidloRowMapper implements RowMapper<Vozidlo> {
    
    @Override
    public Vozidlo mapRow(ResultSet rs, int i) throws SQLException {
        Vozidlo vozidlo = new Vozidlo();
        vozidlo.setSpz(rs.getString("spz"));
        vozidlo.setZnacka(rs.getString("znacka"));
        vozidlo.setTyp(rs.getString("typ"));
        vozidlo.setFarba(rs.getString("farba"));
        vozidlo.setKategoria(rs.getString("kategoria"));
        
        return vozidlo;
    }
    
}
