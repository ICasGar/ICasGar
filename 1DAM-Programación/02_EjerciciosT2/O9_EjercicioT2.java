package pkg09_ejerciot2;
import bpc.daw.objetos.*;
public class O9_EjercicioT2 {

    public static void main(String[] args) {
        Caja c=null;
        String m = "Holi";
        c=new Caja(m);
        System.out.println("El mensaje con la caja cerradad es: "+c.getMensaje());
        c.abrirCaja();
        System.out.println("El mensaje con la caja cerradad es: "+c.getMensaje());
        
    }
    
}
