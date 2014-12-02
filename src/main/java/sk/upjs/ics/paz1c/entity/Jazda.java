package sk.upjs.ics.paz1c.entity;

public class Jazda {

    private Long id;
    private Student student;
    private Instruktor instruktor;
    private String datum;
    private String cas;
    private int km;
    private boolean vPremavke;
    private boolean naCvicisku;
    private boolean sVozikom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Instruktor getInstruktor() {
        return instruktor;
    }

    public void setInstruktor(Instruktor instruktor) {
        this.instruktor = instruktor;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getCas() {
        return cas;
    }

    public void setCas(String cas) {
        this.cas = cas;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public boolean isvPremavke() {
        return vPremavke;
    }

    public void setvPremavke(boolean vPremavke) {
        this.vPremavke = vPremavke;
    }

    public boolean isNaCvicisku() {
        return naCvicisku;
    }

    public void setNaCvicisku(boolean naCvicisku) {
        this.naCvicisku = naCvicisku;
    }

    public boolean issVozikom() {
        return sVozikom;
    }

    public void setsVozikom(boolean sVozikom) {
        this.sVozikom = sVozikom;
    }

}
