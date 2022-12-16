package com.bank.accesoDatos;

import com.bank.negocio.Historial;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class HistorialDA {
        public ResultSet getHistorial (int numeroCuenta){
        DBConnect dbCtx = new DBConnect(); 
        String st = "SELECT \n" +
                "    COD_TRX, NUMERO_CUENTA, MONTO, NUMERO_CUENTA_DES, FECHA_TRX\n" +
                    "FROM\n" +
                    "    HISTORIAL_CLIENTE\n" +
                    "WHERE\n" +
                    "    NUMERO_CUENTA = ?";
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
        
    public int insertHistorial(Historial historial){
        DBConnect dbCtx = new DBConnect(); 
        String st = "INSERT INTO HISTORIAL_CLIENTE(NUMERO_CUENTA, MONTO, NUMERO_CUENTA_DES)\n" +
                    "VALUES(?, ?, ?)";
        int rs;
        try{
            PreparedStatement pst = dbCtx.getConnection().prepareStatement(st);
            pst.setInt(1, historial.getNumeroCuenta());
            pst.setInt(2, historial.getMonto());
            pst.setInt(3, historial.getNumeroCuentaDestino());             
            rs=pst.executeUpdate();
            return rs;
        }
        catch(SQLException e){
            System.out.println("error: " + e.getMessage());
            return 0;
        }        
    } 
}
