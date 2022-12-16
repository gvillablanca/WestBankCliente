package com.bank.accesoDatos;

import com.bank.negocio.Cuenta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class CuentaDA {
        public ResultSet getCuenta (int numeroCuenta){
        DBConnect dbCtx = new DBConnect(); 
        String st = "SELECT NUMERO_CUENTA, TIPO_CUENTA, SALDO FROM CUENTA WHERE NUMERO_CUENTA = ?";
        ResultSet rs;
        try{
            PreparedStatement pst = dbCtx.getConnection().prepareStatement(st);
            pst.setInt(1, numeroCuenta);
            rs=pst.executeQuery();
            return rs;
        }
        catch(SQLException e){
            System.out.println("error: " + e.getMessage());
            return null;
        } 
    }
        
    public int updateSaldo(Cuenta cuenta){
        DBConnect dbCtx = new DBConnect(); 
        String st = "UPDATE CUENTA SET SALDO = ? WHERE NUMERO_CUENTA = ?";
        int rs;
        try{
            PreparedStatement pst = dbCtx.getConnection().prepareStatement(st);
            pst.setInt(1, cuenta.getSaldoCuenta());
            pst.setInt(2, cuenta.getNumeroCuenta());
            rs=pst.executeUpdate();
            return rs;
        }
        catch(SQLException e){
            System.out.println("error: " + e.getMessage());
            return 0;
        }        
    }
}
