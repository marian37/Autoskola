package sk.upjs.ics.paz1c.gui;

import java.util.List;
import sk.upjs.ics.paz1c.autoskola.BeanFactory;
import sk.upjs.ics.paz1c.dao.SkuskyDao;
import sk.upjs.ics.paz1c.entity.Skuska;
import sk.upjs.ics.paz1c.entity.Student;

public class DetailSkuskyFormular extends javax.swing.JFrame {

    private SkuskyDao skuskyDao = BeanFactory.INSTANCE.getSkuskyDao();

    public DetailSkuskyFormular(Skuska skuska) {
        this();

        txtDatum.setText(skuska.getDatum().toString());
        txtCas.setText(skuska.getCas().toString());
        txtInstruktor.setText(skuska.getInstruktor().getMeno() + " " + skuska.getInstruktor().getPriezvisko());

        List<Student> studenti = skuska.getStudenti();
        StringBuilder sb = new StringBuilder();
        for (Student student : studenti) {
            sb.append(student.getMeno() + " " + student.getPriezvisko() + "\n");
        }
        txtaStudenti.setText(sb.toString());

        txtPolicajt.setText(skuska.getPolicajt());
    }

    /**
     * Creates new form DetailSkuskyFormular
     */
    private DetailSkuskyFormular() {
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

        lblDatum = new javax.swing.JLabel();
        lblCas = new javax.swing.JLabel();
        lblInstruktor = new javax.swing.JLabel();
        lblStudenti = new javax.swing.JLabel();
        txtInstruktor = new javax.swing.JTextField();
        txtCas = new javax.swing.JTextField();
        txtDatum = new javax.swing.JTextField();
        scrollPane = new javax.swing.JScrollPane();
        txtaStudenti = new javax.swing.JTextArea();
        lblPolicajt = new javax.swing.JLabel();
        txtPolicajt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Skuska");
        setName("detailSkuskyFrame"); // NOI18N

        lblDatum.setText("Datum:");

        lblCas.setText("Cas:");

        lblInstruktor.setText("Instruktor:");

        lblStudenti.setText("Studenti:");

        txtInstruktor.setEditable(false);
        txtInstruktor.setFocusable(false);

        txtCas.setEditable(false);
        txtCas.setFocusable(false);

        txtDatum.setEditable(false);
        txtDatum.setFocusable(false);

        txtaStudenti.setEditable(false);
        txtaStudenti.setColumns(20);
        txtaStudenti.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txtaStudenti.setRows(5);
        txtaStudenti.setFocusable(false);
        scrollPane.setViewportView(txtaStudenti);

        lblPolicajt.setText("Policajt:");

        txtPolicajt.setEditable(false);
        txtPolicajt.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInstruktor)
                    .addComponent(lblCas)
                    .addComponent(lblDatum)
                    .addComponent(lblStudenti)
                    .addComponent(lblPolicajt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDatum)
                    .addComponent(txtInstruktor)
                    .addComponent(txtCas)
                    .addComponent(scrollPane)
                    .addComponent(txtPolicajt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInstruktor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstruktor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStudenti, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPolicajt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPolicajt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            java.util.logging.Logger.getLogger(DetailSkuskyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailSkuskyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailSkuskyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailSkuskyFormular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailSkuskyFormular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCas;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblInstruktor;
    private javax.swing.JLabel lblPolicajt;
    private javax.swing.JLabel lblStudenti;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField txtCas;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtInstruktor;
    private javax.swing.JTextField txtPolicajt;
    private javax.swing.JTextArea txtaStudenti;
    // End of variables declaration//GEN-END:variables

}
