package com.bank.negocio;

import com.bank.accesoDatos.CuentaDA;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Cuenta {
    int numeroCuenta;
    int saldoCuenta;
    String descripcionCuenta;

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(int saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public String getDescripcionCuenta() {
        return descripcionCuenta;
    }

    public void setDescripcionCuenta(String descripcionCuenta) {
        this.descripcionCuenta = descripcionCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta +
                ", saldoCuenta=" + saldoCuenta +
                ", descripcionCuenta=" + descripcionCuenta + '}';
    }
    
    public Cuenta obtener(int numero_cuenta){
        ResultSet rs = new CuentaDA().getCuenta(numero_cuenta);
        if(rs !=null){
            try{
                if(rs.next()){
                    this.numeroCuenta = rs.getInt("numero_cuenta");
                    this.descripcionCuenta = rs.getString("tipo_cuenta");
                    this.saldoCuenta = rs.getInt("saldo");
                    return this;
                }
                else{
                    System.out.println("Falló");
                    return null;
                }
            }catch(SQLException ex) {
                System.out.println("Falló" + ex);
                return null;
            }
        }
        else{
            return null;
        }
    }
    
    public boolean modificarSaldo(int saldo, int numero_cuenta){
        this.setNumeroCuenta(numero_cuenta);
        this.setSaldoCuenta(saldo);
        
        int reg = new CuentaDA().updateSaldo(this);
        
        if(reg == 1){
            return true;
        }
        else{
            return false;
        }
    }
}
