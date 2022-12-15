package com.bank.accesoDatos;

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
}
