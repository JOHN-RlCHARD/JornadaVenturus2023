package quadrantes;
import java.util.*;

public class Quadrantes {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double x=0, y=0;
        
        do {
            
            System.out.println("\nDigite as coordenadas: ");
            System.out.print("x = "); x = sc.nextDouble();
            System.out.print("y = "); y = sc.nextDouble();
            
            if ( x > 0 && y > 0) System.out.println("Primeiro Quadrante");
            else if ( x > 0 && y < 0 ) System.out.println("Quarto Quadrante");
            else if ( y > 0 && x < 0) System.out.println("Segundo Quadrante");
            else if ( x < 0 && y < 0 ) System.out.println("Terceiro Quadrante");
            
        } while (x != 0 && y != 0);
        
        System.out.println("Algoritmo Interrompido!!");
        
    }

}
