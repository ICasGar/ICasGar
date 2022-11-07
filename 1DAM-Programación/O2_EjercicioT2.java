/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02_ejerciciot2;
import bpc.daw.mario.*; 
/**
 *
 * @author Iván Castro
 */
public class O2_EjercicioT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Mario m1= null;
        Disparo d1,d2,d3,d4,d5=null;
        Cañon C1, C2=null;
        
        m1=new Mario(500,500);
        C1=new Cañon(500,300);
        C2=new Cañon(400,300);
        d1=new Disparo (500,300,500,500);
        d2=new Disparo (500,300,500,500);
        d3=new Disparo (500,300,500,500);
        d4=new Disparo (400,300,500,500);
        d5=new Disparo (400,300,500,500);
             
    }
    
}
