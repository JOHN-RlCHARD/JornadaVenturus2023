package atividade4;
import java.util.*;

public class Atividade4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cod, qtd;

        System.out.println("Digite o código do produto: "
                + "\n[1] Cachorro-Quente"
                + "\n[2] X-Salada"
                + "\n[3] X-Bacon"
                + "\n[4] Torrada"
                + "\n[5] Refrigerante"
        );
        cod = sc.nextInt();
        
        try {
            Produtos produto = new Produtos(cod);
            System.out.println("Digite a quantidade: ");
            qtd = sc.nextInt();
            produto.calcValor(qtd);
        } catch (Exception e) { System.out.println(e); }
        
    }

}
