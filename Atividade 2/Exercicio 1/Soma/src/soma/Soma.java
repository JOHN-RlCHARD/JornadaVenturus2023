package soma;
import java.util.*;

public class Soma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2, soma;
        
        System.out.println("Digite um número inteiro:");
        n1 = sc.nextInt();
        System.out.println("Digite um número inteiro para ser somado ao anterior:");
        n2 = sc.nextInt();
        
        soma = n1 + n2;
        
        System.out.println("A soma é = "+soma);
        
    }
    
}
