package sk.upjs.ics.paz1c.databazoveDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import sk.upjs.ics.paz1c.entity.Skuska;
import sk.upjs.ics.paz1c.dao.SkuskyDao;
import sk.upjs.ics.paz1c.entity.Student;

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
        Map<String, Object> insertMap = new HashMap<String, Object>();
        insertMap.put("datum", skuska.getDatum());
        insertMap.put("cas", skuska.getCas());
        insertMap.put("instruktorId", skuska.getInstruktor().getId());
        insertMap.put("policajt", skuska.getPolicajt());
        List<Student> studenti = skuska.getStudenti();

        for (int i = 0; i < studenti.size(); i++) {
            insertMap.put(String.valueOf(i), studenti.get(i).getId());
        }

        String sql = "INSERT INTO Skuska (datum, cas, instruktorId, policajt)\n"
                + "VALUES (:datum, :cas, :instruktorId, :policajt)";

        StringBuilder sql2 = new StringBuilder("INSERT INTO SkuskaStudent (skuskaId, studentId) VALUES");

        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(insertMap), keyHolder);
        Long id = keyHolder.getKey().longValue();
        skuska.setId(id);
        for (int i = 0; i < studenti.size() - 1; i++) {
            sql2.append("(")
                    .append(skuska.getId())
                    .append(", :")
                    .append(i)
                    .append("),");
        }
        sql2.append("(")
                .append(skuska.getId())
                .append(", :")
                .append(studenti.size() - 1)
                .append(")");
        namedParameterJdbcTemplate.update(sql2.toString(), new MapSqlParameterSource(insertMap));
    }

    @Override
    public void uprav(Skuska skuska) {
        Map<String, Object> updateMap = new HashMap<String, Object>();
        updateMap.put("id", skuska.getId());
        updateMap.put("datum", skuska.getDatum());
        updateMap.put("cas", skuska.getCas());
        updateMap.put("instruktorId", skuska.getInstruktor().getId());
        updateMap.put("policajt", skuska.getPolicajt());
        List<Student> studenti = skuska.getStudenti();

        for (int i = 0; i < studenti.size(); i++) {
            updateMap.put(String.valueOf(i), studenti.get(i).getId());
        }

        String sql = "UPDATE Skuska SET datum = :datum, cas = :cas, instruktorId = :instruktorId, policajt = :policajt WHERE id = :id";
        String sql2 = "DELETE FROM SkuskaStudent WHERE skuskaId = ?";
        StringBuilder sql3 = new StringBuilder("INSERT INTO SkuskaStudent (skuskaId, studentId) VALUES");
        for (int i = 0; i < studenti.size() - 1; i++) {
            sql3.append("(")
                    .append(skuska.getId())
                    .append(", :")
                    .append(i)
                    .append("),");
        }
        sql3.append("(")
                .append(skuska.getId())
                .append(", :")
                .append(studenti.size() - 1)
                .append(")");

        namedParameterJdbcTemplate.update(sql, updateMap);
        jdbcTemplate.update(sql2, skuska.getId());
        namedParameterJdbcTemplate.update(sql3.toString(), updateMap);
    }

    @Override
    public void vymaz(Skuska skuska) {
        String sql = "DELETE FROM Skuska WHERE id = ?";
        jdbcTemplate.update(sql, skuska.getId());

        String sql2 = "DELETE FROM SkuskaStudent WHERE skuskaId = ?";
        jdbcTemplate.update(sql2, skuska.getId());
    }

}
