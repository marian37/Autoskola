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
            + "    Jazda.vozidloId AS JazdaVozidloId,\n"
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
            + "    Vozidlo.id AS VozidloId,\n"
            + "    Vozidlo.spz AS VozidloSpz,\n"
            + "    Vozidlo.znacka AS VozidloZnacka,    \n"
            + "    Vozidlo.typ AS VozidloTyp,\n"
            + "    Vozidlo.farba AS VozidloFarba,\n"
            + "    Vozidlo.kategoria AS VozidloKategoria\n"
            + "FROM Jazda\n"
            + "JOIN Student ON Jazda.studentId = Student.id\n"
            + "JOIN Instruktor ON Jazda.instruktorId = Instruktor.id\n"
            + "JOIN Vozidlo ON Jazda.vozidloId = Vozidlo.id";

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
            + "    Vozidlo.id AS VozidloId,\n"
            + "    Vozidlo.spz AS VozidloSpz,\n"
            + "    Vozidlo.znacka AS VozidloZnacka,    \n"
            + "    Vozidlo.typ AS VozidloTyp,\n"
            + "    Vozidlo.farba AS VozidloFarba,\n"
            + "    Vozidlo.kategoria AS VozidloKategoria\n"
            + "FROM Vozidlo";

    public static final String SELECT_INSTRUKTOR_BY_MENO = "SELECT \n"
            + "    Instruktor.id AS InstruktorId,\n"
            + "    Instruktor.meno AS InstruktorMeno,\n"
            + "    Instruktor.priezvisko AS InstruktorPriezvisko,\n"
            + "    Instruktor.kontakt AS InstruktorKontakt\n"
            + "FROM Instruktor\n"
            + "WHERE Instruktor.meno LIKE ?;";

    public static final String SELECT_INSTRUKTOR_BY_PRIEZVISKO = "SELECT \n"
            + "    Instruktor.id AS InstruktorId,\n"
            + "    Instruktor.meno AS InstruktorMeno,\n"
            + "    Instruktor.priezvisko AS InstruktorPriezvisko,\n"
            + "    Instruktor.kontakt AS InstruktorKontakt\n"
            + "FROM Instruktor\n"
            + "WHERE Instruktor.priezvisko LIKE ?;";

    public static final String SELECT_JAZDA_BY_DATUM = "SELECT \n"
            + "    Jazda.id AS JazdaId,\n"
            + "    Jazda.studentId AS JazdaStudentId,\n"
            + "    Jazda.instruktorId AS JazdaInstruktorId,\n"
            + "    Jazda.vozidloId AS JazdaVozidloId,\n"
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
            + "    Instruktor.meno AS InstruktorMeno, \n"
            + "    Instruktor.priezvisko AS InstruktorPriezvisko,\n"
            + "    Instruktor.kontakt AS InstruktorKontakt,\n"
            + "    Vozidlo.id AS VozidloId,\n"
            + "    Vozidlo.spz AS VozidloSpz,\n"
            + "    Vozidlo.znacka AS VozidloZnacka,\n"
            + "    Vozidlo.typ AS VozidloTyp,\n"
            + "    Vozidlo.farba AS VozidloFarba,\n"
            + "    Vozidlo.kategoria AS VozidloKategoria\n"
            + "FROM Jazda\n"
            + "JOIN Student ON Jazda.studentId = Student.id\n"
            + "JOIN Instruktor ON Jazda.instruktorId = Instruktor.id\n"
            + "JOIN Vozidlo ON Jazda.vozidloId = Vozidlo.id\n"
            + "WHERE Jazda.datum = ?;";

    public static final String SELECT_JAZDA_BY_STUDENT = "SELECT \n"
            + "    Jazda.id AS JazdaId,\n"
            + "    Jazda.studentId AS JazdaStudentId,\n"
            + "    Jazda.instruktorId AS JazdaInstruktorId,\n"
            + "    Jazda.vozidloId AS JazdaVozidloId,\n"
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
            + "    Instruktor.meno AS InstruktorMeno, \n"
            + "    Instruktor.priezvisko AS InstruktorPriezvisko,\n"
            + "    Instruktor.kontakt AS InstruktorKontakt,\n"
            + "    Vozidlo.id AS VozidloId,\n"
            + "    Vozidlo.spz AS VozidloSpz,\n"
            + "    Vozidlo.znacka AS VozidloZnacka,\n"
            + "    Vozidlo.typ AS VozidloTyp,\n"
            + "    Vozidlo.farba AS VozidloFarba,\n"
            + "    Vozidlo.kategoria AS VozidloKategoria\n"
            + "FROM Jazda\n"
            + "JOIN Student ON Jazda.studentId = Student.id\n"
            + "JOIN Instruktor ON Jazda.instruktorId = Instruktor.id\n"
            + "JOIN Vozidlo ON Jazda.vozidloId = Vozidlo.id\n"
            + "WHERE Student.meno LIKE ? OR Student.priezvisko LIKE ?;";

    public static final String SELECT_JAZDA_BY_INSTRUKTOR = "SELECT \n"
            + "    Jazda.id AS JazdaId,\n"
            + "    Jazda.studentId AS JazdaStudentId,\n"
            + "    Jazda.instruktorId AS JazdaInstruktorId,\n"
            + "    Jazda.vozidloId AS JazdaVozidloId,\n"
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
            + "    Instruktor.meno AS InstruktorMeno, \n"
            + "    Instruktor.priezvisko AS InstruktorPriezvisko,\n"
            + "    Instruktor.kontakt AS InstruktorKontakt,\n"
            + "    Vozidlo.id AS VozidloId,\n"
            + "    Vozidlo.spz AS VozidloSpz,\n"
            + "    Vozidlo.znacka AS VozidloZnacka,\n"
            + "    Vozidlo.typ AS VozidloTyp,\n"
            + "    Vozidlo.farba AS VozidloFarba,\n"
            + "    Vozidlo.kategoria AS VozidloKategoria\n"
            + "FROM Jazda\n"
            + "JOIN Student ON Jazda.studentId = Student.id\n"
            + "JOIN Instruktor ON Jazda.instruktorId = Instruktor.id\n"
            + "JOIN Vozidlo ON Jazda.vozidloId = Vozidlo.id\n"
            + "WHERE Instruktor.meno LIKE ? OR Instruktor.priezvisko LIKE ?;";

    public static final String SELECT_SKUSKA_BY_DATUM = "SELECT \n"
            + "    Skuska.id AS SkuskaId,\n"
            + "    Skuska.datum AS SkuskaDatum,\n"
            + "    Skuska.cas AS SkuskaCas,\n"
            + "    Skuska.instruktorId AS SkuskaInstruktorId,\n"
            + "    Skuska.policajt AS SkuskaPolicajt,\n"
            + "    Instruktor.id AS InstruktorId,\n"
            + "    Instruktor.meno AS InstruktorMeno,\n"
            + "    Instruktor.priezvisko AS InstruktorPriezvisko,\n"
            + "    Instruktor.kontakt AS InstruktorKontakt\n"
            + "FROM Skuska\n"
            + "JOIN Instruktor ON Skuska.instruktorId = Instruktor.id\n"
            + "WHERE Skuska.datum = ?;";

    public static final String SELECT_SKUSKA_BY_STUDENT = "SELECT \n"
            + "    Skuska.id AS SkuskaId,\n"
            + "    Skuska.datum AS SkuskaDatum,\n"
            + "    Skuska.cas AS SkuskaCas,\n"
            + "    Skuska.instruktorId AS SkuskaInstruktorId,\n"
            + "    Skuska.policajt AS SkuskaPolicajt,\n"
            + "    Instruktor.id AS InstruktorId,\n"
            + "    Instruktor.meno AS InstruktorMeno,\n"
            + "    Instruktor.priezvisko AS InstruktorPriezvisko,\n"
            + "    Instruktor.kontakt AS InstruktorKontakt\n"
            + "FROM Skuska\n"
            + "JOIN Instruktor ON Skuska.instruktorId = Instruktor.id                        \n"
            + "WHERE Skuska.id IN (\n"
            + "    SELECT\n"
            + "        SkuskaStudent.skuskaId AS skuskaId\n"
            + "    FROM SkuskaStudent\n"
            + "    JOIN Student ON SkuskaStudent.studentId = Student.id\n"
            + "    WHERE Student.meno LIKE ? OR Student.priezvisko LIKE ?\n"
            + ");";

    public static final String SELECT_SKUSKA_BY_INSTRUKTOR = "SELECT \n"
            + "    Skuska.id AS SkuskaId,\n"
            + "    Skuska.datum AS SkuskaDatum,\n"
            + "    Skuska.cas AS SkuskaCas,\n"
            + "    Skuska.instruktorId AS SkuskaInstruktorId,\n"
            + "    Skuska.policajt AS SkuskaPolicajt,\n"
            + "    Instruktor.id AS InstruktorId,\n"
            + "    Instruktor.meno AS InstruktorMeno,\n"
            + "    Instruktor.priezvisko AS InstruktorPriezvisko,\n"
            + "    Instruktor.kontakt AS InstruktorKontakt\n"
            + "FROM Skuska\n"
            + "JOIN Instruktor ON Skuska.instruktorId = Instruktor.id\n"
            + "WHERE Instruktor.meno LIKE ? OR Instruktor.priezvisko LIKE ?;";

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

    public static final String SELECT_STUDENT_BY_MENO = "SELECT\n"
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
            + "    Student.jazda AS StudentJazda\n"
            + "FROM Student\n"
            + "WHERE Student.meno LIKE ?;";

    public static final String SELECT_STUDENT_BY_PRIEZVISKO = "SELECT\n"
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
            + "    Student.jazda AS StudentJazda\n"
            + "FROM Student\n"
            + "WHERE Student.priezvisko LIKE ?;";

    public static final String SELECT_STUDENT_BY_FILTER = "SELECT * FROM (SELECT\n"
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
            + "    (SELECT COUNT(*)\n"
            + "    FROM Jazda    \n"
            + "    WHERE Jazda.studentId = Student.id) AS PocetJazd,\n"
            + "    (SELECT CASE \n"
            + "                WHEN SUM(Jazda.km) IS NULL THEN 0\n"
            + "                ELSE SUM(Jazda.km)\n"
            + "            END\n"
            + "    FROM Jazda\n"
            + "    WHERE Jazda.studentId = Student.id) AS PrejdeneKm,\n"
            + "    (SELECT Vozidlo.kategoria\n"
            + "    FROM Jazda\n"
            + "    JOIN Vozidlo ON Jazda.vozidloId = Vozidlo.id\n"
            + "    WHERE Jazda.studentId = Student.id\n"
            + "    GROUP BY Vozidlo.kategoria\n"
            + "    ORDER BY COUNT(Vozidlo.kategoria) DESC\n"
            + "    LIMIT 1) AS VozidloKategoria\n"
            + "FROM Student) AS t";

    public static final String SELECT_VOZIDLO_BY_SPZ = "SELECT \n"
            + "    Vozidlo.id AS VozidloId,\n"
            + "    Vozidlo.spz AS VozidloSpz,\n"
            + "    Vozidlo.znacka AS VozidloZnacka,\n"
            + "    Vozidlo.typ AS VozidloTyp,\n"
            + "    Vozidlo.farba AS VozidloFarba,\n"
            + "    Vozidlo.kategoria AS VozidloKategoria\n"
            + "FROM Vozidlo\n"
            + "WHERE Vozidlo.spz LIKE ?;";

    public static final String SELECT_VOZIDLO_BY_ZNACKA = "SELECT \n"
            + "    Vozidlo.id AS VozidloId,\n"
            + "    Vozidlo.spz AS VozidloSpz,\n"
            + "    Vozidlo.znacka AS VozidloZnacka,\n"
            + "    Vozidlo.typ AS VozidloTyp,\n"
            + "    Vozidlo.farba AS VozidloFarba,\n"
            + "    Vozidlo.kategoria AS VozidloKategoria\n"
            + "FROM Vozidlo\n"
            + "WHERE Vozidlo.znacka LIKE ?;";

    public static final String SELECT_VOZIDLO_BY_KATEGORIA = "SELECT \n"
            + "    Vozidlo.id AS VozidloId,\n"
            + "    Vozidlo.spz AS VozidloSpz,\n"
            + "    Vozidlo.znacka AS VozidloZnacka,\n"
            + "    Vozidlo.typ AS VozidloTyp,\n"
            + "    Vozidlo.farba AS VozidloFarba,\n"
            + "    Vozidlo.kategoria AS VozidloKategoria\n"
            + "FROM Vozidlo\n"
            + "WHERE Vozidlo.kategoria LIKE ?;";
}
