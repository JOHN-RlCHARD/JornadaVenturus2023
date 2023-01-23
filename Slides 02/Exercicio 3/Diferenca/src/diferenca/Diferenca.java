package diferenca;
import java.util.*;

public class Diferenca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int diferenca, a, b, c, d;
        
        System.out.println("Digite um valor para A: ");
        a = sc.nextInt();
        System.out.println("Digite um valor para B: ");
        b = sc.nextInt();
        System.out.println("Digite um valor para C: ");
        c = sc.nextInt();
        System.out.println("Digite um valor para D: ");
        d = sc.nextInt();
        
        diferenca = (a*b)-(c*d);
        
        System.out.println("Diferenca =  "+diferenca);
        
    }
    
}
