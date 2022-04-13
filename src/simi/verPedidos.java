/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package simi;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import repositorio.PedidoRepositorioImpl;
import repositorio.Repositorio;
import util.DatabaseConnection;
import models.Pedido;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tinoc
 */
public class verPedidos extends javax.swing.JFrame {

    /**
     * Creates new form Farmacia
     */
    public verPedidos() {
        initComponents();
        this.setLocationRelativeTo(this);
        getPedidos();
        tabPedidos.getTableHeader().setReorderingAllowed(false) ;
        
        
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
        panTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPedidos = new javax.swing.JTable();
        panOpciones = new javax.swing.JPanel();
        txtBuscarNombre = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panTop.setBackground(new java.awt.Color(54, 109, 161));
        panTop.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panTop.setPreferredSize(new java.awt.Dimension(900, 80));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/farmacia.png"))); // NOI18N
        jLabel1.setText("Farmacia Online");
        jLabel1.setIconTextGap(15);

        javax.swing.GroupLayout panTopLayout = new javax.swing.GroupLayout(panTop);
        panTop.setLayout(panTopLayout);
        panTopLayout.setHorizontalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTopLayout.createSequentialGroup()
                .addContainerGap(330, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(217, 217, 217))
        );
        panTopLayout.setVerticalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panTop, java.awt.BorderLayout.PAGE_START);

        panLeft.setBackground(new java.awt.Color(54, 109, 161));
        panLeft.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panLeft.setPreferredSize(new java.awt.Dimension(200, 500));

        panPedido.setBackground(new java.awt.Color(54, 109, 161));

        btnPedido.setBackground(new java.awt.Color(54, 109, 161));
        btnPedido.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/entrega-de-comida.png"))); // NOI18N
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
            .addComponent(btnPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );
        panPedidoLayout.setVerticalGroup(
            panPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPedidoLayout.createSequentialGroup()
                .addComponent(btnPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        panVerPedido.setBackground(new java.awt.Color(54, 109, 161));
        panVerPedido.setForeground(new java.awt.Color(255, 255, 255));

        btnVerPedidos.setBackground(new java.awt.Color(54, 109, 161));
        btnVerPedidos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnVerPedidos.setForeground(new java.awt.Color(255, 255, 255));
        btnVerPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ver.png"))); // NOI18N
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

        javax.swing.GroupLayout panVerPedidoLayout = new javax.swing.GroupLayout(panVerPedido);
        panVerPedido.setLayout(panVerPedidoLayout);
        panVerPedidoLayout.setHorizontalGroup(
            panVerPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
            .addGroup(panVerPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panVerPedidoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnVerPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panVerPedidoLayout.setVerticalGroup(
            panVerPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(panVerPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panVerPedidoLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(btnVerPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(18, 18, 18)))
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
                .addGap(18, 18, 18)
                .addComponent(panVerPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        getContentPane().add(panLeft, java.awt.BorderLayout.LINE_START);

        panCenter.setBackground(new java.awt.Color(255, 255, 255));
        panCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panTable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabPedidos);

        panTable.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 470));

        panCenter.add(panTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, 470));

        panOpciones.setBackground(new java.awt.Color(255, 255, 255));
        panOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscarNombre.setToolTipText("Buscar por nombre");
        txtBuscarNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar por nombre", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        txtBuscarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarNombreKeyReleased(evt);
            }
        });
        panOpciones.add(txtBuscarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 160, -1));

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setText("Editar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        panOpciones.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 90, 30));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panOpciones.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 90, 30));

        panCenter.add(panOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 90));

        getContentPane().add(panCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        Farmacia farmacia = new Farmacia();
        farmacia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void txtBuscarNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombreKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           buscarPorNombre(); 
        }
        
    }//GEN-LAST:event_txtBuscarNombreKeyReleased

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (tabPedidos.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(panOpciones, "Seleccione un pedido", "Ningun pedido seleccionado", JOptionPane.ERROR_MESSAGE);
            
        }else{
            Long id = (Long) tabPedidos.getValueAt(tabPedidos.getSelectedRow(), 0);
            jdActualizacion jdActualizacion = new jdActualizacion(this, true, id);
            jdActualizacion.setVisible(true);
            jdActualizacion.setLocationRelativeTo(this);
            getPedidos();
        }
       
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tabPedidos.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(panOpciones, "Seleccione un pedido", "Ningun pedido seleccionado", JOptionPane.ERROR_MESSAGE);
            
        }else{
            Long id = (Long) tabPedidos.getValueAt(tabPedidos.getSelectedRow(), 0);
            Repositorio<Pedido> repositorio = new PedidoRepositorioImpl();
            repositorio.eliminar(id);
            JOptionPane.showMessageDialog(panOpciones, "Pedido eliminado correctamente", "Pedido Eliminado", JOptionPane.INFORMATION_MESSAGE);
            getPedidos();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void getPedidos(){
        
            Repositorio<Pedido> repositorio = new PedidoRepositorioImpl();
            List<Pedido> lista = repositorio.listar();
            asignarDatosTabla(lista);            
        
    }

    
    private void buscarPorNombre(){
        
            Repositorio<Pedido> repositorio = new PedidoRepositorioImpl();
            List<Pedido> lista = new ArrayList<>();         
            Pedido pedido = repositorio.porNombreProducto(txtBuscarNombre.getText());
            if (pedido == null){
                JOptionPane.showMessageDialog(panOpciones, "No se encuentra el nombre del medicamento", "No existe", JOptionPane.ERROR_MESSAGE);
            }
            else{
                lista.add(pedido);
                asignarDatosTabla(lista);
                
            }
            
        

    }
    
    
    private void asignarDatosTabla(List<Pedido> lista) {
        int listaSize = lista.size();
        Object datos[][] = new Object[listaSize][7];
        
        for (int i=0; i<listaSize; i++){
            datos[i][0] = lista.get(i).getId();
            datos[i][1] = lista.get(i).getNombreProducto();
            datos[i][2] = lista.get(i).getTipoProducto();
            datos[i][3] = lista.get(i).getCantidad();
            datos[i][4] = lista.get(i).getSucursal();
            datos[i][5] = lista.get(i).getProveedor();
            datos[i][6] = lista.get(i).getFechaPedido();
        }
        DefaultTableModel tableModel = new DefaultTableModel(datos, new String [] {"Id", "Nombre del producto", "Tipo del producto", "Cantidad", "Sucursal", "Proveedor", "Fecha del pedido"}){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        tabPedidos.setModel(tableModel);
    }
    
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
            java.util.logging.Logger.getLogger(verPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnVerPedidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panCenter;
    private javax.swing.JPanel panLeft;
    private javax.swing.JPanel panOpciones;
    private javax.swing.JPanel panPedido;
    private javax.swing.JPanel panTable;
    private javax.swing.JPanel panTop;
    private javax.swing.JPanel panVerPedido;
    private javax.swing.JTable tabPedidos;
    private javax.swing.JTextField txtBuscarNombre;
    // End of variables declaration//GEN-END:variables
}
