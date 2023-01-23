package tempojogo;
import java.util.*;

public class TempoJogo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int h0, h1, duracao;
        
        System.out.println("Digite a hora inicial do jogo: ");
        h0 = sc.nextInt();
        System.out.println("Digite a hora final do jogo: ");
        h1 = sc.nextInt();
        
        if ( h0 == h1 ) System.out.println("O jogo durou 24 horas.");
        else {
            duracao = h1 - h0;
            System.out.println("O jogo durou "+duracao+" horas");
        }
        
    }

}
