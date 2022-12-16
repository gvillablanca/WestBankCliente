package com.bank.operaciones;

import com.bank.negocio.Cliente;
import com.bank.ui.HistorialUI;
import com.bank.ui.Inicio;
import com.bank.ui.Login;
import com.bank.ui.Transferencia;

public class FuncionesMenu {
    public void login(){
        Login login = new Login();  
        login.setTitle("Bienvenido a WestBank");
        login.setResizable(true);
        login.setLocationRelativeTo(null);
        login.setVisible(true);        
    }
    
    public void inicio(Cliente cliente){
        Inicio home = new Inicio(cliente);  
        home.setTitle("Inicio");
        home.setResizable(true);
        home.setLocationRelativeTo(null);
        home.setVisible(true);        
    }
    
    public void transferencia(Cliente cliente){
        Transferencia transferencia = new Transferencia(cliente);  
        transferencia.setTitle("Transferencias");
        transferencia.setResizable(true);
        transferencia.setLocationRelativeTo(null);
        transferencia.setVisible(true);        
    }
    
    public void historial(Cliente cliente){
        HistorialUI historial = new HistorialUI(cliente);  
        historial.setTitle("Historial de transacciones");
        historial.setResizable(true);
        historial.setLocationRelativeTo(null);
        historial.setVisible(true);        
    }
       
}
