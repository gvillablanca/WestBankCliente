package com.bank.negocio;

import com.bank.accesoDatos.ClienteDA;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Cliente {
    int rut;
    String dv;
    String clave;
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String domicilio;
    String comuna;
    int telefono;
    String tipoCuenta;
    int numeroCuenta;

        public int getRut() {
            return rut;
        }

        public void setRut(int rut) {
            this.rut = rut;
        }

        public String getDv() {
            return dv;
        }

        public void setDv(String dv) {
            this.dv = dv;
        }

        public String getClave() {
            return clave;
        }

        public void setClave(String clave) {
            this.clave = clave;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidoPaterno() {
            return apellidoPaterno;
        }

        public void setApellidoPaterno(String apellidoPaterno) {
            this.apellidoPaterno = apellidoPaterno;
        }

        public String getApellidoMaterno() {
            return apellidoMaterno;
        }

        public void setApellidoMaterno(String apellidoMaterno) {
            this.apellidoMaterno = apellidoMaterno;
        }

        public String getDomicilio() {
            return domicilio;
        }

        public void setDomicilio(String domicilio) {
            this.domicilio = domicilio;
        }

        public String getComuna() {
            return comuna;
        }

        public void setComuna(String comuna) {
            this.comuna = comuna;
        }

        public int getTelefono() {
            return telefono;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public String getTipoCuenta() {
            return tipoCuenta;
        }

        public void setCuenta(String tipoCuenta) {
            this.tipoCuenta = tipoCuenta;
        }

        public int getNumeroCuenta() {
            return numeroCuenta;
        }

        public void setNumeroCuenta(int numeroCuenta) {
            this.numeroCuenta = numeroCuenta;
        }
        
        

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut +
                ", dv=" + dv +
                ", clave=" + clave +
                ", nombre=" + nombre +
                ", apellidoPaterno=" + apellidoPaterno +
                ", apellidoMaterno=" + apellidoMaterno +
                ", domicilio=" + domicilio +
                ", comuna=" + comuna +
                ", telefono=" + telefono +
                ", numeroCuenta=" + numeroCuenta +
                ", cuenta=" + tipoCuenta + '}';
    }
    
    public Cliente getCliente(int rut, String dv, String clave){
        ResultSet rs = new ClienteDA().verificarCliente(rut, dv, clave);
        if(rs !=null){
            try{
                if(rs.next()){
                    this.rut = rs.getInt("rut");
                    this.dv = rs.getString("dv");
                    this.clave = rs.getString("pass");
                    this.nombre = rs.getString("nombre");
                    this.apellidoPaterno = rs.getString("apellido_paterno");
                    this.apellidoMaterno = rs.getString("apellido_materno");
                    this.domicilio = rs.getString("domicilio");
                    this.comuna = rs.getString("comuna");
                    this.telefono = rs.getInt("telefono");
                    this.tipoCuenta = rs.getString("tipo_cuenta");
                    this.numeroCuenta = rs.getInt("numero_cuenta");
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
