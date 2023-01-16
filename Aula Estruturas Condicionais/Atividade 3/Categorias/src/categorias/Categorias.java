package categorias;
import java.util.*;

public class Categorias {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int idade;
        String nome;
        
        System.out.println("Digite o nome e idade do jogador, respectivamente: ");
        nome = sc.next();
        idade = sc.nextInt();
        
        if (idade >= 5 && idade < 11) {
            System.out.println("O jogador "+nome+" é Infantil");
        } else if (idade >= 11 && idade < 16){
            System.out.println("O jogador "+nome+" é Juvenil");
        } else if (idade >=16 && idade < 21) {
            System.out.println("O jogador "+nome+" é Junior");
        } else if (idade >= 21 && idade <26) {
            System.out.println("O jogador "+nome+" é Profissional");
        } else {
            System.out.println("Idade não categorizada.");
        }
        
    }

}
