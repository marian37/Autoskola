package sk.upjs.ics.paz1c.gui.rowFilters;

import javax.swing.RowFilter;

public class VozidlaPodlaSpzRowFilter extends RowFilter {

    private static final int STLPEC_SPZ = 0;

    private String spz = "";

    @Override
    public boolean include(Entry entry) {
        String spz = entry.getStringValue(STLPEC_SPZ);
        return spz.contains(this.spz);
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

}
