package areadocirculo;
import java.util.*;

public class AreaDoCirculo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double raio, area, pi;
        pi = 3.14159;
        
        System.out.println("Digite o raio do círculo: ");
        raio = sc.nextDouble();
        
        area = pi*raio*raio;
        
        System.out.format("A área do círculo é: %.4f\n", area);
        
    }
    
}
