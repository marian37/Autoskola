package sk.upjs.ics.paz1c.gui;

import sk.upjs.ics.paz1c.gui.rowFilters.*;
import sk.upjs.ics.paz1c.gui.tabelModels.*;
import java.util.Arrays;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableRowSorter;
import sk.upjs.ics.paz1c.autoskola.BeanFactory;
import sk.upjs.ics.paz1c.dao.*;

public class HlavnyFormular extends javax.swing.JFrame {

    private JazdyDao jazdyDao = BeanFactory.INSTANCE.getJazdyDao();
    private JazdyTableModel jazdyTableModel = new JazdyTableModel();
    private TableRowSorter jazdyRowSorter = new TableRowSorter(jazdyTableModel);
    private JazdyPodlaDatumuRowFilter jazdyPodlaDatumuRowFilter = new JazdyPodlaDatumuRowFilter();
    private JazdyPodlaStudentaRowFilter jazdyPodlaStudentaRowFilter = new JazdyPodlaStudentaRowFilter();
    private JazdyPodlaInstruktoraRowFilter jazdyPodlaInstruktoraRowFilter = new JazdyPodlaInstruktoraRowFilter();

    private SkuskyDao skuskyDao = BeanFactory.INSTANCE.getSkuskyDao();
    private SkuskyTableModel skuskyTableModel = new SkuskyTableModel();
    private TableRowSorter skuskyRowSorter = new TableRowSorter(skuskyTableModel);
    private SkuskyPodlaDatumuRowFilter skuskyPodlaDatumuRowFilter = new SkuskyPodlaDatumuRowFilter();
    private SkuskyPodlaStudentaRowFilter skuskyPodlaStudentaRowFilter = new SkuskyPodlaStudentaRowFilter();
    private SkuskyPodlaInstruktoraRowFilter skuskyPodlaInstruktoraRowFilter = new SkuskyPodlaInstruktoraRowFilter();

    private StudentiDao studentiDao = BeanFactory.INSTANCE.getStudentiDao();
    private StudentiTableModel studentiTableModel = new StudentiTableModel();
    private TableRowSorter studentiRowSorter = new TableRowSorter(studentiTableModel);
    private StudentiPodlaMenaRowFilter studentiPodlaMenaRowFilter = new StudentiPodlaMenaRowFilter();
    private StudentiPodlaPriezviskaRowFilter studentiPodlaPriezviskaRowFilter = new StudentiPodlaPriezviskaRowFilter();

    private InstruktoriDao instruktoriDao = BeanFactory.INSTANCE.getInstruktoriDao();
    private InstruktoriTableModel instruktoriTableModel = new InstruktoriTableModel();
    private TableRowSorter instruktoriRowSorter = new TableRowSorter(instruktoriTableModel);
    private InstruktoriPodlaMenaRowFilter instruktoriPodlaMenaRowFilter = new InstruktoriPodlaMenaRowFilter();
    private InstruktoriPodlaPriezviskaRowFilter instruktoriPodlaPriezviskaRowFilter = new InstruktoriPodlaPriezviskaRowFilter();

    private VozidlaDao vozidlaDao = BeanFactory.INSTANCE.getVozidlaDao();
    private VozidlaTableModel vozidlaTableModel = new VozidlaTableModel();
    private TableRowSorter vozidlaRowSorter = new TableRowSorter(vozidlaTableModel);
    private VozidlaPodlaSpzRowFilter vozidlaPodlaSpzRowFilter = new VozidlaPodlaSpzRowFilter();
    private VozidlaPodlaZnackyRowFilter vozidlaPodlaZnackyRowFilter = new VozidlaPodlaZnackyRowFilter();
    private VozidlaPodlaKategorieRowFilter vozidlaPodlaKategorieRowFilter = new VozidlaPodlaKategorieRowFilter();

