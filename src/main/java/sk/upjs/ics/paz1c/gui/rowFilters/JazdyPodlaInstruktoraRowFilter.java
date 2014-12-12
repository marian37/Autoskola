package sk.upjs.ics.paz1c.gui.rowFilters;

import javax.swing.RowFilter;

public class JazdyPodlaInstruktoraRowFilter extends RowFilter {

    private static final int STLPEC_INSTRUKTOR = 2;

    private String instruktor = "";

    @Override
    public boolean include(Entry entry) {
        String instruktor = entry.getStringValue(STLPEC_INSTRUKTOR);
        return instruktor.contains(this.instruktor);
    }

    public void setInstruktor(String instruktor) {
        this.instruktor = instruktor;
    }

}
