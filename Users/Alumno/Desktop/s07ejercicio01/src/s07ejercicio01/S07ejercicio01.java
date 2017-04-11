/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio01;

/**
 *
 * @Nicolas Zuñiga
 */
public class S07ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int diasAnio = 365;
        int horasdia = 24;
        int minutosHora = 60;
        int segundosMinuto = 60;
        
        int segundosAnio = diasAnio * horasdia * minutosHora * segundosMinuto;
        int segundosAniox2 = segundosAnio * 2;
        
        System.out.println("Hay " + segundosAnio + " segundos en un año");
        System.out.println("Hay " + segundosAniox2 + " segundos en dos año");
                                              
    }
    
}
