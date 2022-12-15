package com.bank.negocio;


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
    
}