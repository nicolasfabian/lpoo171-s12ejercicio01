/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s12ejercicio01;

/**
 *
 * @author alumno
 */
public class Cuenta {
   
    private double saldo;
    private String titular;
    
    public Cuenta(String titular, double saldo){
        this.saldo = saldo;
        this.titular = titular;       
    }
    
    public void realizarDeposito(double monto) {
        saldo += monto ;
    }
    
    public void realizarRetiro(double monto) {
        saldo -= monto;
    }
    
    public double obtenerSaldo(){
        return saldo;
    }
    
    @Override
    public String toString(){
        return titular + " Saldo: " + saldo;
    }    
 }

