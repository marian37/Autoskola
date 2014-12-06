package sk.upjs.ics.paz1c.databazoveDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import sk.upjs.ics.paz1c.dao.VozidlaDao;
import sk.upjs.ics.paz1c.entity.Vozidlo;

public class DatabazoveVozidlaDao implements VozidlaDao {

    private JdbcTemplate jdbcTemplate;

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private VozidloRowMapper vozidloRowMapper = new VozidloRowMapper();

    public DatabazoveVozidlaDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.jdbcTemplate);
    }

    @Override
    public List<Vozidlo> dajVsetky() {
        return jdbcTemplate.query(SqlQueries.SELECT_ALL_VOZIDLO, vozidloRowMapper);
    }

    @Override
    public void uloz(Vozidlo vozidlo) {
        Map<String, Object> insertMap = new HashMap<String, Object>();
        insertMap.put("spz", vozidlo.getSpz());
        insertMap.put("znacka", vozidlo.getZnacka());
        insertMap.put("typ", vozidlo.getTyp());
        insertMap.put("farba", vozidlo.getFarba());
        insertMap.put("kategoria", vozidlo.getKategoria());

        String sql = "INSERT INTO Vozidlo VALUES(:spz, :znacka, :typ, :farba, :kategoria)";

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(insertMap));
    }

    @Override
    public void uprav(Vozidlo vozidlo) {
        Map<String, Object> updateMap = new HashMap<String, Object>();
        updateMap.put("spz", vozidlo.getSpz());
        updateMap.put("znacka", vozidlo.getZnacka());
        updateMap.put("typ", vozidlo.getTyp());
        updateMap.put("farba", vozidlo.getFarba());
        updateMap.put("kategoria", vozidlo.getKategoria());

        String sql = "UPDATE Vozidlo SET znacka = :znacka, typ = :typ, farba = :farba, kategoria = :kategoria WHERE spz = :spz";

        namedParameterJdbcTemplate.update(sql, updateMap);
    }

    @Override
    public void vymaz(Vozidlo vozidlo) {
        String sql = "DELETE FROM Vozidlo WHERE spz = ?";
        jdbcTemplate.update(sql, vozidlo.getSpz());
    }

}
