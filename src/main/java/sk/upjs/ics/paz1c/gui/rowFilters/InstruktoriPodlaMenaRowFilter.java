package sk.upjs.ics.paz1c.gui.rowFilters;

import javax.swing.RowFilter;

public class InstruktoriPodlaMenaRowFilter extends RowFilter {
    
    private static final int STLPEC_MENO = 0;
    
    private String meno = "";

    @Override
    public boolean include(Entry entry) {
        String meno = entry.getStringValue(STLPEC_MENO);
        return meno.contains(this.meno);
    }
    
    public void  setMeno(String farba) {
        this.meno = meno;
    }  
    
    
}
