package sk.upjs.ics.paz1c.gui;

public class RozsireneVyhladavanieJazdyFormular extends javax.swing.JFrame {

    /** Creates new form RozsireneVyhladavanieJazdyFormular */
    public RozsireneVyhladavanieJazdyFormular() {
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

        pnlNazov = new javax.swing.JPanel();
        chBoxStudent = new javax.swing.JCheckBox();
        txtStudent = new javax.swing.JTextField();
        chBoxInstruktor = new javax.swing.JCheckBox();
        txtInstruktor = new javax.swing.JTextField();
        chBoxVozidlo = new javax.swing.JCheckBox();
        txtVozidlo = new javax.swing.JTextField();
        pnlInterval = new javax.swing.JPanel();
        chBoxDatum = new javax.swing.JCheckBox();
        lblDatumOd = new javax.swing.JLabel();
        txtDatumOd = new javax.swing.JTextField();
        lblDatumDo = new javax.swing.JLabel();
        txtDatumDo = new javax.swing.JTextField();
        chBoxCas = new javax.swing.JCheckBox();
        lblCasOd = new javax.swing.JLabel();
        txtCasOd = new javax.swing.JTextField();
        lblCasDo = new javax.swing.JLabel();
        txtCasDo = new javax.swing.JTextField();
        chBoxKm = new javax.swing.JCheckBox();
        lblKmOd = new javax.swing.JLabel();
        txtKmOd = new javax.swing.JTextField();
        lblKmDo = new javax.swing.JLabel();
        txtKmDo = new javax.swing.JTextField();
        pnlBoolean = new javax.swing.JPanel();
        chBoxVpremavke = new javax.swing.JCheckBox();
        rbtnVpremavkeAno = new javax.swing.JRadioButton();
        rbtnVpremavkeNie = new javax.swing.JRadioButton();
        chBoxNacvicisku = new javax.swing.JCheckBox();
        rbtnNacviciskuAno = new javax.swing.JRadioButton();
        rbtnNacviciskuNie = new javax.swing.JRadioButton();
        chBoxSvozikom = new javax.swing.JCheckBox();
        rbtnSvozikomAno = new javax.swing.JRadioButton();
        rbtnSvozikomNie = new javax.swing.JRadioButton();
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
        tblJazdy = new javax.swing.JTable();
        btnVymaz = new javax.swing.JButton();
        btnUprav = new javax.swing.JButton();
        btnDetail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jazdy");
        setResizable(false);

        chBoxStudent.setText("Student");

        chBoxInstruktor.setText("Instruktor");

        chBoxVozidlo.setText("Vozidlo");

        javax.swing.GroupLayout pnlNazovLayout = new javax.swing.GroupLayout(pnlNazov);
        pnlNazov.setLayout(pnlNazovLayout);
        pnlNazovLayout.setHorizontalGroup(
            pnlNazovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNazovLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNazovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chBoxStudent)
                    .addComponent(chBoxInstruktor)
                    .addComponent(chBoxVozidlo)
                    .addGroup(pnlNazovLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlNazovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVozidlo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInstruktor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlNazovLayout.setVerticalGroup(
            pnlNazovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNazovLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chBoxStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chBoxInstruktor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInstruktor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chBoxVozidlo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVozidlo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        chBoxDatum.setText("Datum");

        lblDatumOd.setText("od:");

        lblDatumDo.setText("do:");

        chBoxCas.setText("Cas");

        lblCasOd.setText("od:");

        lblCasDo.setText("do:");

        chBoxKm.setText("KM");

        lblKmOd.setText("od:");

        lblKmDo.setText("do:");

        javax.swing.GroupLayout pnlIntervalLayout = new javax.swing.GroupLayout(pnlInterval);
        pnlInterval.setLayout(pnlIntervalLayout);
        pnlIntervalLayout.setHorizontalGroup(
            pnlIntervalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIntervalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIntervalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chBoxDatum)
                    .addComponent(chBoxCas)
                    .addComponent(chBoxKm)
                    .addGroup(pnlIntervalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlIntervalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlIntervalLayout.createSequentialGroup()
                                .addComponent(lblKmOd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKmOd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblKmDo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKmDo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlIntervalLayout.createSequentialGroup()
                                .addComponent(lblCasOd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCasOd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCasDo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCasDo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlIntervalLayout.createSequentialGroup()
                                .addComponent(lblDatumOd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDatumOd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDatumDo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDatumDo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        pnlIntervalLayout.setVerticalGroup(
            pnlIntervalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIntervalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chBoxDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIntervalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatumOd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatumOd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDatumDo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatumDo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chBoxCas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIntervalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCasOd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCasOd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCasDo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCasDo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chBoxKm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIntervalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKmOd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKmOd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKmDo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKmDo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnlBoolean.setPreferredSize(new java.awt.Dimension(200, 200));

        chBoxVpremavke.setText("V premavke");

        rbtnVpremavkeAno.setText("ano");

        rbtnVpremavkeNie.setText("nie");

        chBoxNacvicisku.setText("Na cvicisku");

        rbtnNacviciskuAno.setText("ano");

        rbtnNacviciskuNie.setText("nie");

        chBoxSvozikom.setText("S vozikom");

        rbtnSvozikomAno.setText("ano");

        rbtnSvozikomNie.setText("nie");

        lblZarovnanieBooleanPanel1.setText("   ");

        lblZarovnanieBooleanPanel2.setText("   ");

        javax.swing.GroupLayout pnlBooleanLayout = new javax.swing.GroupLayout(pnlBoolean);
        pnlBoolean.setLayout(pnlBooleanLayout);
        pnlBooleanLayout.setHorizontalGroup(
            pnlBooleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBooleanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBooleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chBoxVpremavke)
                    .addComponent(chBoxNacvicisku)
                    .addComponent(chBoxSvozikom)
                    .addGroup(pnlBooleanLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlBooleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBooleanLayout.createSequentialGroup()
                                .addComponent(rbtnNacviciskuAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnNacviciskuNie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblZarovnanieBooleanPanel2))
                            .addGroup(pnlBooleanLayout.createSequentialGroup()
                                .addComponent(rbtnVpremavkeAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnVpremavkeNie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblZarovnanieBooleanPanel1))
                            .addGroup(pnlBooleanLayout.createSequentialGroup()
                                .addComponent(rbtnSvozikomAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnSvozikomNie)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        pnlBooleanLayout.setVerticalGroup(
            pnlBooleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBooleanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chBoxVpremavke, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBooleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnVpremavkeAno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnVpremavkeNie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZarovnanieBooleanPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chBoxNacvicisku, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBooleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnNacviciskuAno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnNacviciskuNie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZarovnanieBooleanPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chBoxSvozikom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBooleanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnSvozikomAno)
                    .addComponent(rbtnSvozikomNie))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        chBoxKategoria.setText("Kategoria");

        rbtnKategoriaA.setText("A");

        rbtnKategoriaB.setText("B");

        rbtnKategoriaC.setText("C");

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
        scrollPane.setViewportView(tblJazdy);

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
            java.util.logging.Logger.getLogger(RozsireneVyhladavanieJazdyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RozsireneVyhladavanieJazdyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RozsireneVyhladavanieJazdyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RozsireneVyhladavanieJazdyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RozsireneVyhladavanieJazdyFormular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnHladaj;
    private javax.swing.JButton btnUprav;
    private javax.swing.JButton btnVymaz;
    private javax.swing.JToggleButton btnVynuluj;
    private javax.swing.JCheckBox chBoxCas;
    private javax.swing.JCheckBox chBoxDatum;
    private javax.swing.JCheckBox chBoxInstruktor;
    private javax.swing.JCheckBox chBoxKategoria;
    private javax.swing.JCheckBox chBoxKm;
    private javax.swing.JCheckBox chBoxNacvicisku;
    private javax.swing.JCheckBox chBoxStudent;
    private javax.swing.JCheckBox chBoxSvozikom;
    private javax.swing.JCheckBox chBoxVozidlo;
    private javax.swing.JCheckBox chBoxVpremavke;
    private javax.swing.JLabel lblCasDo;
    private javax.swing.JLabel lblCasOd;
    private javax.swing.JLabel lblDatumDo;
    private javax.swing.JLabel lblDatumOd;
    private javax.swing.JLabel lblKmDo;
    private javax.swing.JLabel lblKmOd;
    private javax.swing.JLabel lblNespravnyFormat;
    private javax.swing.JLabel lblZarovnanieBooleanPanel1;
    private javax.swing.JLabel lblZarovnanieBooleanPanel2;
    private javax.swing.JPanel pnlBoolean;
    private javax.swing.JPanel pnlInterval;
    private javax.swing.JPanel pnlKategoria;
    private javax.swing.JPanel pnlNazov;
    private javax.swing.JRadioButton rbtnKategoriaA;
    private javax.swing.JRadioButton rbtnKategoriaB;
    private javax.swing.JRadioButton rbtnKategoriaC;
    private javax.swing.JRadioButton rbtnKategoriaD;
    private javax.swing.JRadioButton rbtnNacviciskuAno;
    private javax.swing.JRadioButton rbtnNacviciskuNie;
    private javax.swing.JRadioButton rbtnSvozikomAno;
    private javax.swing.JRadioButton rbtnSvozikomNie;
    private javax.swing.JRadioButton rbtnVpremavkeAno;
    private javax.swing.JRadioButton rbtnVpremavkeNie;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tblJazdy;
    private javax.swing.JTextField txtCasDo;
    private javax.swing.JTextField txtCasOd;
    private javax.swing.JTextField txtDatumDo;
    private javax.swing.JTextField txtDatumOd;
    private javax.swing.JTextField txtInstruktor;
    private javax.swing.JTextField txtKmDo;
    private javax.swing.JTextField txtKmOd;
    private javax.swing.JTextField txtStudent;
    private javax.swing.JTextField txtVozidlo;
    // End of variables declaration//GEN-END:variables

}