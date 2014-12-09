package sk.upjs.ics.paz1c.gui;

public class RozsireneVyhladavanieStudentiFormular extends javax.swing.JFrame {

    /** Creates new form RozsireneVyhladavanieJazdyFormular */
    public RozsireneVyhladavanieStudentiFormular() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngPrvaPomoc = new javax.swing.ButtonGroup();
        btngTest = new javax.swing.ButtonGroup();
        btngCvicisko = new javax.swing.ButtonGroup();
        btngKategoria = new javax.swing.ButtonGroup();
        pnlNazov = new javax.swing.JPanel();
        chBoxMeno = new javax.swing.JCheckBox();
        txtMeno = new javax.swing.JTextField();
        chBoxPriezvisko = new javax.swing.JCheckBox();
        txtPriezvisko = new javax.swing.JTextField();
        chBoxBydlisko = new javax.swing.JCheckBox();
        txtBydlisko = new javax.swing.JTextField();
        pnlInterval = new javax.swing.JPanel();
        chBoxDatumNarodenia = new javax.swing.JCheckBox();
        lblDatumNarodeniaOd = new javax.swing.JLabel();
        txtDatumNarodeniaOd = new javax.swing.JTextField();
        lblDatumNarodeniaDo = new javax.swing.JLabel();
        txtDatumNarodeniaDo = new javax.swing.JTextField();
        chBoxPocetJazd = new javax.swing.JCheckBox();
        lblPocetJazdOd = new javax.swing.JLabel();
        txtPocetJazdOd = new javax.swing.JTextField();
        lblPocetJazdDo = new javax.swing.JLabel();
        txtPocetJazdDo = new javax.swing.JTextField();
        chBoxPrejdeneKm = new javax.swing.JCheckBox();
        lblPrejdeneKmOd = new javax.swing.JLabel();
        txtPrejdeneKmOd = new javax.swing.JTextField();
        lblPrejdeneKmDo = new javax.swing.JLabel();
        txtPrejdeneKmDo = new javax.swing.JTextField();
        pnlBoolean = new javax.swing.JPanel();
        chBoxPrvaPomoc = new javax.swing.JCheckBox();
        rbtnPrvaPomocAno = new javax.swing.JRadioButton();
        rbtnPrvaPomocNie = new javax.swing.JRadioButton();
        chBoxTest = new javax.swing.JCheckBox();
        rbtnTestAno = new javax.swing.JRadioButton();
        rbtnTestNie = new javax.swing.JRadioButton();
        chBoxCvicisko = new javax.swing.JCheckBox();
        rbtnCviciskoAno = new javax.swing.JRadioButton();
        rbtnCviciskoNie = new javax.swing.JRadioButton();
        lblZarovnanieBooleanPanel1 = new javax.swing.JLabel();
        lblZarovnanieBooleanPanel2 = new javax.swing.JLabel();
        pnlKategoria = new javax.swing.JPanel();
        chBoxKategoria = new javax.swing.JCheckBox();
        rbtnKategoriaA = new javax.swing.JRadioButton();
        rbtnKategoriaB = new javax.swing.JRadioButton();
        rbtnKategoriaC = new javax.swing.JRadioButton();
        rbtnKategoriaD = new javax.swing.JRadioButton();
        btnHladaj = new javax.swing.JButton();
        btnVynuluj = new javax.swing.JToggleButton();
        lblNespravnyFormat = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        tblStudenti = new javax.swing.JTable();
        btnVymaz = new javax.swing.JButton();
        btnUprav = new javax.swing.JButton();
        btnDetail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Studenti");
        setName("rozsireneVyhladavanieStudentiFrame"); // NOI18N
        setResizable(false);

        chBoxMeno.setText("Meno");

        chBoxPriezvisko.setText("Priezvisko");

        chBoxBydlisko.setText("Bydlisko");

