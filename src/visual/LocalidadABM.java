/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

/**
 *
 * @author manuve
 */
public class LocalidadABM extends javax.swing.JInternalFrame {

    /**
     * Creates new form MarcaABM
     */
    public LocalidadABM() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabelCodLocalidad = new javax.swing.JLabel();
        jTextLocalidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonAceptarLocalidad = new javax.swing.JButton();
        jButtonCancelarLocalidad = new javax.swing.JButton();
        jComboBoxLocalidad = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButtonIrALocalidad = new javax.swing.JButton();

        jLabel1.setText("Codigo de Marca:");

        jLabelCodLocalidad.setText("CODIGO");

        jTextLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLocalidadActionPerformed(evt);
            }
        });

        jLabel2.setText("Localidad:");

        jButtonAceptarLocalidad.setText("Aceptar");

        jButtonCancelarLocalidad.setText("Cancelar");
        jButtonCancelarLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarLocalidadActionPerformed(evt);
            }
        });

        jComboBoxLocalidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Provincia:");

        jButtonIrALocalidad.setText("Ir a..");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelarLocalidad)
                .addGap(18, 18, 18)
                .addComponent(jButtonAceptarLocalidad)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCodLocalidad))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxLocalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextLocalidad, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonIrALocalidad)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelCodLocalidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButtonIrALocalidad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptarLocalidad)
                    .addComponent(jButtonCancelarLocalidad))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextLocalidadActionPerformed

    private void jButtonCancelarLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarLocalidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptarLocalidad;
    private javax.swing.JButton jButtonCancelarLocalidad;
    private javax.swing.JButton jButtonIrALocalidad;
    private javax.swing.JComboBox jComboBoxLocalidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCodLocalidad;
    private javax.swing.JTextField jTextLocalidad;
    // End of variables declaration//GEN-END:variables
}
