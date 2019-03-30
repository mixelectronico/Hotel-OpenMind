
package Vista;

import Controlador.SQL_Huesped;
import Modelo.Modelo_Huesped;
import javax.swing.JOptionPane;

public class Vista_Reserva extends javax.swing.JFrame {

    public Vista_Reserva() {
        initComponents();
        bloquearTexto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtrut = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtverif = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtidreserva = new javax.swing.JTextField();
        pnl_formulario = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        combohabit = new javax.swing.JComboBox<>();
        combocantpasaj = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        combotpoocup = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnl_mostrar = new javax.swing.JPanel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_apaterno = new javax.swing.JLabel();
        lbl_amaterno = new javax.swing.JLabel();
        lbl_rut = new javax.swing.JLabel();
        lbl_sexo = new javax.swing.JLabel();
        lbl_fechanac = new javax.swing.JLabel();
        lbl_nacionalidad = new javax.swing.JLabel();
        lbl_MostrarNombre = new javax.swing.JLabel();
        lbl_MostrarApellidoP = new javax.swing.JLabel();
        lbl_MostrarApellidoM = new javax.swing.JLabel();
        lbl_MostrarRUT = new javax.swing.JLabel();
        lbl_MostrarSexo = new javax.swing.JLabel();
        lbl_MostrarFechaNacimiento = new javax.swing.JLabel();
        lbl_MostrarNacionalidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("GENERAR RESERVA");

        jLabel2.setText("Número de reserva :");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente Titular"));

        jLabel9.setText("Rut: ");

        jLabel15.setText("-");

        txtverif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtverifActionPerformed(evt);
            }
        });

        jButton1.setText("Validar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtverif, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtverif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtidreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidreservaActionPerformed(evt);
            }
        });

        pnl_formulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Información Reserva"));

        jLabel5.setText("Habitación:");

        combohabit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "H11" }));
        combohabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combohabitActionPerformed(evt);
            }
        });

        combocantpasaj.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7" }));
        combocantpasaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocantpasajActionPerformed(evt);
            }
        });

        jLabel7.setText("Total de Huéspedes :");

        combotpoocup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Momento", "Jornada" }));
        combotpoocup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotpoocupActionPerformed(evt);
            }
        });

        jLabel11.setText("Modalidad :");

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_formularioLayout = new javax.swing.GroupLayout(pnl_formulario);
        pnl_formulario.setLayout(pnl_formularioLayout);
        pnl_formularioLayout.setHorizontalGroup(
            pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_formularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_formularioLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combocantpasaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_formularioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardar)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_formularioLayout.createSequentialGroup()
                                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combohabit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combotpoocup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_formularioLayout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addContainerGap())))))
        );
        pnl_formularioLayout.setVerticalGroup(
            pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_formularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(combohabit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combocantpasaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(combotpoocup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pnl_mostrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del titular"));
        pnl_mostrar.setEnabled(false);

        lbl_nombre.setText("Nombre :");
        lbl_nombre.setEnabled(false);

        lbl_apaterno.setText("Apellido Paterno :");
        lbl_apaterno.setEnabled(false);

        lbl_amaterno.setText("Apellido Materno :");
        lbl_amaterno.setEnabled(false);

        lbl_rut.setText("RUT :");
        lbl_rut.setEnabled(false);

        lbl_sexo.setText("Sexo :");
        lbl_sexo.setEnabled(false);

        lbl_fechanac.setText("Fecha de Nacimiento :");
        lbl_fechanac.setEnabled(false);

        lbl_nacionalidad.setText("Nacionalidad :");
        lbl_nacionalidad.setEnabled(false);

        lbl_MostrarNombre.setText(" ");

        lbl_MostrarApellidoP.setText(" ");

        lbl_MostrarApellidoM.setText(" ");

        lbl_MostrarRUT.setText(" ");

        lbl_MostrarSexo.setText(" ");

        lbl_MostrarFechaNacimiento.setText(" ");

        lbl_MostrarNacionalidad.setText(" ");

        javax.swing.GroupLayout pnl_mostrarLayout = new javax.swing.GroupLayout(pnl_mostrar);
        pnl_mostrar.setLayout(pnl_mostrarLayout);
        pnl_mostrarLayout.setHorizontalGroup(
            pnl_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mostrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nacionalidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_fechanac, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_sexo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_rut, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_amaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_apaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_nombre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_MostrarApellidoP, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(lbl_MostrarNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_MostrarRUT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_MostrarApellidoM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_MostrarNacionalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_MostrarFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_MostrarSexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_mostrarLayout.setVerticalGroup(
            pnl_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mostrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(lbl_MostrarNombre))
                .addGap(18, 18, 18)
                .addGroup(pnl_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apaterno)
                    .addComponent(lbl_MostrarApellidoP))
                .addGap(18, 18, 18)
                .addGroup(pnl_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_amaterno)
                    .addComponent(lbl_MostrarApellidoM, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_rut)
                    .addComponent(lbl_MostrarRUT))
                .addGap(18, 18, 18)
                .addGroup(pnl_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sexo)
                    .addComponent(lbl_MostrarSexo))
                .addGap(18, 18, 18)
                .addGroup(pnl_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fechanac)
                    .addComponent(lbl_MostrarFechaNacimiento))
                .addGap(18, 18, 18)
                .addGroup(pnl_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nacionalidad)
                    .addComponent(lbl_MostrarNacionalidad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnl_formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(pnl_formulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtverifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtverifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtverifActionPerformed

    private void combohabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combohabitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combohabitActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
     

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void combocantpasajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocantpasajActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combocantpasajActionPerformed

    private void combotpoocupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotpoocupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combotpoocupActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtidreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidreservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidreservaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SQL_Huesped SQLCLI = new SQL_Huesped();
        Modelo_Huesped modcli = new Modelo_Huesped();
        
        if(SQLCLI.verificarRUT(txtrut.getText())){
            modcli.setRUT(txtrut.getText());
            habilitarTexto();
            SQLCLI.mostrarCliente(modcli);
            lbl_MostrarNombre.setText(modcli.getNOMBRE());
            lbl_MostrarApellidoP.setText(modcli.getAPELLIDOP());
            lbl_MostrarApellidoM.setText(modcli.getAPELLIDOM());
            lbl_MostrarRUT.setText(modcli.getRUT()+"-"+modcli.getDIGITOV());
            if(modcli.getSEXO().equals("F")){
                lbl_MostrarSexo.setText("Femenino");
            }
            if(modcli.getSEXO().equals("M")){
                lbl_MostrarSexo.setText("Masculino");
            }else{
                lbl_MostrarSexo.setText("No Definido");
            }
            lbl_MostrarFechaNacimiento.setText(modcli.getFECHANAC().toString());
            lbl_MostrarNacionalidad.setText(modcli.getNACIONALIDAD());
        }else{
            
        } 
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Reserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JComboBox<String> combocantpasaj;
    public javax.swing.JComboBox<String> combohabit;
    public javax.swing.JComboBox<String> combotpoocup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_MostrarApellidoM;
    private javax.swing.JLabel lbl_MostrarApellidoP;
    private javax.swing.JLabel lbl_MostrarFechaNacimiento;
    private javax.swing.JLabel lbl_MostrarNacionalidad;
    private javax.swing.JLabel lbl_MostrarNombre;
    private javax.swing.JLabel lbl_MostrarRUT;
    private javax.swing.JLabel lbl_MostrarSexo;
    private javax.swing.JLabel lbl_amaterno;
    private javax.swing.JLabel lbl_apaterno;
    private javax.swing.JLabel lbl_fechanac;
    private javax.swing.JLabel lbl_nacionalidad;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_rut;
    private javax.swing.JLabel lbl_sexo;
    private javax.swing.JPanel pnl_formulario;
    private javax.swing.JPanel pnl_mostrar;
    public javax.swing.JTextField txtidreserva;
    public javax.swing.JTextField txtrut;
    private javax.swing.JTextField txtverif;
    // End of variables declaration//GEN-END:variables

public void bloquearTexto(){
    pnl_mostrar.setEnabled(false);
    lbl_nombre.setEnabled(false);
    lbl_apaterno.setEnabled(false);
    lbl_amaterno.setEnabled(false);
    lbl_rut.setEnabled(false);
    lbl_fechanac.setEnabled(false);
    lbl_nacionalidad.setEnabled(false);
    lbl_sexo.setEnabled(false);
    lbl_MostrarNombre.setEnabled(false);
    lbl_MostrarApellidoP.setEnabled(false);
    lbl_MostrarApellidoM.setEnabled(false);
    lbl_MostrarRUT.setEnabled(false);
    lbl_MostrarSexo.setEnabled(false);
    lbl_MostrarFechaNacimiento.setEnabled(false);
    lbl_MostrarNacionalidad.setEnabled(false);
}

public void habilitarTexto(){
    pnl_mostrar.setEnabled(true);
    lbl_nombre.setEnabled(true);
    lbl_apaterno.setEnabled(true);
    lbl_amaterno.setEnabled(true);
    lbl_rut.setEnabled(true);
    lbl_fechanac.setEnabled(true);
    lbl_nacionalidad.setEnabled(true);
    lbl_sexo.setEnabled(true);
    lbl_MostrarNombre.setEnabled(true);
    lbl_MostrarApellidoP.setEnabled(true);
    lbl_MostrarApellidoM.setEnabled(true);
    lbl_MostrarRUT.setEnabled(true);
    lbl_MostrarSexo.setEnabled(true);
    lbl_MostrarFechaNacimiento.setEnabled(true);
    lbl_MostrarNacionalidad.setEnabled(true);
}

}
