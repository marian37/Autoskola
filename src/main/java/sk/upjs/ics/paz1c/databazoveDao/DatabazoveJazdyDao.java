package sk.upjs.ics.paz1c.databazoveDao;

import sk.upjs.ics.paz1c.databazoveDao.rowMappers.JazdaRowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import sk.upjs.ics.paz1c.dao.JazdyDao;
import sk.upjs.ics.paz1c.entity.Jazda;

public class DatabazoveJazdyDao implements JazdyDao {

    private JdbcTemplate jdbcTemplate;

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private JazdaRowMapper jazdaRowMapper = new JazdaRowMapper();

    public DatabazoveJazdyDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.jdbcTemplate);
    }

    @Override
    public List<Jazda> dajVsetky() {
        return jdbcTemplate.query(SqlQueries.SELECT_ALL_JAZDA, jazdaRowMapper);
    }

    @Override
    public void uloz(Jazda jazda) {
        Map<String, Object> insertMap = new HashMap<String, Object>();
        insertMap.put("studentId", jazda.getStudent().getId());
        insertMap.put("instruktorId", jazda.getInstruktor().getId());
        insertMap.put("vozidloSpz", jazda.getVozidlo().getSpz());
        insertMap.put("datum", jazda.getDatum());
        insertMap.put("cas", jazda.getCas());
        insertMap.put("km", jazda.getKm());
        insertMap.put("vPremavke", jazda.isvPremavke());
        insertMap.put("naCvicisku", jazda.isNaCvicisku());
        insertMap.put("sVozikom", jazda.issVozikom());

        String sql = "INSERT INTO Jazda (studentId, instruktorId, vozidloSpz, datum, cas, km, vPremavke, naCvicisku, sVozikom)\n"
                + "VALUES (:studentId, :instruktorId, :vozidloSpz, :datum, :cas, :km, :vPremavke, :naCvicisku, :sVozikom)";

        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(insertMap), keyHolder);
        Long id = keyHolder.getKey().longValue();
        jazda.setId(id);
    }

    @Override
    public void uprav(Jazda jazda) {
        Map<String, Object> updateMap = new HashMap<String, Object>();
        updateMap.put("id", jazda.getId());
        updateMap.put("studentId", jazda.getStudent().getId());
        updateMap.put("instruktorId", jazda.getInstruktor().getId());
        updateMap.put("vozidloSpz", jazda.getVozidlo().getSpz());
        updateMap.put("datum", jazda.getDatum());
        updateMap.put("cas", jazda.getCas());
        updateMap.put("km", jazda.getKm());
        updateMap.put("vPremavke", jazda.isvPremavke());
        updateMap.put("naCvicisku", jazda.isNaCvicisku());
        updateMap.put("sVozikom", jazda.issVozikom());

        String sql = "UPDATE Jazda SET studentId = :studentId, instruktorId = :instruktorId, vozidloSpz = :vozidloSpz, datum = :datum, cas = :cas, km = :km, vPremavke = :vPremavke, naCvicisku = :naCvicisku, sVozikom = :sVozikom WHERE id = :id";

        namedParameterJdbcTemplate.update(sql, updateMap);
    }

    @Override
    public void vymaz(Jazda jazda) {
        String sql = "DELETE FROM Jazda WHERE id = ?";
        jdbcTemplate.update(sql, jazda.getId());
    }

}
