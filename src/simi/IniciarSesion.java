/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package simi;

import javax.swing.JOptionPane;
import models.Usuario;
import repositorio.AutenticacionRepositorioImpl;
import repositorio.RepositorioAutenticacion;

/**
 *
 * @author Jonathan Tinoco
 */
public class IniciarSesion extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesion
     */
    public IniciarSesion() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panDatos = new javax.swing.JPanel();
        txtNombreUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panTop.setBackground(new java.awt.Color(54, 109, 161));
        panTop.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iniciar Sesión");

        javax.swing.GroupLayout panTopLayout = new javax.swing.GroupLayout(panTop);
        panTop.setLayout(panTopLayout);
        panTopLayout.setHorizontalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTopLayout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(133, 133, 133))
        );
        panTopLayout.setVerticalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        jPanel1.add(panTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 70));

        panDatos.setBackground(new java.awt.Color(255, 255, 255));

        txtNombreUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtContrasena.setBackground(new java.awt.Color(255, 255, 255));
        txtContrasena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(0, 0, 0));
        txtContrasena.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre de Usuario");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("O");

        btnIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Contraseña");

        btnRegistrarse.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panDatosLayout = new javax.swing.GroupLayout(panDatos);
        panDatos.setLayout(panDatosLayout);
        panDatosLayout.setHorizontalGroup(
            panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDatosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDatosLayout.createSequentialGroup()
                        .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDatosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(251, 251, 251))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDatosLayout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDatosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDatosLayout.createSequentialGroup()
                        .addComponent(btnIniciarSesion)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDatosLayout.createSequentialGroup()
                        .addComponent(btnRegistrarse)
                        .addGap(214, 214, 214))))
            .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDatosLayout.createSequentialGroup()
                    .addContainerGap(200, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(151, 151, 151)))
        );
        panDatosLayout.setVerticalGroup(
            panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDatosLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarse)
                .addGap(23, 23, 23))
            .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDatosLayout.createSequentialGroup()
                    .addContainerGap(261, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(191, 191, 191)))
        );

        jPanel1.add(panDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 540, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        if (txtNombreUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Completa el campo nombre de usuario");
        }
        if (txtContrasena.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Completa el campo contraseña");
        }
        Usuario usuario = new Usuario(txtNombreUsuario.getText(), txtContrasena.getText());
        RepositorioAutenticacion repAutenticacion = new AutenticacionRepositorioImpl();
        if (repAutenticacion.iniciarSesion(usuario)) {
            this.dispose();
            Farmacia farmacia = new Farmacia();
            farmacia.setVisible(true);
            farmacia.setLocationRelativeTo(this);
        } else {
            
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);

            
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        this.dispose();
        Registrar registrar = new Registrar();
        registrar.setVisible(true);
        registrar.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnRegistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panDatos;
    private javax.swing.JPanel panTop;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
