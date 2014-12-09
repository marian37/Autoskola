package sk.upjs.ics.paz1c.gui;

public class UpravaJazdyFormular extends javax.swing.JFrame {

        /**
     * Creates new form UpravaJazdyFormular
     */
    public UpravaJazdyFormular() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStudent = new javax.swing.JLabel();
        lblInstruktor = new javax.swing.JLabel();
        lblVozidlo = new javax.swing.JLabel();
        txtStudent = new javax.swing.JTextField();
        txtInstruktor = new javax.swing.JTextField();
        txtVozidlo = new javax.swing.JTextField();
        lblStudentPomoc = new javax.swing.JLabel();
        btnNovyStudent = new javax.swing.JButton();
        lblInstuktorPomoc = new javax.swing.JLabel();
        btnNovyInstruktor = new javax.swing.JButton();
        lblVozidloPomoc = new javax.swing.JLabel();
        btnNoveVozidlo = new javax.swing.JButton();
        txtDatum = new javax.swing.JTextField();
        txtCas = new javax.swing.JTextField();
        txtKm = new javax.swing.JTextField();
        lblDatum = new javax.swing.JLabel();
        lblCas = new javax.swing.JLabel();
        lblKm = new javax.swing.JLabel();
        chBoxVpremavke = new javax.swing.JCheckBox();
        chBoxNacvicisku = new javax.swing.JCheckBox();
        chBoxSvozikom = new javax.swing.JCheckBox();
        btnVynuluj = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jazda");
        setName("upravaJazdyFrame"); // NOI18N
        setResizable(false);

        lblStudent.setText("Student:");

        lblInstruktor.setText("Instruktor:");

        lblVozidlo.setText("Vozidlo:");

        lblStudentPomoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentPomoc.setText("?");
        lblStudentPomoc.setToolTipText("<html>\nZadajte meno, priezvisko a datum narodenia existujuceho studenta v tvare:\n<br>\"meno priezvisko den.mesiac.rok\"\n<br>Ak student este nie je zaevidovany v databaze, mozete tak spravit kliknutim na tlacidlo\n<br><b>Novy student</b>\n</html>");
        lblStudentPomoc.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNovyStudent.setText("Novy student");

        lblInstuktorPomoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstuktorPomoc.setText("?");
        lblInstuktorPomoc.setToolTipText("<html>\nZadajte meno a priezvisko existujuceho instruktora v tvare:\n<br>\"meno priezvisko\"\n<br>Ak instruktor este nie je zaevidovany v databaze, mozete tak spravit kliknutim na tlacidlo\n<br><b>Novy instruktor</b>\n</html>");
        lblInstuktorPomoc.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNovyInstruktor.setText("Novy instruktor");

        lblVozidloPomoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVozidloPomoc.setText("?");
        lblVozidloPomoc.setToolTipText("<html>\nZadajte SPZ vozidla. \n<br>Ak vozidlo este nie je zaevidovane v databaze,  mozete tak spravit kliknutim na tlacidlo \n<br><b>Nove vozidlo</b>\n</html>");
        lblVozidloPomoc.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNoveVozidlo.setText("Nove vozidlo");

        lblDatum.setText("Datum:");

        lblCas.setText("Cas:");

        lblKm.setText("KM:");

        chBoxVpremavke.setText("V premavke");

        chBoxNacvicisku.setText("Na cvicisku");

        chBoxSvozikom.setText("S vozikom");

        btnVynuluj.setText("Vynuluj");

        btnOk.setText("OK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVynuluj, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnNoveVozidlo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNovyStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblStudent)
                                            .addGap(20, 20, 20))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblInstruktor, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblVozidlo, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblDatum, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblCas, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblKm, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtVozidlo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblVozidloPomoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtInstruktor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblInstuktorPomoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblStudentPomoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(btnNovyInstruktor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chBoxVpremavke)
                            .addComponent(chBoxNacvicisku)
                            .addComponent(chBoxSvozikom))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStudentPomoc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovyStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInstruktor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstruktor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstuktorPomoc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovyInstruktor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVozidlo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVozidlo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVozidloPomoc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNoveVozidlo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chBoxVpremavke, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chBoxNacvicisku, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chBoxSvozikom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVynuluj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(UpravaJazdyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpravaJazdyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpravaJazdyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpravaJazdyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpravaJazdyFormular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNoveVozidlo;
    private javax.swing.JButton btnNovyInstruktor;
    private javax.swing.JButton btnNovyStudent;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnVynuluj;
    private javax.swing.JCheckBox chBoxNacvicisku;
    private javax.swing.JCheckBox chBoxSvozikom;
    private javax.swing.JCheckBox chBoxVpremavke;
    private javax.swing.JLabel lblCas;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblInstruktor;
    private javax.swing.JLabel lblInstuktorPomoc;
    private javax.swing.JLabel lblKm;
    private javax.swing.JLabel lblStudent;
    private javax.swing.JLabel lblStudentPomoc;
    private javax.swing.JLabel lblVozidlo;
    private javax.swing.JLabel lblVozidloPomoc;
    private javax.swing.JTextField txtCas;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtInstruktor;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtStudent;
    private javax.swing.JTextField txtVozidlo;
    // End of variables declaration//GEN-END:variables
}
