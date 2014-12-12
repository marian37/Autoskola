package sk.upjs.ics.paz1c.gui.rowFilters;

import javax.swing.RowFilter;

public class InstruktoriPodlaPriezviskaRowFilter extends RowFilter {

    private static final int STLPEC_PRIEZVISKO = 1;

    private String priezvisko = "";

    @Override
    public boolean include(Entry entry) {
        String priezvisko = entry.getStringValue(STLPEC_PRIEZVISKO);
        return priezvisko.contains(this.priezvisko);
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

}
