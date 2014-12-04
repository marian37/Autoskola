package sk.upjs.ics.paz1c.databazoveDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import sk.upjs.ics.paz1c.entity.Skuska;

public class SkuskaRowMapper implements RowMapper<Skuska> {

    private StudentRowMapper studentRowMapper = new StudentRowMapper();

    private InstruktorRowMapper instruktorRowMapper = new InstruktorRowMapper();

    @Override
    public Skuska mapRow(ResultSet rs, int rowNum) throws SQLException {
        Skuska skuska = new Skuska();

        skuska.setId(rs.getLong("SkuskaId"));
        skuska.setDatum(rs.getDate("SkuskaDatum"));
        skuska.setCas(rs.getTime("SkuskaCas"));
        skuska.setStudent(studentRowMapper.mapRow(rs, rowNum));
        skuska.setInstruktor(instruktorRowMapper.mapRow(rs, rowNum));
        skuska.setPolicajt(rs.getString("SkuskaPolicajt"));

        return skuska;
    }

}
