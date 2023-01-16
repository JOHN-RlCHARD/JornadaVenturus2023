package maiormenor10;
import java.util.*;

public class MaiorMenor10 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x;
        
        System.out.println("Digite um numero inteiro: ");
        x = sc.nextInt();
        
        String res = (x > 10)
                ? "Numero é maior que 10"
                : (x > 5)
                    ? "Numero é maior que 5"
                    : "Numero é menor que 5";
        
        System.out.println(res);
        
    }

}
