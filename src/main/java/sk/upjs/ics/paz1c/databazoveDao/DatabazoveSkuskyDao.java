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
        return jdbcTemplate.query("SELECT \n"
                + "    Skuska.id AS SkuskaId,\n"
                + "    Skuska.datum AS SkuskaDatum,\n"
                + "    Skuska.cas AS SkuskaCas,\n"
                + "    Skuska.studentId AS SkuskaStudentId,\n"
                + "    Skuska.instruktorId AS SkuskaInstruktorId,\n"
                + "    Skuska.policajt AS SkuskaPolicajt,\n"
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
                + "    Student.jazda AS StudentJazda,\n"
                + "    Instruktor.id AS InstruktorId,\n"
                + "    Instruktor.meno AS InstruktorMeno,\n"
                + "    Instruktor.priezvisko AS InstruktorPriezvisko,\n"
                + "    Instruktor.kontakt AS InstruktorKontakt\n"
                + "FROM Skuska \n"
                + "JOIN Student ON Skuska.studentId = Student.id\n"
                + "JOIN Instruktor ON Skuska.instruktorId = Instruktor.id", skuskaRowMapper);
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
