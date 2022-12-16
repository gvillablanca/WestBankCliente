package com.bank.ui;

import com.bank.operaciones.FuncionesMenu;

public class Transferencia extends javax.swing.JFrame {

    public Transferencia() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btn_inicio = new javax.swing.JButton();
        btn_transferencia = new javax.swing.JButton();
        btn_historial = new javax.swing.JButton();
        btn_cerrarSesion = new javax.swing.JButton();
        lb_nombreCliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_numeroCuenta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btn_validar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btn_transferir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(779, 565));
        setResizable(false);
        setSize(new java.awt.Dimension(779, 565));

        jToolBar1.setRollover(true);

        btn_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bank/img/home.png"))); // NOI18N
        btn_inicio.setText("INICIO");
        btn_inicio.setFocusable(false);
        btn_inicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_inicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_inicio);

        btn_transferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bank/img/transferir.png"))); // NOI18N
        btn_transferencia.setText("TRANSFERENCIA");
        btn_transferencia.setFocusable(false);
        btn_transferencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_transferencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_transferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transferenciaActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_transferencia);

        btn_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bank/img/gestionarcuenta.png"))); // NOI18N
        btn_historial.setText("HISTORIAL");
        btn_historial.setFocusable(false);
        btn_historial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_historial.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_historialActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_historial);

        btn_cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bank/img/exit.png"))); // NOI18N
        btn_cerrarSesion.setText("CERRAR SESIÓN");
        btn_cerrarSesion.setFocusable(false);
        btn_cerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cerrarSesion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarSesionActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_cerrarSesion);

        lb_nombreCliente.setText("jLabel1");

        jLabel2.setText("Cuenta:");

        lb_numeroCuenta.setText("jLabel3");

        jLabel4.setText("Cuenta de destino:");

        jLabel5.setText("Monto Transferencia");

        btn_validar.setBackground(new java.awt.Color(0, 153, 255));
        btn_validar.setForeground(new java.awt.Color(255, 255, 255));
        btn_validar.setText("Validar");

        jButton6.setBackground(new java.awt.Color(0, 153, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Nueva transferencia");

        btn_transferir.setBackground(new java.awt.Color(0, 153, 51));
        btn_transferir.setForeground(new java.awt.Color(255, 255, 255));
        btn_transferir.setText("Transferir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_transferir, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(lb_nombreCliente)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(32, 32, 32)
                                    .addComponent(lb_numeroCuenta))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_validar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_nombreCliente)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lb_numeroCuenta))
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_validar))
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(btn_transferir))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
        FuncionesMenu menu = new FuncionesMenu();
        menu.inicio();
        this.dispose(); 
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_transferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_transferenciaActionPerformed

    private void btn_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_historialActionPerformed
        FuncionesMenu menu = new FuncionesMenu();
        menu.historial();
        this.dispose(); 
    }//GEN-LAST:event_btn_historialActionPerformed

    private void btn_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarSesionActionPerformed
        FuncionesMenu menu = new FuncionesMenu();
        menu.login();
        this.dispose(); 
        // cerrar conexion
    }//GEN-LAST:event_btn_cerrarSesionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrarSesion;
    private javax.swing.JButton btn_historial;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_transferencia;
    private javax.swing.JButton btn_transferir;
    private javax.swing.JButton btn_validar;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lb_nombreCliente;
    private javax.swing.JLabel lb_numeroCuenta;
    // End of variables declaration//GEN-END:variables
}
