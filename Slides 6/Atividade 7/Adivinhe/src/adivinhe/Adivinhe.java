package adivinhe;
import java.util.*;

public class Adivinhe {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int rnd = (int) (Math.random()*100);
        int opt = -1;
        
        System.out.println("Tente adivinhar o número aleatório entre 0 e 100");
        
        while (opt != rnd) {
            opt = sc.nextInt();
            
            if (opt==rnd) System.out.println("Parabéns! Voce acertou!");
            else if (opt<rnd) System.out.println("O número é maior que "+opt);
            else System.out.println("O número é menor que "+opt);
            
        }
        
    }

}
