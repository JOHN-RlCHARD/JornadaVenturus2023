package funcoes;
import java.util.*;

public class Funcoes {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.println("Digite o primeiro elemento: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo elemento");
        b = sc.nextInt();
        
        System.out.println("\nSoma: "+soma(a,b));
        System.out.println("Multiplicação: "+mult(a, b));
        System.out.println("Dobro de "+a+": "+dobro(a));
        System.out.println("Dobro de "+b+": "+dobro(b));
        
    }
    
    static int soma (int x, int y) {
        return x+y;
    }
    
    static int mult (int x, int y) {
        return x*y;
    }
    
    static int dobro (int x) {
        return x*2;
    }

}
