package sk.upjs.ics.paz1c.gui.rowFilters;

import javax.swing.RowFilter;

public class VozidlaPodlaZnackyRowFilter extends RowFilter {

    private static final int STLPEC_ZNACKA = 1;

    private String znacka = "";

    @Override
    public boolean include(Entry entry) {
        String znacka = entry.getStringValue(STLPEC_ZNACKA);
        return znacka.contains(this.znacka);
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

}