        javax.swing.GroupLayout pnlNazovLayout = new javax.swing.GroupLayout(pnlNazov);
        pnlNazov.setLayout(pnlNazovLayout);
        pnlNazovLayout.setHorizontalGroup(
            pnlNazovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNazovLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNazovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chBoxMeno)
                    .addComponent(chBoxPriezvisko)
                    .addComponent(chBoxBydlisko)
                    .addGroup(pnlNazovLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlNazovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBydlisko, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPriezvisko, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMeno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlNazovLayout.setVerticalGroup(
            pnlNazovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNazovLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chBoxMeno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMeno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chBoxPriezvisko, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPriezvisko, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chBoxBydlisko, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBydlisko, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        chBoxDatumNarodenia.setText("Datum narodenia");

        lblDatumNarodeniaOd.setText("od:");

        lblDatumNarodeniaDo.setText("do:");

        chBoxPocetJazd.setText("Pocet jazd");

        lblPocetJazdOd.setText("od:");

        lblPocetJazdDo.setText("do:");

        chBoxPrejdeneKm.setText("Prejdene KM");

        lblPrejdeneKmOd.setText("od:");

        lblPrejdeneKmDo.setText("do:");

        javax.swing.GroupLayout pnlIntervalLayout = new javax.swing.GroupLayout(pnlInterval);
        pnlInterval.setLayout(pnlIntervalLayout);
        pnlIntervalLayout.setHorizontalGroup(
            pnlIntervalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIntervalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIntervalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chBoxDatumNarodenia)
                    .addComponent(chBoxPocetJazd)
                    .addComponent(chBoxPrejdeneKm)
                    .addGroup(pnlIntervalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlIntervalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlIntervalLayout.createSequentialGroup()
                                .addComponent(lblPrejdeneKmOd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrejdeneKmOd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPrejdeneKmDo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrejdeneKmDo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlIntervalLayout.createSequentialGroup()
                                .addComponent(lblPocetJazdOd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPocetJazdOd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPocetJazdDo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPocetJazdDo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlIntervalLayout.createSequentialGroup()
                                .addComponent(lblDatumNarodeniaOd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDatumNarodeniaOd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDatumNarodeniaDo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDatumNarodeniaDo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        pnlIntervalLayout.setVerticalGroup(
            pnlIntervalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIntervalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chBoxDatumNarodenia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIntervalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatumNarodeniaOd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatumNarodeniaOd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDatumNarodeniaDo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatumNarodeniaDo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chBoxPocetJazd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIntervalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPocetJazdOd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPocetJazdOd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPocetJazdDo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPocetJazdDo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chBoxPrejdeneKm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIntervalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrejdeneKmOd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrejdeneKmOd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrejdeneKmDo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrejdeneKmDo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnlBoolean.setPreferredSize(new java.awt.Dimension(200, 200));

        chBoxPrvaPomoc.setText("Prva pomoc");

        btngPrvaPomoc.add(rbtnPrvaPomocAno);
        rbtnPrvaPomocAno.setText("ano");

        btngPrvaPomoc.add(rbtnPrvaPomocNie);
        rbtnPrvaPomocNie.setText("nie");

        chBoxTest.setText("Test");

        btngTest.add(rbtnTestAno);
        rbtnTestAno.setText("ano");

        btngTest.add(rbtnTestNie);
        rbtnTestNie.setText("nie");

        chBoxCvicisko.setText("Cvicisko");

        btngCvicisko.add(rbtnCviciskoAno);
        rbtnCviciskoAno.setText("ano");

        btngCvicisko.add(rbtnCviciskoNie);
        rbtnCviciskoNie.setText("nie");

        lblZarovnanieBooleanPanel1.setText("   ");

        lblZarovnanieBooleanPanel2.setText("   ");

        javax.swing.GroupLayout pnlBooleanLayout = new javax.swing.GroupLayout(pnlBoolean);
        pnlBoolean.setLayout(pnlBooleanLayout);
        pnlBooleanLayout.setHorizontalGroup(
            pnlBooleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBooleanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBooleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chBoxPrvaPomoc)
                    .addComponent(chBoxTest)
                    .addComponent(chBoxCvicisko)
                    .addGroup(pnlBooleanLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlBooleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBooleanLayout.createSequentialGroup()
                                .addComponent(rbtnTestAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnTestNie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblZarovnanieBooleanPanel2))
                            .addGroup(pnlBooleanLayout.createSequentialGroup()
                                .addComponent(rbtnPrvaPomocAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnPrvaPomocNie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblZarovnanieBooleanPanel1))
                            .addGroup(pnlBooleanLayout.createSequentialGroup()
                                .addComponent(rbtnCviciskoAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnCviciskoNie)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        pnlBooleanLayout.setVerticalGroup(
            pnlBooleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBooleanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chBoxPrvaPomoc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBooleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnPrvaPomocAno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnPrvaPomocNie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZarovnanieBooleanPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chBoxTest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBooleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnTestAno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnTestNie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZarovnanieBooleanPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chBoxCvicisko, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBooleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnCviciskoAno)
                    .addComponent(rbtnCviciskoNie))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        chBoxKategoria.setText("Kategoria");

        btngKategoria.add(rbtnKategoriaA);
        rbtnKategoriaA.setText("A");

        btngKategoria.add(rbtnKategoriaB);
        rbtnKategoriaB.setText("B");

        btngKategoria.add(rbtnKategoriaC);
        rbtnKategoriaC.setText("C");

        btngKategoria.add(rbtnKategoriaD);
        rbtnKategoriaD.setText("D");

        javax.swing.GroupLayout pnlKategoriaLayout = new javax.swing.GroupLayout(pnlKategoria);
        pnlKategoria.setLayout(pnlKategoriaLayout);
        pnlKategoriaLayout.setHorizontalGroup(
            pnlKategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKategoriaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlKategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chBoxKategoria)
                    .addGroup(pnlKategoriaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlKategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnKategoriaB)
                            .addComponent(rbtnKategoriaA)
                            .addComponent(rbtnKategoriaC)
                            .addComponent(rbtnKategoriaD))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        pnlKategoriaLayout.setVerticalGroup(
            pnlKategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chBoxKategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnKategoriaA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnKategoriaB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnKategoriaC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnKategoriaD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        btnHladaj.setText("Hladaj");

        btnVynuluj.setText("Vynuluj");

        lblNespravnyFormat.setText("NESPRAVNY FORMAT");

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
        scrollPane.setViewportView(tblStudenti);

        btnVymaz.setText("Vymaz");
        btnVymaz.setPreferredSize(new java.awt.Dimension(70, 25));

        btnUprav.setText("Uprav");
        btnUprav.setPreferredSize(new java.awt.Dimension(70, 25));

        btnDetail.setText("Detail");
        btnDetail.setPreferredSize(new java.awt.Dimension(70, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlNazov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlBoolean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlKategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVymaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUprav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblNespravnyFormat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVynuluj, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHladaj, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlKategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlNazov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlBoolean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHladaj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVynuluj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNespravnyFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUprav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVymaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RozsireneVyhladavanieStudentiFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RozsireneVyhladavanieStudentiFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RozsireneVyhladavanieStudentiFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RozsireneVyhladavanieStudentiFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RozsireneVyhladavanieStudentiFormular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnHladaj;
    private javax.swing.JButton btnUprav;
    private javax.swing.JButton btnVymaz;
    private javax.swing.JToggleButton btnVynuluj;
    private javax.swing.ButtonGroup btngCvicisko;
    private javax.swing.ButtonGroup btngKategoria;
    private javax.swing.ButtonGroup btngPrvaPomoc;
    private javax.swing.ButtonGroup btngTest;
    private javax.swing.JCheckBox chBoxBydlisko;
    private javax.swing.JCheckBox chBoxCvicisko;
    private javax.swing.JCheckBox chBoxDatumNarodenia;
    private javax.swing.JCheckBox chBoxKategoria;
    private javax.swing.JCheckBox chBoxMeno;
    private javax.swing.JCheckBox chBoxPocetJazd;
    private javax.swing.JCheckBox chBoxPrejdeneKm;
    private javax.swing.JCheckBox chBoxPriezvisko;
    private javax.swing.JCheckBox chBoxPrvaPomoc;
    private javax.swing.JCheckBox chBoxTest;
    private javax.swing.JLabel lblDatumNarodeniaDo;
    private javax.swing.JLabel lblDatumNarodeniaOd;
    private javax.swing.JLabel lblNespravnyFormat;
    private javax.swing.JLabel lblPocetJazdDo;
    private javax.swing.JLabel lblPocetJazdOd;
    private javax.swing.JLabel lblPrejdeneKmDo;
    private javax.swing.JLabel lblPrejdeneKmOd;
    private javax.swing.JLabel lblZarovnanieBooleanPanel1;
    private javax.swing.JLabel lblZarovnanieBooleanPanel2;
    private javax.swing.JPanel pnlBoolean;
    private javax.swing.JPanel pnlInterval;
    private javax.swing.JPanel pnlKategoria;
    private javax.swing.JPanel pnlNazov;
    private javax.swing.JRadioButton rbtnCviciskoAno;
    private javax.swing.JRadioButton rbtnCviciskoNie;
    private javax.swing.JRadioButton rbtnKategoriaA;
    private javax.swing.JRadioButton rbtnKategoriaB;
    private javax.swing.JRadioButton rbtnKategoriaC;
    private javax.swing.JRadioButton rbtnKategoriaD;
    private javax.swing.JRadioButton rbtnPrvaPomocAno;
    private javax.swing.JRadioButton rbtnPrvaPomocNie;
    private javax.swing.JRadioButton rbtnTestAno;
    private javax.swing.JRadioButton rbtnTestNie;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tblStudenti;
    private javax.swing.JTextField txtBydlisko;
    private javax.swing.JTextField txtDatumNarodeniaDo;
    private javax.swing.JTextField txtDatumNarodeniaOd;
    private javax.swing.JTextField txtMeno;
    private javax.swing.JTextField txtPocetJazdDo;
    private javax.swing.JTextField txtPocetJazdOd;
    private javax.swing.JTextField txtPrejdeneKmDo;
    private javax.swing.JTextField txtPrejdeneKmOd;
    private javax.swing.JTextField txtPriezvisko;
    // End of variables declaration//GEN-END:variables

}
