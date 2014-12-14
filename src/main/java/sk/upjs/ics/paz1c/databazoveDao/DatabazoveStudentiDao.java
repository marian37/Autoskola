package sk.upjs.ics.paz1c.databazoveDao;

import sk.upjs.ics.paz1c.databazoveDao.rowMappers.StudentRowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import sk.upjs.ics.paz1c.entity.Student;
import sk.upjs.ics.paz1c.dao.StudentiDao;
import sk.upjs.ics.paz1c.entity.Skuska;

public class DatabazoveStudentiDao implements StudentiDao {

    private JdbcTemplate jdbcTemplate;

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private StudentRowMapper studentRowMapper = new StudentRowMapper();

    public DatabazoveStudentiDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.jdbcTemplate);
    }

    @Override
    public List<Student> dajVsetky() {
        return jdbcTemplate.query(SqlQueries.SELECT_ALL_STUDENT, studentRowMapper);
    }

    @Override
    public List<Student> dajPodlaSkusky(Skuska skuska) {
        return jdbcTemplate.query(SqlQueries.SELECT_STUDENT_BY_SKUSKA, studentRowMapper, skuska.getId());
    }

    @Override
    public List<Student> hladajPodlaMena(String meno) {
        meno = meno.trim();
        meno = "%" + meno + "%";
        return jdbcTemplate.query(SqlQueries.SELECT_STUDENT_BY_MENO, studentRowMapper, meno);
    }

    @Override
    public List<Student> hladajPodlaPriezviska(String priezvisko) {
        priezvisko = priezvisko.trim();
        priezvisko = "%" + priezvisko + "%";
        return jdbcTemplate.query(SqlQueries.SELECT_STUDENT_BY_PRIEZVISKO, studentRowMapper, priezvisko);
    }

    @Override
    public List<Student> hladajPodlaMenaPriezviska(String menoPriezvisko) {
        menoPriezvisko = menoPriezvisko.trim();
        String poleStudenta[] = menoPriezvisko.split(" ");
        String meno = poleStudenta[0].trim();
        String priezvisko = poleStudenta[1].trim();
        return jdbcTemplate.query(SqlQueries.SELECT_STUDENT_BY_MENO_PRIEZVISKO, studentRowMapper, meno, priezvisko);
    }

    @Override
    public void uloz(Student student) {
        Map<String, Object> insertMap = new HashMap<String, Object>();
        insertMap.put("meno", student.getMeno());
        insertMap.put("priezvisko", student.getPriezvisko());
        insertMap.put("datumNarodenia", student.getDatumNarodenia());
        insertMap.put("bydlisko", student.getBydlisko());
        insertMap.put("kontakt", student.getKontakt());
        insertMap.put("prvaPomoc", student.isPrvaPomoc());
        insertMap.put("pocetPokusov", student.getPocetPokusov());
        insertMap.put("pocetBodov", student.getPocetBodov());
        insertMap.put("cvicisko", student.isCvicisko());
        insertMap.put("jazda", student.isJazda());

        String sql = "INSERT INTO Student (meno, priezvisko, datumNarodenia, bydlisko, kontakt, prvaPomoc, pocetPokusov, pocetBodov, cvicisko, jazda)\n"
                + "VALUES (:meno, :priezvisko, :datumNarodenia, :bydlisko, :kontakt, :prvaPomoc, :pocetPokusov, :pocetBodov, :cvicisko, :jazda)";

        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(insertMap), keyHolder);
        Long id = keyHolder.getKey().longValue();
        student.setId(id);
    }

    @Override
    public void uprav(Student student) {
        Map<String, Object> updateMap = new HashMap<String, Object>();
        updateMap.put("id", student.getId());
        updateMap.put("meno", student.getMeno());
        updateMap.put("priezvisko", student.getPriezvisko());
        updateMap.put("datumNarodenia", student.getDatumNarodenia());
        updateMap.put("bydlisko", student.getBydlisko());
        updateMap.put("kontakt", student.getKontakt());
        updateMap.put("prvaPomoc", student.isPrvaPomoc());
        updateMap.put("pocetPokusov", student.getPocetPokusov());
        updateMap.put("pocetBodov", student.getPocetBodov());
        updateMap.put("cvicisko", student.isCvicisko());
        updateMap.put("jazda", student.isJazda());

        String sql = "UPDATE Student SET meno = :meno, priezvisko = :priezvisko, datumNarodenia = :datumNarodenia, bydlisko = :bydlisko, kontakt = :kontakt, prvaPomoc = :prvaPomoc, pocetPokusov = :pocetPokusov, pocetBodov = :pocetBodov, cvicisko = :cvicisko, jazda = :jazda WHERE id = :id";

        namedParameterJdbcTemplate.update(sql, updateMap);
    }

    @Override
    public void vymaz(Student student) {
        String sql = "DELETE FROM Student WHERE id = ?";
        jdbcTemplate.update(sql, student.getId());
    }

}
