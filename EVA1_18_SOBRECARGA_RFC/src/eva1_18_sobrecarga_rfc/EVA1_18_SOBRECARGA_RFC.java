/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_18_sobrecarga_rfc;

/**
 *
 * @author invitado
 */
public class EVA1_18_SOBRECARGA_RFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String rfc=generarRFC("Ruben", "Acosta", "Guerrero", 2004, 8, 16);
        System.out.println(rfc);
        
        
        String rfc2=generarRFC("Ruben", "Acosta", 2004, 8, 16);
        System.out.println(rfc2);
        
        
        String rfc3=generarRFC("Ruben", 2004, 8, 16);
        System.out.println(rfc3);
    }
    
    public static String generarRFC(String nombre, String apellidoP, String apellidoM, int año, int mes, int dia){
        String nom=nombre.charAt(0)+"";
        String ap=apellidoP.charAt(0)+"";
        String ap2=apellidoP.charAt(1)+"";
        String apM=apellidoM.charAt(0)+"";
        
        String rfc=ap+ap2+apM+nom+año+mes+dia+"";
        
        return rfc;
    }
    
    public static String generarRFC(String nombre, String apellidoP, int año, int mes, int dia){
        String nom=nombre.charAt(0)+"";
        String ap=apellidoP.charAt(0)+"";
        String ap2=apellidoP.charAt(1)+"";
        
        
        String rfc=ap+ap2+"X"+nom+año+mes+dia+"";
        
        return rfc;
    }
    
    public static String generarRFC(String nombre, int año, int mes, int dia){
        String nom=nombre.charAt(0)+"";

        
        
        String rfc="XX"+nom+año+mes+dia+"";
        
        return rfc;
    }
    
    
}
