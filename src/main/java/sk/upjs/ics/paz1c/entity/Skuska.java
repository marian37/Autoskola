package sk.upjs.ics.paz1c.entity;

public class Skuska {

    private Long id;
    private String datum;
    private String cas;
    private Student student;
    private Instruktor instruktor;
    private String policajt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPolicajt() {
        return policajt;
    }

    public void setPolicajt(String policajt) {
        this.policajt = policajt;
    }

}
