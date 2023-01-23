package atividade1;
import java.util.*;

public class Atividade1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Conta c = new Conta("0001", "Pedro", 2000);
        ContaJuridica cj = new ContaJuridica( 500, "0002", "Loja do Pedro", 1000);
        
        c.saque(2500);
        c.deposito(500);
        c.saque(2500);
        
        System.out.println("");
        
        cj.emprestimo(700);
        cj.emprestimo(400);
        
    }

}
