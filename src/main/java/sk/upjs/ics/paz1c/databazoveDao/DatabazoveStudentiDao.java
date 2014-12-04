package sk.upjs.ics.paz1c.databazoveDao;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import sk.upjs.ics.paz1c.entity.Student;
import sk.upjs.ics.paz1c.dao.StudentiDao;

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
        return jdbcTemplate.query("SELECT     \n"
                + "    Student.id AS StudentId,\n"
                + "    Student.meno AS StudentMeno,\n"
                + "    Student.priezvisko AS StudentPriezvisko,\n"
                + "    Student.datumNarodenia AS StudentDatumNarodenia,\n"
                + "    Student.bydlisko AS StudentBydlisko,\n"
                + "    Student.kontakt AS StudentKontakt,\n"
                + "    Student.prvaPomoc AS StudentPrvaPomoc,\n"
                + "    Student.pocetPokusov AS StudentPocetPokusov,\n"
                + "    Student.pocetBodov AS StudentPocetBodov,\n"
                + "    Student.cvicisko AS StudentCvicisko,\n"
                + "    Student.jazda AS StudentJazda    \n"
                + "FROM Student", studentRowMapper);
    }

    @Override
    public void uloz(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void uprav(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vymaz(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
