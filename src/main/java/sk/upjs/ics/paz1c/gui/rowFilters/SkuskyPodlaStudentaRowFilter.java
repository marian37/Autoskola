package sk.upjs.ics.paz1c.gui.rowFilters;

import javax.swing.RowFilter;

public class SkuskyPodlaStudentaRowFilter extends RowFilter {

    private static final int STLPEC_STUDENT = 1;

    private String student = "";

    @Override
    public boolean include(Entry entry) {
        String student = entry.getStringValue(STLPEC_STUDENT);
        return student.contains(this.student);
    }

    public void setStudent(String student) {
        this.student = student;
    }

}
