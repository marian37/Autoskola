package sk.upjs.ics.paz1c.gui.ComboBoxModels;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import sk.upjs.ics.paz1c.autoskola.BeanFactory;

public class RokNarodeniaComboBoxModel extends AbstractListModel implements ComboBoxModel {

    private int prvyRok = BeanFactory.INSTANCE.PRVY_ROK_NARODENIA;
    private int aktualnyRok;
    private int rok;

    public RokNarodeniaComboBoxModel() {
        DateFormat dateFormat = new SimpleDateFormat("YYYY");
        Calendar cal = Calendar.getInstance();
        aktualnyRok = Integer.valueOf(dateFormat.format(cal.getTime()));
    }

    @Override
    public int getSize() {
        return aktualnyRok - prvyRok - 16;
    }

    @Override
    public Object getElementAt(int index) {
        return prvyRok + index;
    }

    @Override
    public void setSelectedItem(Object objekt) {
        rok = (int) objekt;
    }

    @Override
    public Object getSelectedItem() {
        return rok;
    }

}
