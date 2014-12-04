package sk.upjs.ics.paz1c.databazoveDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import sk.upjs.ics.paz1c.entity.Vozidlo;

public class VozidloRowMapper implements RowMapper<Vozidlo> {

    @Override
    public Vozidlo mapRow(ResultSet rs, int rowNum) throws SQLException {
        Vozidlo vozidlo = new Vozidlo();
        vozidlo.setSpz(rs.getString("VozidloSpz"));
        vozidlo.setZnacka(rs.getString("VozidloZnacka"));
        vozidlo.setTyp(rs.getString("VozidloTyp"));
        vozidlo.setFarba(rs.getString("VozidloFarba"));
        vozidlo.setKategoria(rs.getString("VozidloKategoria"));

        return vozidlo;
    }

}
