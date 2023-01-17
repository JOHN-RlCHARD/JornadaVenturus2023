package divisores;
import java.util.*;

public class Divisores {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = 0, qtdDivs = 0;
        
        while ( n <= 0) {
            System.out.println("Digite um número inteiro posivito: ");
            n = sc.nextInt();
        }
        
        int[] divs = new int[n]; 
        
        for (int i=1; i<=n; i++) {
            if (n%i == 0) {
                divs[qtdDivs] = i;
                qtdDivs++;
            }
        }
        
        System.out.println("Os divisores de "+n+" são: ");
        System.out.print("{ ");
        for (int i=0; i<qtdDivs; i++) {
            System.out.print(divs[i]);
            if (i!=qtdDivs-1) System.out.print(", ");
        }
        System.out.print(" }\n");
        
    }

}
