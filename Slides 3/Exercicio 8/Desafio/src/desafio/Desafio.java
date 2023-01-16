package desafio;
import java.util.*;

public class Desafio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double delta, a, b, c, x1, x2;
        
        System.out.println("Digite o valor de a, b e c, respectivamente:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        System.out.println("Equaçao digitada:\n"+a+"x² + "+b+"x + "+c+" = 0");
        
        delta = Math.pow(b,2) - (4*a*c);
        x1 = b*(-1) + Math.sqrt(delta);
        x1 /= 2*a;
        x2 = b*(-1) - Math.sqrt(delta);
        x2 /= 2*a;
        
        System.out.println("\n-----SOLUÇÃO------");
        System.out.format("x1 = %.2f\n", x1);
        System.out.format("x2 = %.2f\n", x2);
        
    }
    
}
