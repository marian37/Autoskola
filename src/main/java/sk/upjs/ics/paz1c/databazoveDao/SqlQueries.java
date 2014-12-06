package sk.upjs.ics.paz1c.databazoveDao;

public class SqlQueries {

    public static final String SELECT_ALL_INSTRUKTOR = "SELECT     \n"
            + "    Instruktor.id AS InstruktorId,\n"
            + "    Instruktor.meno AS InstruktorMeno,\n"
            + "    Instruktor.priezvisko AS InstruktorPriezvisko,\n"
            + "    Instruktor.kontakt AS InstruktorKontakt\n"
            + "FROM Instruktor";

    public static final String SELECT_ALL_JAZDA = "SELECT \n"
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
            + "JOIN Vozidlo ON Jazda.vozidloSpz = Vozidlo.spz";

    public static final String SELECT_ALL_SKUSKA = "SELECT \n"
            + "    Skuska.id AS SkuskaId,\n"
            + "    Skuska.datum AS SkuskaDatum,\n"
            + "    Skuska.cas AS SkuskaCas,\n"
            + "    Skuska.instruktorId AS SkuskaInstruktorId,\n"
            + "    Skuska.policajt AS SkuskaPolicajt,\n"
            + "    Instruktor.id AS InstruktorId,\n"
            + "    Instruktor.meno AS InstruktorMeno,\n"
            + "    Instruktor.priezvisko AS InstruktorPriezvisko,\n"
            + "    Instruktor.kontakt AS InstruktorKontakt\n"
            + "FROM Skuska \n"
            + "JOIN Instruktor ON Skuska.instruktorId = Instruktor.id";

    public static final String SELECT_ALL_STUDENT = "SELECT     \n"
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
            + "FROM Student";

    public static final String SELECT_ALL_VOZIDLO = "SELECT\n"
            + "    Vozidlo.spz AS VozidloSpz,\n"
            + "    Vozidlo.znacka AS VozidloZnacka,    \n"
            + "    Vozidlo.typ AS VozidloTyp,\n"
            + "    Vozidlo.farba AS VozidloFarba,\n"
            + "    Vozidlo.kategoria AS VozidloKategoria\n"
            + "FROM Vozidlo";

    public static final String SELECT_STUDENT_BY_SKUSKA = "SELECT \n"
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
            + "    SkuskaStudent.id AS SkuskaStudentId,\n"
            + "    SkuskaStudent.skuskaId AS SkuskaStudentSkuskaId,\n"
            + "    SkuskaStudent.studentId AS SkuskaStudentStudentId\n"
            + "FROM Student\n"
            + "JOIN SkuskaStudent ON Student.id = SkuskaStudent.studentId\n"
            + "WHERE SkuskaStudent.skuskaId = ?;";
}
