package com.bank.operaciones;

import com.bank.negocio.Cliente;
import com.bank.negocio.Cuenta;
import com.bank.negocio.Historial;
import javax.swing.JOptionPane;

public class FuncionesBanco {
    public static boolean isNumeric(String cadena){
	try {
            Integer.parseInt(cadena);
            return true;
	} 
        catch (NumberFormatException e){
            System.out.println("INGRESE VALOR NUMERICO...");
            return false;
	}
    }
    
    public static String checkRut(String rut) {
        try
        {
            int cont=0;
            String format;
            if(rut.length() == 0){
                return "";
            }else{
                rut = rut.replace(".", "");
                rut = rut.replace("-", "");
                format = "-"+rut.substring(rut.length()-1);
                for(int i = rut.length()-2;i>=0;i--){
                    format = rut.substring(i, i+1)+format;
                    cont++;
                    if(cont == 3 && i != 0){
                        format = "."+format;
                        cont = 0;
                    }
                }
                return format;
            }
        }
        catch(Exception e){
            String mensaje = e.toString();
            return mensaje;
        }
    }
    
    public static boolean loginCliente(String rut, String dv, String clave){
        try{
            int rutInt = Integer.parseInt(rut);
            
            Cliente cliente = new Cliente();
            cliente.getCliente(rutInt, dv, clave);
                    
            if(cliente != null){
                System.out.println(cliente); 
                return true;
            }
            else{
                return false;
            }            
        }
        catch(NullPointerException e){
            System.out.println("error: " + e);
            return false;
        }
    }
    
    public static boolean getCuenta(int numeroCuenta){
        try{            
            Cuenta cuenta = new Cuenta();
            cuenta.obtener(numeroCuenta);
                     
            if(cuenta != null){
                System.out.println(cuenta);
                return true;
            }
            else{
                return false;
            }            
        }
        catch(NullPointerException e){
            System.out.println("error: " + e);
            return false;
        }
    }
    
    public static boolean getHistorial(int numeroCuenta){
        try{
            Historial historial = new Historial();
            historial.obtener(numeroCuenta);
                      
            if(historial != null){
                System.out.println(historial); 
                return true;
            }
            else{
                return false;
            }            
        }
        catch(NullPointerException e){
            System.out.println("error: " + e);
            return false;
        }
    }
    
    public static boolean verificarCuenta(String numeroCuenta){
        try{
            int numeroCuentaInt = Integer.parseInt(numeroCuenta);
            Cuenta cuenta = new Cuenta();
            cuenta.obtener(numeroCuentaInt);
                     
            if(cuenta.getNumeroCuenta() != 0){
                return true;
            }
            else{
                return false;
            }            
        }
        catch(NullPointerException e){
            System.out.println("error: " + e);
            return false;
        }
    }
    
    public static boolean transferenciaCuenta(String numeroCuenta, int monto, String informacion){
        try{
            int numeroCuentaInt = Integer.parseInt(numeroCuenta);
            
            Cuenta cuenta = new Cuenta();
            cuenta.obtener(numeroCuentaInt);
            
            if(cuenta != null){
                if(informacion.equals("O")){                
                    if(cuenta.getSaldoCuenta()> 0 && cuenta.getSaldoCuenta()>= monto){
                        int saldoOrigenNuevo = cuenta.getSaldoCuenta()- monto;
                        if(cuenta.modificarSaldo(saldoOrigenNuevo, numeroCuentaInt)){
                            return true; 
                        }
                        else{
                            return false;
                        }                         
                    }
                    else{
                       JOptionPane.showMessageDialog(null, "Saldo insuficiente para transferencia", "Advertencia", JOptionPane.OK_OPTION);
                       return false; 
                    }                    
                }
                else if(informacion.equals("D")){          
                    int saldoDestinoNuevo = cuenta.getSaldoCuenta()+ monto;
                    if(cuenta.modificarSaldo(saldoDestinoNuevo, numeroCuentaInt)){
                        return true; 
                    }
                    else{
                        return false;
                    } 
                }
                else{
                   JOptionPane.showMessageDialog(null, "Error en sistema, volver a intentar nuevamente", "Advertencia", JOptionPane.OK_OPTION);
                   return false;  
                }    
            }
            else{
               return false; 
            }   
        }
        catch(NullPointerException e){
            System.out.println("error: " + e);
            return false;
        }
    }
    
    public static boolean actualizarHistorial(int numeroCuenta, int montoTransaccion, int numeroCuentaDestino){
        Historial historial = new Historial();
        boolean rsHistorial = historial.insertarHistorial(numeroCuenta, montoTransaccion, numeroCuentaDestino);
        
        if(rsHistorial){
            return true;
        }
        else{
            return false;
        }
    }
}
