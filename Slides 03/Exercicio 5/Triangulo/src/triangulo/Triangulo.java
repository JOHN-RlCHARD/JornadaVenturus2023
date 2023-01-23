package triangulo;
import java.util.*;

public class Triangulo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        
        System.out.println("Digite os lados do triangulo: ");
        System.out.print("A = "); a = sc.nextDouble();
        System.out.print("B = "); b = sc.nextDouble();
        System.out.print("C = "); c = sc.nextDouble();
        
        if (!((a+b)>c && (a+c)>b && (b+c)>a)) System.out.println("Não é possível formar um Triângulo "
                + "com os lados informados.");
        else {
            
            String tipo = (a == b && a == c)
                ? "Equilátero"
                : (a == b || a == c)
                    ? "Isósceles"
                    : "Escaleno";
            
            System.out.println("É possível formar um Triângulo "+tipo+
                    " com os lados informados.");
            
        }
        
    }

}