    public HlavnyFormular() {
        initComponents();
        nastavJazdy();
        nastavSkusky();
        nastavStudenti();
        nastavInstruktori();
        nastavVozidla();
    }

    private void nastavJazdy() {
        jazdyRowSorter.setRowFilter(jazdyPodlaDatumuRowFilter);
        tblJazdy.setModel(jazdyTableModel);

        tblJazdy.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                tblJazdySelectionValueChanged(e);
            }
        });

        aktualizujZoznamJazd();
    }

    private void tblJazdySelectionValueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            if (!tblJazdy.getSelectionModel().isSelectionEmpty()) {
                btnJazdyUprav.setEnabled(true);
                btnJazdyVymaz.setEnabled(true);
            } else {
                btnJazdyUprav.setEnabled(false);
                btnJazdyVymaz.setEnabled(false);
            }
        }
    }

    private void aktualizujZoznamJazd() {
        jazdyTableModel.obnov();
    }

    private void nastavSkusky() {
        skuskyRowSorter.setRowFilter(skuskyPodlaDatumuRowFilter);
        tblSkusky.setModel(skuskyTableModel);

        tblSkusky.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                tblSkuskySelectionValueChanged(e);
            }
        });

        aktualizujZoznamSkusok();
    }

    private void tblSkuskySelectionValueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            if (!tblSkusky.getSelectionModel().isSelectionEmpty()) {
                btnSkuskyUprav.setEnabled(true);
                btnSkuskyVymaz.setEnabled(true);
            } else {
                btnSkuskyUprav.setEnabled(false);
                btnSkuskyVymaz.setEnabled(false);
            }
        }
    }

    private void aktualizujZoznamSkusok() {
        skuskyTableModel.obnov();
    }

    private void nastavStudenti() {
        studentiRowSorter.setRowFilter(studentiPodlaMenaRowFilter);
        tblStudenti.setModel(studentiTableModel);

        tblStudenti.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                tblStudentiSelectionValueChanged(e);
            }
        });

        aktualizujZoznamStudentov();
    }

    private void tblStudentiSelectionValueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            if (!tblStudenti.getSelectionModel().isSelectionEmpty()) {
                btnStudentiUprav.setEnabled(true);
                btnStudentiVymaz.setEnabled(true);
            } else {
                btnStudentiUprav.setEnabled(false);
                btnStudentiVymaz.setEnabled(false);
            }
        }
    }

    private void aktualizujZoznamStudentov() {
        studentiTableModel.obnov();
    }

    private void nastavInstruktori() {
        instruktoriRowSorter.setRowFilter(instruktoriPodlaMenaRowFilter);
        tblInstruktori.setModel(instruktoriTableModel);

        tblInstruktori.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                tblInstruktoriSelectionValueChanged(e);
            }
        });

        aktualizujZoznamInstruktorov();
    }

    private void tblInstruktoriSelectionValueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            if (!tblInstruktori.getSelectionModel().isSelectionEmpty()) {
                btnInstruktoriUprav.setEnabled(true);
                btnInstruktoriVymaz.setEnabled(true);
            } else {
                btnInstruktoriUprav.setEnabled(false);
                btnInstruktoriVymaz.setEnabled(false);
            }
        }
    }

    private void aktualizujZoznamInstruktorov() {
        instruktoriTableModel.obnov();
    }

    private void nastavVozidla() {
        vozidlaRowSorter.setRowFilter(vozidlaPodlaSpzRowFilter);
        tblVozidla.setModel(vozidlaTableModel);

        tblVozidla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                tblVozidlaSelectionValueChanged(e);
            }
        });

        aktualizujZoznamVozidiel();
    }
    
    private void tblVozidlaSelectionValueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            if (!tblVozidla.getSelectionModel().isSelectionEmpty()) {
                btnVozidlaUprav.setEnabled(true);
                btnVozidlaVymaz.setEnabled(true);
            } else {
                btnVozidlaUprav.setEnabled(false);
                btnVozidlaVymaz.setEnabled(false);
            }
        }
    }

    private void aktualizujZoznamVozidiel() {
        vozidlaTableModel.obnov();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngJazdy = new javax.swing.ButtonGroup();
        btngSkusky = new javax.swing.ButtonGroup();
        btngStudenti = new javax.swing.ButtonGroup();
        btngInstruktori = new javax.swing.ButtonGroup();
        btngVozidla = new javax.swing.ButtonGroup();
        tabbedPaneHlavny = new javax.swing.JTabbedPane();
        paneJazdy = new javax.swing.JPanel();
        txtJazdyHladaj = new javax.swing.JTextField();
        btnJazdyHladaj = new javax.swing.JButton();
        lblJazdyHladajPodla = new javax.swing.JLabel();
        rbtnJazdyStudent = new javax.swing.JRadioButton();
        rbtnJazdyInstruktor = new javax.swing.JRadioButton();
        rbtnJazdyDatum = new javax.swing.JRadioButton();
        btnJazdyVynuluj = new javax.swing.JButton();
        scrollPaneJazdy = new javax.swing.JScrollPane();
        tblJazdy = new javax.swing.JTable();
        btnJazdyRozsireneVyhladavanie = new javax.swing.JButton();
        btnJazdyDetail = new javax.swing.JButton();
        btnJazdyUprav = new javax.swing.JButton();
        btnJazdyVymaz = new javax.swing.JButton();
        paneSkusky = new javax.swing.JPanel();
        txtSkuskyHladaj = new javax.swing.JTextField();
        btnSkuskyHladaj = new javax.swing.JButton();
        btnSkuskyVynuluj = new javax.swing.JButton();
        lblSkuskyHladajPodla = new javax.swing.JLabel();
        rbtnSkuskyDatum = new javax.swing.JRadioButton();
        rbtnSkuskyStudent = new javax.swing.JRadioButton();
        rbtnSkuskyInstruktor = new javax.swing.JRadioButton();
        scrollPaneSkusky = new javax.swing.JScrollPane();
        tblSkusky = new javax.swing.JTable();
        btnSkuskyVymaz = new javax.swing.JButton();
        btnSkuskyUprav = new javax.swing.JButton();
        btnSkuskyDetail = new javax.swing.JButton();
        paneStudenti = new javax.swing.JPanel();
        txtStudentiHladaj = new javax.swing.JTextField();
        btnStudentiHladaj = new javax.swing.JButton();
        btnStudentiVynuluj = new javax.swing.JButton();
        lblStudentiHladajPodla = new javax.swing.JLabel();
        rbtnStudentiMeno = new javax.swing.JRadioButton();
        rbtnStudentiPriezvisko = new javax.swing.JRadioButton();
        scrollPaneStudenti = new javax.swing.JScrollPane();
        tblStudenti = new javax.swing.JTable();
        btnStudentiRozsireneVyhladavanie = new javax.swing.JButton();
        btnStudentiVymaz = new javax.swing.JButton();
        btnStudentiUprav = new javax.swing.JButton();
        btnStudentiDetail = new javax.swing.JButton();
        paneInstruktori = new javax.swing.JPanel();
        txtInstruktoriHladaj = new javax.swing.JTextField();
        btnInstruktoriHladaj = new javax.swing.JButton();
        btnInstruktoriVynuluj = new javax.swing.JButton();
        lblInstruktoriHladajPodla = new javax.swing.JLabel();
        rbtnInstruktoriMeno = new javax.swing.JRadioButton();
        rbtnInstruktoriPriezvisko = new javax.swing.JRadioButton();
        scrollPaneInstruktori = new javax.swing.JScrollPane();
        tblInstruktori = new javax.swing.JTable();
        btnInstruktoriVymaz = new javax.swing.JButton();
        btnInstruktoriUprav = new javax.swing.JButton();
        btnInstruktoriDetail = new javax.swing.JButton();
        paneVozidla = new javax.swing.JPanel();
        txtVozidlaHladaj = new javax.swing.JTextField();
        btnVozidlaHladaj = new javax.swing.JButton();
        btnVozidlaVynuluj = new javax.swing.JButton();
        lblVozidlaHladajPodla = new javax.swing.JLabel();
        rbtnVozidlaSpz = new javax.swing.JRadioButton();
        rbtnVozidlaZnacka = new javax.swing.JRadioButton();
        rbtnVozidlaKategoria = new javax.swing.JRadioButton();
        scrollPaneVozidla = new javax.swing.JScrollPane();
        tblVozidla = new javax.swing.JTable();
        btnVozidlaVymaz = new javax.swing.JButton();
        btnVozidlaUprav = new javax.swing.JButton();
        btnVozidlaDetail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autoskola");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("hlavnyFrame"); // NOI18N
        setResizable(false);

        btnJazdyHladaj.setText("Hladaj");
        btnJazdyHladaj.setPreferredSize(new java.awt.Dimension(70, 25));

        lblJazdyHladajPodla.setText("Hladaj podla:");

        btngJazdy.add(rbtnJazdyStudent);
        rbtnJazdyStudent.setText("Studenta");

        btngJazdy.add(rbtnJazdyInstruktor);
        rbtnJazdyInstruktor.setText("Instruktora");

        btngJazdy.add(rbtnJazdyDatum);
        rbtnJazdyDatum.setText("Datumu");

        btnJazdyVynuluj.setText("Vynuluj");
        btnJazdyVynuluj.setPreferredSize(new java.awt.Dimension(70, 25));

        tblJazdy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPaneJazdy.setViewportView(tblJazdy);

        btnJazdyRozsireneVyhladavanie.setText("Rozsirene vyhladavanie");
        btnJazdyRozsireneVyhladavanie.setPreferredSize(new java.awt.Dimension(145, 25));
        btnJazdyRozsireneVyhladavanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJazdyRozsireneVyhladavanieActionPerformed(evt);
            }
        });

        btnJazdyDetail.setText("Detail");
        btnJazdyDetail.setPreferredSize(new java.awt.Dimension(70, 25));

        btnJazdyUprav.setText("Uprav");
        btnJazdyUprav.setPreferredSize(new java.awt.Dimension(70, 25));

        btnJazdyVymaz.setText("Vymaz");
        btnJazdyVymaz.setPreferredSize(new java.awt.Dimension(70, 25));

        javax.swing.GroupLayout paneJazdyLayout = new javax.swing.GroupLayout(paneJazdy);
        paneJazdy.setLayout(paneJazdyLayout);
        paneJazdyLayout.setHorizontalGroup(
            paneJazdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneJazdyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneJazdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneJazdy, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addGroup(paneJazdyLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblJazdyHladajPodla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnJazdyDatum)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnJazdyStudent)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnJazdyInstruktor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnJazdyVynuluj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneJazdyLayout.createSequentialGroup()
                        .addComponent(btnJazdyRozsireneVyhladavanie, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnJazdyVymaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnJazdyUprav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnJazdyDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneJazdyLayout.createSequentialGroup()
                        .addComponent(txtJazdyHladaj)
                        .addGap(18, 18, 18)
                        .addComponent(btnJazdyHladaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        paneJazdyLayout.setVerticalGroup(
            paneJazdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneJazdyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneJazdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJazdyHladaj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJazdyHladaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneJazdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJazdyHladajPodla, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnJazdyDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnJazdyStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnJazdyInstruktor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJazdyVynuluj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneJazdy, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneJazdyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJazdyRozsireneVyhladavanie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJazdyDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJazdyUprav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJazdyVymaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabbedPaneHlavny.addTab("Jazdy", paneJazdy);

        btnSkuskyHladaj.setText("Hladaj");
        btnSkuskyHladaj.setPreferredSize(new java.awt.Dimension(70, 25));

        btnSkuskyVynuluj.setText("Vynuluj");
        btnSkuskyVynuluj.setPreferredSize(new java.awt.Dimension(70, 25));

        lblSkuskyHladajPodla.setText("Hladaj podla:");

        btngSkusky.add(rbtnSkuskyDatum);
        rbtnSkuskyDatum.setText("Datumu");

        btngSkusky.add(rbtnSkuskyStudent);
        rbtnSkuskyStudent.setText("Studenta");

        btngSkusky.add(rbtnSkuskyInstruktor);
        rbtnSkuskyInstruktor.setText("Instruktora");

        tblSkusky.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPaneSkusky.setViewportView(tblSkusky);

        btnSkuskyVymaz.setText("Vymaz");
        btnSkuskyVymaz.setPreferredSize(new java.awt.Dimension(70, 25));

        btnSkuskyUprav.setText("Uprav");
        btnSkuskyUprav.setPreferredSize(new java.awt.Dimension(70, 25));

        btnSkuskyDetail.setText("Detail");
        btnSkuskyDetail.setPreferredSize(new java.awt.Dimension(70, 25));

        javax.swing.GroupLayout paneSkuskyLayout = new javax.swing.GroupLayout(paneSkusky);
        paneSkusky.setLayout(paneSkuskyLayout);
        paneSkuskyLayout.setHorizontalGroup(
            paneSkuskyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneSkuskyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneSkuskyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneSkuskyLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblSkuskyHladajPodla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnSkuskyDatum)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnSkuskyStudent)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnSkuskyInstruktor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSkuskyVynuluj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPaneSkusky, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addGroup(paneSkuskyLayout.createSequentialGroup()
                        .addComponent(txtSkuskyHladaj)
                        .addGap(18, 18, 18)
                        .addComponent(btnSkuskyHladaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneSkuskyLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSkuskyVymaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSkuskyUprav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSkuskyDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        paneSkuskyLayout.setVerticalGroup(
            paneSkuskyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneSkuskyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneSkuskyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSkuskyHladaj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSkuskyHladaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneSkuskyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSkuskyHladajPodla, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnSkuskyDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnSkuskyStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnSkuskyInstruktor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSkuskyVynuluj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneSkusky, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneSkuskyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSkuskyDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSkuskyUprav, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSkuskyVymaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabbedPaneHlavny.addTab("Skusky", paneSkusky);

        btnStudentiHladaj.setText("Hladaj");
        btnStudentiHladaj.setPreferredSize(new java.awt.Dimension(70, 25));

        btnStudentiVynuluj.setText("Vynuluj");
        btnStudentiVynuluj.setPreferredSize(new java.awt.Dimension(70, 25));

        lblStudentiHladajPodla.setText("Hladaj podla:");

        btngStudenti.add(rbtnStudentiMeno);
        rbtnStudentiMeno.setText("Mena");

        btngStudenti.add(rbtnStudentiPriezvisko);
        rbtnStudentiPriezvisko.setText("Priezviska");

        tblStudenti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPaneStudenti.setViewportView(tblStudenti);

        btnStudentiRozsireneVyhladavanie.setText("Rozsirene vyhladavanie");
        btnStudentiRozsireneVyhladavanie.setPreferredSize(new java.awt.Dimension(145, 25));
        btnStudentiRozsireneVyhladavanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentiRozsireneVyhladavanieActionPerformed(evt);
            }
        });

        btnStudentiVymaz.setText("Vymaz");
        btnStudentiVymaz.setPreferredSize(new java.awt.Dimension(70, 25));

        btnStudentiUprav.setText("Uprav");
        btnStudentiUprav.setPreferredSize(new java.awt.Dimension(70, 25));

        btnStudentiDetail.setText("Detail");
        btnStudentiDetail.setPreferredSize(new java.awt.Dimension(70, 25));

        javax.swing.GroupLayout paneStudentiLayout = new javax.swing.GroupLayout(paneStudenti);
        paneStudenti.setLayout(paneStudentiLayout);
        paneStudentiLayout.setHorizontalGroup(
            paneStudentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneStudentiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneStudentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneStudenti, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addGroup(paneStudentiLayout.createSequentialGroup()
                        .addComponent(btnStudentiRozsireneVyhladavanie, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStudentiVymaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnStudentiUprav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnStudentiDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneStudentiLayout.createSequentialGroup()
                        .addComponent(txtStudentiHladaj)
                        .addGap(18, 18, 18)
                        .addComponent(btnStudentiHladaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneStudentiLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblStudentiHladajPodla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnStudentiMeno)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnStudentiPriezvisko)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStudentiVynuluj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        paneStudentiLayout.setVerticalGroup(
            paneStudentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneStudentiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneStudentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentiHladaj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudentiHladaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneStudentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentiHladajPodla, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnStudentiMeno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnStudentiPriezvisko, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudentiVynuluj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneStudenti, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneStudentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStudentiRozsireneVyhladavanie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudentiDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudentiUprav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudentiVymaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabbedPaneHlavny.addTab("Studenti", paneStudenti);

        btnInstruktoriHladaj.setText("Hladaj");
        btnInstruktoriHladaj.setPreferredSize(new java.awt.Dimension(70, 25));

        btnInstruktoriVynuluj.setText("Vynuluj");
        btnInstruktoriVynuluj.setPreferredSize(new java.awt.Dimension(70, 25));

        lblInstruktoriHladajPodla.setText("Hladaj podla:");

        btngInstruktori.add(rbtnInstruktoriMeno);
        rbtnInstruktoriMeno.setText("Mena");

        btngInstruktori.add(rbtnInstruktoriPriezvisko);
        rbtnInstruktoriPriezvisko.setText("Priezviska");

        tblInstruktori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPaneInstruktori.setViewportView(tblInstruktori);

        btnInstruktoriVymaz.setText("Vymaz");
        btnInstruktoriVymaz.setPreferredSize(new java.awt.Dimension(70, 25));

        btnInstruktoriUprav.setText("Uprav");
        btnInstruktoriUprav.setPreferredSize(new java.awt.Dimension(70, 25));

        btnInstruktoriDetail.setText("Detail");
        btnInstruktoriDetail.setPreferredSize(new java.awt.Dimension(70, 25));

        javax.swing.GroupLayout paneInstruktoriLayout = new javax.swing.GroupLayout(paneInstruktori);
        paneInstruktori.setLayout(paneInstruktoriLayout);
        paneInstruktoriLayout.setHorizontalGroup(
            paneInstruktoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInstruktoriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneInstruktoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneInstruktori, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addGroup(paneInstruktoriLayout.createSequentialGroup()
                        .addComponent(txtInstruktoriHladaj)
                        .addGap(18, 18, 18)
                        .addComponent(btnInstruktoriHladaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneInstruktoriLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblInstruktoriHladajPodla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnInstruktoriMeno)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnInstruktoriPriezvisko)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInstruktoriVynuluj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneInstruktoriLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInstruktoriVymaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInstruktoriUprav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInstruktoriDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        paneInstruktoriLayout.setVerticalGroup(
            paneInstruktoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneInstruktoriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneInstruktoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInstruktoriHladaj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInstruktoriHladaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneInstruktoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstruktoriHladajPodla, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnInstruktoriMeno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnInstruktoriPriezvisko, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInstruktoriVynuluj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneInstruktori, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(paneInstruktoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInstruktoriDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInstruktoriUprav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInstruktoriVymaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabbedPaneHlavny.addTab("Instruktori", paneInstruktori);

        btnVozidlaHladaj.setText("Hladaj");
        btnVozidlaHladaj.setPreferredSize(new java.awt.Dimension(70, 25));

        btnVozidlaVynuluj.setText("Vynuluj");
        btnVozidlaVynuluj.setPreferredSize(new java.awt.Dimension(70, 25));

        lblVozidlaHladajPodla.setText("Hladaj podla:");

        btngVozidla.add(rbtnVozidlaSpz);
        rbtnVozidlaSpz.setText("SPZ");

        btngVozidla.add(rbtnVozidlaZnacka);
        rbtnVozidlaZnacka.setText("Znacky");

        btngVozidla.add(rbtnVozidlaKategoria);
        rbtnVozidlaKategoria.setText("Kategorie");

        tblVozidla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPaneVozidla.setViewportView(tblVozidla);

        btnVozidlaVymaz.setText("Vymaz");
        btnVozidlaVymaz.setPreferredSize(new java.awt.Dimension(70, 25));

        btnVozidlaUprav.setText("Uprav");
        btnVozidlaUprav.setPreferredSize(new java.awt.Dimension(70, 25));

        btnVozidlaDetail.setText("Detail");
        btnVozidlaDetail.setPreferredSize(new java.awt.Dimension(70, 25));

        javax.swing.GroupLayout paneVozidlaLayout = new javax.swing.GroupLayout(paneVozidla);
        paneVozidla.setLayout(paneVozidlaLayout);
        paneVozidlaLayout.setHorizontalGroup(
            paneVozidlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneVozidlaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneVozidlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneVozidlaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblVozidlaHladajPodla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnVozidlaSpz)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnVozidlaZnacka)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnVozidlaKategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVozidlaVynuluj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPaneVozidla, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addGroup(paneVozidlaLayout.createSequentialGroup()
                        .addComponent(txtVozidlaHladaj)
                        .addGap(18, 18, 18)
                        .addComponent(btnVozidlaHladaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneVozidlaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVozidlaVymaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVozidlaUprav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVozidlaDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        paneVozidlaLayout.setVerticalGroup(
            paneVozidlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneVozidlaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneVozidlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVozidlaHladaj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVozidlaHladaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneVozidlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVozidlaHladajPodla, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVozidlaVynuluj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnVozidlaSpz, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnVozidlaZnacka, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnVozidlaKategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneVozidla, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(paneVozidlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVozidlaDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVozidlaUprav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVozidlaVymaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabbedPaneHlavny.addTab("Vozidla", paneVozidla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneHlavny)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneHlavny)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJazdyRozsireneVyhladavanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJazdyRozsireneVyhladavanieActionPerformed
        RozsireneVyhladavanieJazdyFormular rozsireneVyhladavanieJazdyFormular = new RozsireneVyhladavanieJazdyFormular();
        rozsireneVyhladavanieJazdyFormular.setVisible(true);
    }//GEN-LAST:event_btnJazdyRozsireneVyhladavanieActionPerformed

    private void btnStudentiRozsireneVyhladavanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentiRozsireneVyhladavanieActionPerformed
        RozsireneVyhladavanieStudentiFormular rozsireneVyhladavanieStudentiFormular = new RozsireneVyhladavanieStudentiFormular();
        rozsireneVyhladavanieStudentiFormular.setVisible(true);
    }//GEN-LAST:event_btnStudentiRozsireneVyhladavanieActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HlavnyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HlavnyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HlavnyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HlavnyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HlavnyFormular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInstruktoriDetail;
    private javax.swing.JButton btnInstruktoriHladaj;
    private javax.swing.JButton btnInstruktoriUprav;
    private javax.swing.JButton btnInstruktoriVymaz;
    private javax.swing.JButton btnInstruktoriVynuluj;
    private javax.swing.JButton btnJazdyDetail;
    private javax.swing.JButton btnJazdyHladaj;
    private javax.swing.JButton btnJazdyRozsireneVyhladavanie;
    private javax.swing.JButton btnJazdyUprav;
    private javax.swing.JButton btnJazdyVymaz;
    private javax.swing.JButton btnJazdyVynuluj;
    private javax.swing.JButton btnSkuskyDetail;
    private javax.swing.JButton btnSkuskyHladaj;
    private javax.swing.JButton btnSkuskyUprav;
    private javax.swing.JButton btnSkuskyVymaz;
    private javax.swing.JButton btnSkuskyVynuluj;
    private javax.swing.JButton btnStudentiDetail;
    private javax.swing.JButton btnStudentiHladaj;
    private javax.swing.JButton btnStudentiRozsireneVyhladavanie;
    private javax.swing.JButton btnStudentiUprav;
    private javax.swing.JButton btnStudentiVymaz;
    private javax.swing.JButton btnStudentiVynuluj;
    private javax.swing.JButton btnVozidlaDetail;
    private javax.swing.JButton btnVozidlaHladaj;
    private javax.swing.JButton btnVozidlaUprav;
    private javax.swing.JButton btnVozidlaVymaz;
    private javax.swing.JButton btnVozidlaVynuluj;
    private javax.swing.ButtonGroup btngInstruktori;
    private javax.swing.ButtonGroup btngJazdy;
    private javax.swing.ButtonGroup btngSkusky;
    private javax.swing.ButtonGroup btngStudenti;
    private javax.swing.ButtonGroup btngVozidla;
    private javax.swing.JLabel lblInstruktoriHladajPodla;
    private javax.swing.JLabel lblJazdyHladajPodla;
    private javax.swing.JLabel lblSkuskyHladajPodla;
    private javax.swing.JLabel lblStudentiHladajPodla;
    private javax.swing.JLabel lblVozidlaHladajPodla;
    private javax.swing.JPanel paneInstruktori;
    private javax.swing.JPanel paneJazdy;
    private javax.swing.JPanel paneSkusky;
    private javax.swing.JPanel paneStudenti;
    private javax.swing.JPanel paneVozidla;
    private javax.swing.JRadioButton rbtnInstruktoriMeno;
    private javax.swing.JRadioButton rbtnInstruktoriPriezvisko;
    private javax.swing.JRadioButton rbtnJazdyDatum;
    private javax.swing.JRadioButton rbtnJazdyInstruktor;
    private javax.swing.JRadioButton rbtnJazdyStudent;
    private javax.swing.JRadioButton rbtnSkuskyDatum;
    private javax.swing.JRadioButton rbtnSkuskyInstruktor;
    private javax.swing.JRadioButton rbtnSkuskyStudent;
    private javax.swing.JRadioButton rbtnStudentiMeno;
    private javax.swing.JRadioButton rbtnStudentiPriezvisko;
    private javax.swing.JRadioButton rbtnVozidlaKategoria;
    private javax.swing.JRadioButton rbtnVozidlaSpz;
    private javax.swing.JRadioButton rbtnVozidlaZnacka;
    private javax.swing.JScrollPane scrollPaneInstruktori;
    private javax.swing.JScrollPane scrollPaneJazdy;
    private javax.swing.JScrollPane scrollPaneSkusky;
    private javax.swing.JScrollPane scrollPaneStudenti;
    private javax.swing.JScrollPane scrollPaneVozidla;
    private javax.swing.JTabbedPane tabbedPaneHlavny;
    private javax.swing.JTable tblInstruktori;
    private javax.swing.JTable tblJazdy;
    private javax.swing.JTable tblSkusky;
    private javax.swing.JTable tblStudenti;
    private javax.swing.JTable tblVozidla;
    private javax.swing.JTextField txtInstruktoriHladaj;
    private javax.swing.JTextField txtJazdyHladaj;
    private javax.swing.JTextField txtSkuskyHladaj;
    private javax.swing.JTextField txtStudentiHladaj;
    private javax.swing.JTextField txtVozidlaHladaj;
    // End of variables declaration//GEN-END:variables

}
