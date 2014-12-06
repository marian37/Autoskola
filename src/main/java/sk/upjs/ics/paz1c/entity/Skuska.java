package sk.upjs.ics.paz1c.entity;

import java.sql.Date;
import java.sql.Time;

public class Skuska {

    private Long id;
    private Date datum;
    private Time cas;
    private Student student;
    private Instruktor instruktor;
    private String policajt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Time getCas() {
        return cas;
    }

    public void setCas(Time cas) {
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

    @Override
    public String toString() {
        return "Skuska{" + "id=" + id + ", datum=" + datum + ", cas=" + cas + ", student=" + student + ", instruktor=" + instruktor + ", policajt=" + policajt + '}';
    }

}
