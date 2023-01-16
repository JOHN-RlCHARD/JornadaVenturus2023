package multiplos;
import java.util.*;

public class Multiplos {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.println("Digite os 2 números: ");
        a = sc.nextInt();
        b = sc.nextInt();
        
        if (a%b == 0 || b%a == 0) System.out.println("São Multiplos");
        else System.out.println("Não são Multiplos");
        
    }

}
