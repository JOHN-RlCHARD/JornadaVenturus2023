package pkgwhile;
import java.util.*;

public class While {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n0, n1;
        
        System.out.print("Digite o número inicial: ");
        n0 = sc.nextInt();
        System.out.print("Digite o número final: ");
        n1 = sc.nextInt();
        
        if ( n0 < n1 ) {
            System.out.println("Contagem crescente: ");
            while ( n0 != n1+1) {
                System.out.println(n0);
                n0++;
            }
        } else {
            System.out.println("Contagem decrescente: ");
            while ( n0 != n1-1 ) {
                System.out.println(n0);
                n0--;
            }
        }
        
    }

}
