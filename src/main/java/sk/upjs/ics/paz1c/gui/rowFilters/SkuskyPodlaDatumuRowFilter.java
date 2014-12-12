package sk.upjs.ics.paz1c.gui.rowFilters;

import javax.swing.RowFilter;

public class SkuskyPodlaDatumuRowFilter extends RowFilter {

    private static final int STLPEC_DATUM = 0;

    private String datum = "";

    @Override
    public boolean include(Entry entry) {
        String datum = entry.getStringValue(STLPEC_DATUM);
        return datum.contains(this.datum);
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

}
