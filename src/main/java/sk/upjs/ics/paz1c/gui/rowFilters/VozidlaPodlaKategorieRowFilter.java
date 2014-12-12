package sk.upjs.ics.paz1c.gui.rowFilters;

import javax.swing.RowFilter;

public class VozidlaPodlaKategorieRowFilter extends RowFilter {

    private static final int STLPEC_KATEGORIA = 2;

    private String kategoria = "";

    @Override
    public boolean include(Entry entry) {
        String kategoria = entry.getStringValue(STLPEC_KATEGORIA);
        return kategoria.contains(this.kategoria);
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

}
