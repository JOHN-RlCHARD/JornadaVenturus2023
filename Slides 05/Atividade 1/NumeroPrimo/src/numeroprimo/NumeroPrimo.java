package numeroprimo;
import java.util.*;

public class NumeroPrimo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = -1, divs = 0;
        
        while ( num <= 0) {
            System.out.println("Digite um número inteiro positivo para checar se é primo: ");
            num = sc.nextInt();
        }
        
        int aux = 1;
        do {
            if ( num%aux == 0 ) divs++;
            aux++;
        } while (aux != num && num != 1);
        
        if (divs == 1 && num!=1) System.out.println(num+" é primo! :)");
        else System.out.println(num+" não é primo :(");
        
    }

}
