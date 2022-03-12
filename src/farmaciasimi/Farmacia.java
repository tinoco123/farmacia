/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package farmaciasimi;

/**
 *
 * @author tinoc
 */
public class Farmacia extends javax.swing.JFrame {

    /**
     * Creates new form Farmacia
     */
    public Farmacia() {
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

        panTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panLeft = new javax.swing.JPanel();
        panPedido = new javax.swing.JPanel();
        btnPedido = new javax.swing.JButton();
        panVerPedido = new javax.swing.JPanel();
        btnVerPedidos = new javax.swing.JButton();
        panCenter = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panTop.setBackground(new java.awt.Color(54, 109, 161));
        panTop.setPreferredSize(new java.awt.Dimension(900, 80));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmaciasimi/farmacia.png"))); // NOI18N
        jLabel1.setText("Farmacia Online");
        jLabel1.setIconTextGap(15);

        javax.swing.GroupLayout panTopLayout = new javax.swing.GroupLayout(panTop);
        panTop.setLayout(panTopLayout);
        panTopLayout.setHorizontalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTopLayout.createSequentialGroup()
                .addContainerGap(334, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(217, 217, 217))
        );
        panTopLayout.setVerticalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(panTop, java.awt.BorderLayout.PAGE_START);

        panLeft.setBackground(new java.awt.Color(54, 109, 161));
        panLeft.setPreferredSize(new java.awt.Dimension(200, 500));

        panPedido.setBackground(new java.awt.Color(54, 109, 161));

        btnPedido.setBackground(new java.awt.Color(54, 109, 161));
        btnPedido.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmaciasimi/entrega-de-comida.png"))); // NOI18N
        btnPedido.setText("Realizar Pedido");
        btnPedido.setBorder(null);
        btnPedido.setBorderPainted(false);
        btnPedido.setContentAreaFilled(false);
        btnPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedido.setDefaultCapable(false);
        btnPedido.setFocusPainted(false);
        btnPedido.setFocusable(false);
        btnPedido.setIconTextGap(10);
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panPedidoLayout = new javax.swing.GroupLayout(panPedido);
        panPedido.setLayout(panPedidoLayout);
        panPedidoLayout.setHorizontalGroup(
            panPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        panPedidoLayout.setVerticalGroup(
            panPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panVerPedido.setBackground(new java.awt.Color(54, 109, 161));
        panVerPedido.setForeground(new java.awt.Color(255, 255, 255));

        btnVerPedidos.setBackground(new java.awt.Color(54, 109, 161));
        btnVerPedidos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnVerPedidos.setForeground(new java.awt.Color(255, 255, 255));
        btnVerPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/farmaciasimi/ver.png"))); // NOI18N
        btnVerPedidos.setText("Ver Pedidos");
        btnVerPedidos.setBorder(null);
        btnVerPedidos.setBorderPainted(false);
        btnVerPedidos.setContentAreaFilled(false);
        btnVerPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerPedidos.setFocusPainted(false);
        btnVerPedidos.setFocusable(false);
        btnVerPedidos.setIconTextGap(15);
        btnVerPedidos.setRequestFocusEnabled(false);
        btnVerPedidos.setRolloverEnabled(false);
        btnVerPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panVerPedidoLayout = new javax.swing.GroupLayout(panVerPedido);
        panVerPedido.setLayout(panVerPedidoLayout);
        panVerPedidoLayout.setHorizontalGroup(
            panVerPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVerPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panVerPedidoLayout.setVerticalGroup(
            panVerPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVerPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panLeftLayout = new javax.swing.GroupLayout(panLeft);
        panLeft.setLayout(panLeftLayout);
        panLeftLayout.setHorizontalGroup(
            panLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panVerPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panLeftLayout.setVerticalGroup(
            panLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLeftLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(panPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(panVerPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        getContentPane().add(panLeft, java.awt.BorderLayout.LINE_START);

        panCenter.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setText("Agregar pedido");

        javax.swing.GroupLayout panCenterLayout = new javax.swing.GroupLayout(panCenter);
        panCenter.setLayout(panCenterLayout);
        panCenterLayout.setHorizontalGroup(
            panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCenterLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel2)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        panCenterLayout.setVerticalGroup(
            panCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCenterLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addContainerGap(386, Short.MAX_VALUE))
        );

        getContentPane().add(panCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void btnVerPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPedidosActionPerformed
        verPedidos verPedidos = new verPedidos();
        verPedidos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVerPedidosActionPerformed

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
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Farmacia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnVerPedidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panCenter;
    private javax.swing.JPanel panLeft;
    private javax.swing.JPanel panPedido;
    private javax.swing.JPanel panTop;
    private javax.swing.JPanel panVerPedido;
    // End of variables declaration//GEN-END:variables
}
