package sk.upjs.ics.paz1c.gui;

import sk.upjs.ics.paz1c.autoskola.BeanFactory;
import sk.upjs.ics.paz1c.dao.JazdyDao;
import sk.upjs.ics.paz1c.entity.Jazda;

public class DetailJazdyFormular extends javax.swing.JFrame {

    private JazdyDao jazdyDao = BeanFactory.INSTANCE.getJazdyDao();

    public DetailJazdyFormular(Jazda jazda) {
        this();

        txtStudent.setText(jazda.getStudent().getMeno() + " " + jazda.getStudent().getPriezvisko());
        txtInstruktor.setText(jazda.getInstruktor().getMeno() + " " + jazda.getInstruktor().getPriezvisko());
        txtVozidlo.setText(jazda.getVozidlo().getSpz());
        txtDatum.setText(jazda.getDatum().toString());
        txtCas.setText(jazda.getCas().toString());
        txtKm.setText(String.valueOf(jazda.getKm()));

        if (jazda.isvPremavke()) {
            txtVpremavke.setText("ano");
        } else {
            txtVpremavke.setText("nie");
        }

        if (jazda.isNaCvicisku()) {
            txtNacvicisku.setText("ano");
        } else {
            txtNacvicisku.setText("nie");
        }

        if (jazda.issVozikom()) {
            txtSvozikom.setText("ano");
        } else {
            txtSvozikom.setText("nie");
        }
    }

    /**
     * Creates new form DetailJazdyFormular
     */
    private DetailJazdyFormular() {
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
        lblDatum = new javax.swing.JLabel();
        lblCas = new javax.swing.JLabel();
        lblKm = new javax.swing.JLabel();
        lblVpreavke = new javax.swing.JLabel();
        lblNacvicisku = new javax.swing.JLabel();
        lblSvozikom = new javax.swing.JLabel();
        txtVpremavke = new javax.swing.JTextField();
        txtKm = new javax.swing.JTextField();
        txtCas = new javax.swing.JTextField();
        txtDatum = new javax.swing.JTextField();
        txtNacvicisku = new javax.swing.JTextField();
        txtSvozikom = new javax.swing.JTextField();
        txtVozidlo = new javax.swing.JTextField();
        txtStudent = new javax.swing.JTextField();
        txtInstruktor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jazda");
        setName("detailJazdyFrame"); // NOI18N
        setResizable(false);

        lblStudent.setText("Student:");

        lblInstruktor.setText("Instruktor:");

        lblVozidlo.setText("Vozidlo:");

        lblDatum.setText("Datum:");

        lblCas.setText("Cas:");

        lblKm.setText("KM:");

        lblVpreavke.setText("V premavke:");

        lblNacvicisku.setText("Na cvicisku:");

        lblSvozikom.setText("S vozikom:");

        txtVpremavke.setEditable(false);
        txtVpremavke.setFocusable(false);

        txtKm.setEditable(false);
        txtKm.setFocusable(false);

        txtCas.setEditable(false);
        txtCas.setFocusable(false);

        txtDatum.setEditable(false);
        txtDatum.setFocusable(false);

        txtNacvicisku.setEditable(false);
        txtNacvicisku.setFocusable(false);

        txtSvozikom.setEditable(false);
        txtSvozikom.setFocusable(false);

        txtVozidlo.setEditable(false);
        txtVozidlo.setFocusable(false);

        txtStudent.setEditable(false);
        txtStudent.setFocusable(false);

        txtInstruktor.setEditable(false);
        txtInstruktor.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVpreavke)
                    .addComponent(lblKm)
                    .addComponent(lblCas)
                    .addComponent(lblDatum)
                    .addComponent(lblNacvicisku)
                    .addComponent(lblSvozikom)
                    .addComponent(lblVozidlo)
                    .addComponent(lblStudent)
                    .addComponent(lblInstruktor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInstruktor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVozidlo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSvozikom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNacvicisku, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVpremavke, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInstruktor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInstruktor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVozidlo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVozidlo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVpreavke, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVpremavke, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNacvicisku, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNacvicisku, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSvozikom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSvozikom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            java.util.logging.Logger.getLogger(DetailJazdyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailJazdyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailJazdyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailJazdyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailJazdyFormular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCas;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblInstruktor;
    private javax.swing.JLabel lblKm;
    private javax.swing.JLabel lblNacvicisku;
    private javax.swing.JLabel lblStudent;
    private javax.swing.JLabel lblSvozikom;
    private javax.swing.JLabel lblVozidlo;
    private javax.swing.JLabel lblVpreavke;
    private javax.swing.JTextField txtCas;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtInstruktor;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtNacvicisku;
    private javax.swing.JTextField txtStudent;
    private javax.swing.JTextField txtSvozikom;
    private javax.swing.JTextField txtVozidlo;
    private javax.swing.JTextField txtVpremavke;
    // End of variables declaration//GEN-END:variables

}
