package sk.upjs.ics.paz1c.dao;

import sk.upjs.ics.paz1c.entity.Jazda;
import java.util.List;
import sk.upjs.ics.paz1c.kriteria.JazdyKriterium;

public interface JazdyDao {

    public List<Jazda> dajVsetky();

    public List<Jazda> hladajPodlaDatumu(String datum);

    public List<Jazda> hladajPodlaStudenta(String student);

    public List<Jazda> hladajPodlaInstruktora(String instruktor);

    public List<Jazda> hladajPodlaKriteria(JazdyKriterium kriterium);

    public void uloz(Jazda jazda);

    public void uprav(Jazda jazda);

    public void vymaz(Jazda jazda);

}
