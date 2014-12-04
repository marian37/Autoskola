package sk.upjs.ics.paz1c.databazoveDao;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
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
        return jdbcTemplate.query("SELECT \n"
                + "    Jazda.id AS JazdaId,\n"
                + "    Jazda.studentId AS JazdaStudentId,\n"
                + "    Jazda.instruktorId AS JazdaInstruktorId,\n"
                + "    Jazda.vozidloSpz AS JazdaVozidloSpz,\n"
                + "    Jazda.datum AS JazdaDatum,\n"
                + "    Jazda.cas AS JazdaCas,\n"
                + "    Jazda.km AS JazdaKm,\n"
                + "    Jazda.vPremavke AS JazdaVPremavke,\n"
                + "    Jazda.naCvicisku AS JazdaNaCvicisku,\n"
                + "    Jazda.sVozikom AS JazdaSVozikom,\n"
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
                + "    Instruktor.kontakt AS InstruktorKontakt,\n"
                + "    Vozidlo.spz AS VozidloSpz,\n"
                + "    Vozidlo.znacka AS VozidloZnacka,    \n"
                + "    Vozidlo.typ AS VozidloTyp,\n"
                + "    Vozidlo.farba AS VozidloFarba,\n"
                + "    Vozidlo.kategoria AS VozidloKategoria\n"
                + "FROM Jazda\n"
                + "JOIN Student ON Jazda.studentId = Student.id\n"
                + "JOIN Instruktor ON Jazda.instruktorId = Instruktor.id\n"
                + "JOIN Vozidlo ON Jazda.vozidloSpz = Vozidlo.spz", jazdaRowMapper);
    }

    @Override
    public void uloz(Jazda jazda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void uprav(Jazda jazda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vymaz(Jazda jazda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
