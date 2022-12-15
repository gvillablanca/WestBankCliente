package com.bank.negocio;


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
        
}
