package sk.upjs.ics.paz1c.dao;

import sk.upjs.ics.paz1c.entity.Instruktor;
import java.util.List;

public interface InstruktoriDao {

    public List<Instruktor> dajVsetky();

    public void uloz(Instruktor instruktor);

    public void uprav(Instruktor instruktor);

    public void vymaz(Instruktor instruktor);

}
