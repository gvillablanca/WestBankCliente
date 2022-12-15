package com.bank.operaciones;

import com.bank.ui.Historial;
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
    
    public void inicio(){
        Inicio home = new Inicio();  
        home.setTitle("Inicio");
        home.setResizable(true);
        home.setLocationRelativeTo(null);
        home.setVisible(true);        
    }
    
    public void transferencia(){
        Transferencia transferencia = new Transferencia();  
        transferencia.setTitle("Transferencias");
        transferencia.setResizable(true);
        transferencia.setLocationRelativeTo(null);
        transferencia.setVisible(true);        
    }
    
    public void historial(){
        Historial historial = new Historial();  
        historial.setTitle("Historial de transacciones");
        historial.setResizable(true);
        historial.setLocationRelativeTo(null);
        historial.setVisible(true);        
    }
       
}
