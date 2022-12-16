package com.bank.negocio;

import com.bank.accesoDatos.HistorialDA;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Historial {
    int codTrx;
    int numeroCuenta;
    int monto;
    int numeroCuentaDestino;
    String fechaTrx;

    public int getCodTrx() {
        return codTrx;
    }

    public void setCodTrx(int codTrx) {
        this.codTrx = codTrx;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getNumeroCuentaDestino() {
        return numeroCuentaDestino;
    }

    public void setNumeroCuentaDestino(int numeroCuentaDestino) {
        this.numeroCuentaDestino = numeroCuentaDestino;
    }

    public String getFechaTrx() {
        return fechaTrx;
    }

    public void setFechaTrx(String fechaTrx) {
        this.fechaTrx = fechaTrx;
    }

    @Override
    public String toString() {
        return "Historial{" + "codTrx=" + codTrx +
                ", numeroCuenta=" + numeroCuenta +
                ", monto=" + monto +
                ", numeroCuentaDestino=" + numeroCuentaDestino +
                ", fechaTrx=" + fechaTrx + '}';
    }
    
    public Historial obtener(int numero_cuenta){
        ResultSet rs = new HistorialDA().getHistorial(numero_cuenta);
        if(rs !=null){
            try{
                if(rs.next()){
                    this.codTrx = rs.getInt("cod_trx");
                    this.numeroCuenta = rs.getInt("numero_cuenta");
                    this.monto = rs.getInt("monto");
                    this.numeroCuentaDestino = rs.getInt("numero_cuenta_des");
                    this.fechaTrx = rs.getString("fecha_trx");
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
    
}