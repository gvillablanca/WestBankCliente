package com.bank.ui;

import com.bank.negocio.Cliente;
import com.bank.negocio.Cuenta;
import com.bank.operaciones.FuncionesBanco;
import com.bank.operaciones.FuncionesMenu;
import javax.swing.JOptionPane;

public class Transferencia extends javax.swing.JFrame {
    Cliente cliente;
    public Transferencia(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
        cliente.getCliente(cliente.getRut(), cliente.getDv(), cliente.getClave());
        Cuenta cuenta = new Cuenta();
        cuenta.obtener(cliente.getNumeroCuenta());
        lb_nombreCliente.setText(cliente.getNombre()+" " + cliente.getApellidoPaterno() + " " + cliente.getApellidoMaterno());
        lb_numeroCuenta.setText(cliente.getTipoCuenta()+ " - " + cliente.getNumeroCuenta());
        txf_montoTransferencia.setEnabled(false);
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
        lb_numeroCuenta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txf_numeroCuentaDes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txf_montoTransferencia = new javax.swing.JTextField();
        btn_validar = new javax.swing.JButton();
        btn_nuevaTransferencia = new javax.swing.JButton();
        btn_transferir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(447, 404));
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

        lb_nombreCliente.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lb_nombreCliente.setText("nombre cliente");

        lb_numeroCuenta.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lb_numeroCuenta.setText("tipo cuenta y numero cuenta");

        jLabel4.setText("Cuenta de destino:");

        jLabel5.setText("Monto Transferencia");

        btn_validar.setBackground(new java.awt.Color(0, 153, 255));
        btn_validar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bank/img/finalizar.png"))); // NOI18N
        btn_validar.setText("Validar");
        btn_validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_validarActionPerformed(evt);
            }
        });

        btn_nuevaTransferencia.setBackground(new java.awt.Color(0, 153, 255));
        btn_nuevaTransferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bank/img/novo.png"))); // NOI18N
        btn_nuevaTransferencia.setText("Nueva transferencia");
        btn_nuevaTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevaTransferenciaActionPerformed(evt);
            }
        });

        btn_transferir.setBackground(new java.awt.Color(0, 153, 51));
        btn_transferir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/bank/img/insert_cash.png"))); // NOI18N
        btn_transferir.setText("Transferir");
        btn_transferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transferirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Transferencias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_nuevaTransferencia)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_transferir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(lb_nombreCliente)
                                        .addComponent(txf_numeroCuentaDes)
                                        .addComponent(txf_montoTransferencia, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_validar))
                                .addComponent(lb_numeroCuenta))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addComponent(jSeparator2))
                        .addGap(14, 14, 14)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lb_nombreCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_numeroCuenta)
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_numeroCuentaDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_validar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txf_montoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_transferir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nuevaTransferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
        FuncionesMenu menu = new FuncionesMenu();
        menu.inicio(cliente);
        this.dispose(); 
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_transferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transferenciaActionPerformed
        FuncionesMenu menu = new FuncionesMenu();
        menu.transferencia(cliente);
        this.dispose(); 
    }//GEN-LAST:event_btn_transferenciaActionPerformed

    private void btn_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_historialActionPerformed
        FuncionesMenu menu = new FuncionesMenu();
        menu.historial(cliente);
        this.dispose(); 
    }//GEN-LAST:event_btn_historialActionPerformed

    private void btn_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarSesionActionPerformed
        FuncionesMenu menu = new FuncionesMenu();
        menu.login();
        this.dispose(); 
        // cerrar conexion
    }//GEN-LAST:event_btn_cerrarSesionActionPerformed

    private void btn_validarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_validarActionPerformed
        String numeroCuentaDestino = txf_numeroCuentaDes.getText();
        
        if(txf_numeroCuentaDes.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese numero de cuenta de destino", "Advertencia", JOptionPane.OK_OPTION); 
        }
        else{
            if(FuncionesBanco.isNumeric(txf_numeroCuentaDes.getText())){
                int numeroCuentaOrigenInt = Integer.parseInt(numeroCuentaDestino);
                int numeroCuentaDestinoInt = cliente.getNumeroCuenta();
                if((txf_numeroCuentaDes.getText().length() == 9) && (numeroCuentaOrigenInt > 0) && (txf_numeroCuentaDes.getText().length() == 9) && (numeroCuentaDestinoInt > 0)){
                   if(FuncionesBanco.verificarCuenta(txf_numeroCuentaDes.getText())){
                       JOptionPane.showMessageDialog(null, "Cuenta valida", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                       txf_montoTransferencia.setEnabled(true);
                   }
                   else{
                       JOptionPane.showMessageDialog(null, "Numero de cuenta no valido", "Advertencia", JOptionPane.OK_OPTION);
                   }
                }
            }
        }
    }//GEN-LAST:event_btn_validarActionPerformed

    private void btn_nuevaTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevaTransferenciaActionPerformed
        txf_numeroCuentaDes.setText("");
        txf_montoTransferencia.setText("");
    }//GEN-LAST:event_btn_nuevaTransferenciaActionPerformed

    private void btn_transferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transferirActionPerformed
        String numeroCuentaDestino = txf_numeroCuentaDes.getText();
        
        if(txf_numeroCuentaDes.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese numero de cuenta de destino", "Advertencia", JOptionPane.OK_OPTION); 
        }
        else{
            if(FuncionesBanco.isNumeric(txf_numeroCuentaDes.getText())){
                int numeroCuentaOrigenInt = Integer.parseInt(numeroCuentaDestino);
                int numeroCuentaDestinoInt = cliente.getNumeroCuenta();
                if((txf_numeroCuentaDes.getText().length() == 9) && (numeroCuentaOrigenInt > 0) && (txf_numeroCuentaDes.getText().length() == 9) && (numeroCuentaDestinoInt > 0)){
                    if(txf_montoTransferencia.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Ingresar monto a transferir", "Advertencia", JOptionPane.OK_OPTION);
                    }
                    else{
                        if(FuncionesBanco.isNumeric(txf_montoTransferencia.getText())){
                            int montoTransferencia = Integer.parseInt(txf_montoTransferencia.getText());
                            if(montoTransferencia > 0){
                                if(FuncionesBanco.transferenciaCuenta(Integer.toString(cliente.getNumeroCuenta()), montoTransferencia, "O") 
                                        && FuncionesBanco.transferenciaCuenta(txf_numeroCuentaDes.getText(), montoTransferencia, "D")){
                                    JOptionPane.showMessageDialog(null, "Transferencia exitosa", "Información", JOptionPane.INFORMATION_MESSAGE);
                                    FuncionesBanco.actualizarHistorial(numeroCuentaOrigenInt, montoTransferencia, numeroCuentaDestinoInt);
                                    txf_numeroCuentaDes.setText("");
                                    txf_montoTransferencia.setText("");
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_transferirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrarSesion;
    private javax.swing.JButton btn_historial;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_nuevaTransferencia;
    private javax.swing.JButton btn_transferencia;
    private javax.swing.JButton btn_transferir;
    private javax.swing.JButton btn_validar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lb_nombreCliente;
    private javax.swing.JLabel lb_numeroCuenta;
    private javax.swing.JTextField txf_montoTransferencia;
    private javax.swing.JTextField txf_numeroCuentaDes;
    // End of variables declaration//GEN-END:variables
}
