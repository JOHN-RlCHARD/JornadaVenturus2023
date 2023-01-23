package produtos;
import java.util.*;

public class Produtos {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opt = 0, pA=0, pB=0, pC=0;
        
        do {
            
            do {
                System.out.println("Digite o numero do produto comprado ou 4 para sair: "
                        + "\n[1] Produto A"
                        + "\n[2] Produto B"
                        + "\n[3] Produto C"
                        + "\n[4] Fim");
                opt = sc.nextInt();
                if (opt < 1 || opt > 4) System.out.println("***CODIGO INVALIDO***");
            } while (opt < 1 || opt > 4);
            
            switch (opt) {
                case 1:
                    pA++;
                    break;
                case 2:
                    pB++;
                    break;
                case 3:
                    pC++;
                    break;
            }
            
        } while (opt != 4);
        
        System.out.println("\nMUITO OBRIGADO!");
        System.out.println("Vendas por produto: ");
        System.out.println("Produto A = "+pA);
        System.out.println("Produto B = "+pB);
        System.out.println("Produto C = "+pC);
        
    }

}
