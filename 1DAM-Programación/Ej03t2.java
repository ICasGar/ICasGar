package ej01t2;
import bpc.daw.mario.*; 
import bpc.daw.mario.Luigi;
import bpc.daw.mario.Disparo;
import bpc.daw.mario.Planta;
public class Ej03t2 {
    public static void main(String[] args) {
        Mario m1, m2= null;
        Seta s1= null;
        Luigi l1= null;
        Planta p1= null;
        Cañon c1= null;
        Disparo d1= null;
         
        m1=new Mario(100);
        m2=new Mario(640,320);
        m2=new Mario(250,200);
        Luigi l= new Luigi(200,200); 
        Seta s=new Seta(0,0);
        Cañon c=new Cañon(100,320);
        Planta pl1=new Planta(400,500);
        Planta pl2=new Planta(450,500);
        Planta pl3=new Planta(500,500);
    }
    
}
