package sk.upjs.ics.paz1c.dao;

import sk.upjs.ics.paz1c.entity.Student;
import java.util.List;

public interface StudentiDao {

    public List<Student> dajVsetky();

    public void uloz(Student student);

    public void uprav(Student student);

    public void vymaz(Student student);
}
