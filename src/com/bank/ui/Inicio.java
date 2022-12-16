package com.bank.ui;

import com.bank.negocio.Cliente;
import com.bank.operaciones.FuncionesBanco;
import com.bank.operaciones.FuncionesMenu;

public class Inicio extends javax.swing.JFrame {
    public Inicio() {
        Cliente cliente = new Cliente();
        
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
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lb_nombreCliente = new javax.swing.JLabel();
        lb_tipoCuenta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_SaldoCuenta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setRollover(true);

        btn_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bank/img/home.png"))); // NOI18N
        btn_inicio.setText("   INICIO   ");
        btn_inicio.setFocusable(false);
        btn_inicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_inicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bank/img/BIENVENIDO_WESTBANK.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lb_nombreCliente.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lb_nombreCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nombreCliente.setText("Fulanito x");

        lb_tipoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_tipoCuenta.setText("cuenta corriente :");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Saldo Disponible");

        lb_SaldoCuenta.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        lb_SaldoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_SaldoCuenta.setText("00000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_nombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_tipoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_SaldoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_nombreCliente)
                .addGap(18, 18, 18)
                .addComponent(lb_tipoCuenta)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_SaldoCuenta)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel2.setBorder(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bank/img/Screenshot_1.png"))); // NOI18N
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 551, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_transferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transferenciaActionPerformed
        FuncionesMenu menu = new FuncionesMenu();
        menu.transferencia();
        this.dispose(); 
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
        //cerrar conexion db
    }//GEN-LAST:event_btn_cerrarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrarSesion;
    private javax.swing.JButton btn_historial;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_transferencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lb_SaldoCuenta;
    private javax.swing.JLabel lb_nombreCliente;
    private javax.swing.JLabel lb_tipoCuenta;
    // End of variables declaration//GEN-END:variables
}
