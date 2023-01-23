package parimparnegativo;
import java.util.*;

public class ParImparNegativo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Digite um número inteiro: ");
        num = sc.nextInt();
        
        if ( num >= 0 ) {
            if ( num%2 == 0 ) System.out.println("O número é par!");
            else System.out.println("O número é impar!");
        } else System.out.println("O número é negativo!");
        
    }

}
