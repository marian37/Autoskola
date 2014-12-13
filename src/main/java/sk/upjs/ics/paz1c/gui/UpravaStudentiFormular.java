package sk.upjs.ics.paz1c.gui;

import java.sql.Date;
import sk.upjs.ics.paz1c.autoskola.BeanFactory;
import sk.upjs.ics.paz1c.dao.StudentiDao;
import sk.upjs.ics.paz1c.entity.Student;

public class UpravaStudentiFormular extends javax.swing.JFrame {

    private StudentiDao studentiDao = BeanFactory.INSTANCE.getStudentiDao();

    private Student student;
    private HlavnyFormular rodic;

    public UpravaStudentiFormular(HlavnyFormular rodic, Student student) {
        this(student);
        this.rodic = rodic;
    }

    public UpravaStudentiFormular(Student student) {
        this();
        this.student = student;

        if (student.getId() != null) {
            pripravFormular();
        }
    }

    /**
     * Creates new form UpravaStudentiFormular
     */
    private UpravaStudentiFormular() {
        initComponents();
    }

    private void pripravFormular() {
        txtMeno.setText(student.getMeno());
        txtPriezvisko.setText(student.getPriezvisko());
        txtBydlisko.setText(student.getBydlisko());
        txtDatumNarodenia.setText(student.getDatumNarodenia().toString());
        txtKontakt.setText(student.getKontakt());
        txtPocetPokusov.setText(String.valueOf(student.getPocetPokusov()));
        txtPocetBodov.setText(String.valueOf(student.getPocetBodov()));

        chBoxPrvaPomoc.setSelected(student.isPrvaPomoc());
        chBoxCvicisko.setSelected(student.isCvicisko());
        chBoxJazda.setSelected(student.isJazda());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMeno = new javax.swing.JLabel();
        lblPriezvisko = new javax.swing.JLabel();
        lblBydlisko = new javax.swing.JLabel();
        lblDatumNarodenia = new javax.swing.JLabel();
        lblKontakt = new javax.swing.JLabel();
        lblPocetBodov = new javax.swing.JLabel();
        lblPocetPokusov = new javax.swing.JLabel();
        txtPocetBodov = new javax.swing.JTextField();
        txtDatumNarodenia = new javax.swing.JTextField();
        txtPriezvisko = new javax.swing.JTextField();
        txtMeno = new javax.swing.JTextField();
        txtBydlisko = new javax.swing.JTextField();
        txtKontakt = new javax.swing.JTextField();
        txtPocetPokusov = new javax.swing.JTextField();
        chBoxPrvaPomoc = new javax.swing.JCheckBox();
        chBoxCvicisko = new javax.swing.JCheckBox();
        chBoxJazda = new javax.swing.JCheckBox();
        btnVynuluj = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student");
        setName("upravaStudentiFrame"); // NOI18N
        setResizable(false);

        lblMeno.setText("Meno:");

        lblPriezvisko.setText("Priezvisko:");

        lblBydlisko.setText("Bydlisko:");

        lblDatumNarodenia.setText("Datum nar.:");

        lblKontakt.setText("Kontakt:");

        lblPocetBodov.setText("Pocet bodov:");

        lblPocetPokusov.setText("Pocet pokusov:");

        chBoxPrvaPomoc.setText("Prva pomoc");

        chBoxCvicisko.setText("Cvicisko");

        chBoxJazda.setText("Jazda");

        btnVynuluj.setText("Vynuluj");
        btnVynuluj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVynulujActionPerformed(evt);
            }
        });

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chBoxJazda)
                    .addComponent(chBoxCvicisko)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPocetBodov)
                            .addComponent(lblDatumNarodenia)
                            .addComponent(lblPriezvisko)
                            .addComponent(lblMeno)
                            .addComponent(lblBydlisko)
                            .addComponent(lblKontakt)
                            .addComponent(lblPocetPokusov))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPocetPokusov, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKontakt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBydlisko, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMeno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPriezvisko, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDatumNarodenia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPocetBodov, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(chBoxPrvaPomoc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVynuluj, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMeno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMeno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPriezvisko, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPriezvisko, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBydlisko, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBydlisko, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatumNarodenia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDatumNarodenia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKontakt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKontakt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPocetPokusov, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPocetPokusov, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPocetBodov, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPocetBodov, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chBoxPrvaPomoc)
                .addGap(18, 18, 18)
                .addComponent(chBoxCvicisko)
                .addGap(18, 18, 18)
                .addComponent(chBoxJazda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVynuluj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        student.setMeno(txtMeno.getText());
        student.setPriezvisko(txtPriezvisko.getText());
        student.setBydlisko(txtBydlisko.getText());
        student.setDatumNarodenia(Date.valueOf(txtDatumNarodenia.getText()));
        student.setKontakt(txtKontakt.getText());
        student.setPocetPokusov(Integer.valueOf(txtPocetPokusov.getText()));
        student.setPocetBodov(Integer.valueOf(txtPocetBodov.getText()));

        student.setPrvaPomoc(chBoxJazda.isSelected());
        student.setCvicisko(chBoxCvicisko.isSelected());
        student.setJazda(chBoxJazda.isSelected());

        if (student.getId() == null) {
            studentiDao.uloz(student);
        } else {
            studentiDao.uprav(student);
        }

        if (rodic != null) {
            rodic.aktualizujZoznamStudentov();
        }
        dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnVynulujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVynulujActionPerformed
        txtMeno.setText("");
        txtPriezvisko.setText("");
        txtBydlisko.setText("");
        txtDatumNarodenia.setText("");
        txtKontakt.setText("");
        txtPocetPokusov.setText("");
        txtPocetBodov.setText("");

        chBoxPrvaPomoc.setSelected(false);
        chBoxCvicisko.setSelected(false);
        chBoxJazda.setSelected(false);
    }//GEN-LAST:event_btnVynulujActionPerformed

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
            java.util.logging.Logger.getLogger(UpravaStudentiFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpravaStudentiFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpravaStudentiFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpravaStudentiFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpravaStudentiFormular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnVynuluj;
    private javax.swing.JCheckBox chBoxCvicisko;
    private javax.swing.JCheckBox chBoxJazda;
    private javax.swing.JCheckBox chBoxPrvaPomoc;
    private javax.swing.JLabel lblBydlisko;
    private javax.swing.JLabel lblDatumNarodenia;
    private javax.swing.JLabel lblKontakt;
    private javax.swing.JLabel lblMeno;
    private javax.swing.JLabel lblPocetBodov;
    private javax.swing.JLabel lblPocetPokusov;
    private javax.swing.JLabel lblPriezvisko;
    private javax.swing.JTextField txtBydlisko;
    private javax.swing.JTextField txtDatumNarodenia;
    private javax.swing.JTextField txtKontakt;
    private javax.swing.JTextField txtMeno;
    private javax.swing.JTextField txtPocetBodov;
    private javax.swing.JTextField txtPocetPokusov;
    private javax.swing.JTextField txtPriezvisko;
    // End of variables declaration//GEN-END:variables

}
