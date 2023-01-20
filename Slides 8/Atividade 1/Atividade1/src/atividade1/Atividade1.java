package atividade1;
import java.util.*;

public class Atividade1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ContaBanco contaJoao = new ContaBanco();
        ContaBanco contaMaria = new ContaBanco();
        
        contaJoao.abrirConta("João Silva", "CC", "0001");
        contaJoao.printConta();
        contaMaria.abrirConta("Maria Silva", "CP", "0002");
        contaMaria.printConta();
        
        contaJoao.depositar(300);
        contaJoao.printConta();
        
        contaMaria.depositar(400);
        contaMaria.printConta();
        
    }

}
