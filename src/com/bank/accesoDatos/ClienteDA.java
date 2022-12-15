package com.bank.accesoDatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ClienteDA {
            
        public ResultSet verificarCliente (int rut, String dv, String clave){
        DBConnect dbCtx = new DBConnect(); 
        String st = "SELECT \n" +
                "    RUT,\n" +
                "    DV,\n" +
                "    PASS,\n" +
                "    NOMBRE,\n" +
                "    APELLIDO_PATERNO,\n" +
                "    APELLIDO_MATERNO,\n" +
                "    DOMICILIO,\n" +
                "    COMUNA,\n" +
                "    TELEFONO,\n" +
                "    NUMERO_CUENTA,\n" +
                "    TIPO_CUENTA\n" +
                "FROM\n" +
                "    CLIENTE\n" +
                "WHERE\n" +
                "    RUT = ? AND DV = ? AND PASS = ?";
        ResultSet rs;
        try{
            PreparedStatement pst = dbCtx.getConnection().prepareStatement(st);
            pst.setInt(1, rut);
            pst.setString(2, dv);
            pst.setString(3, clave);
            rs=pst.executeQuery();
            return rs;
        }
        catch(SQLException e){
            System.out.println("error: " + e.getMessage());
            return null;
        } 
    }
}
