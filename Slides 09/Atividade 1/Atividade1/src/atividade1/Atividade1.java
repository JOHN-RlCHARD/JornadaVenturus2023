package atividade1;
import java.util.*;

public class Atividade1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String proprietario;
        double depositoInicial;
        
        System.out.println("Digite o Nome do titular para criar a conta: ");
        proprietario = sc.nextLine();
        System.out.println("Digite o valor para depositar inicialmente(0 caso não deseje depositar)");
        depositoInicial = sc.nextDouble();
        
        Conta c = new Conta("00001", proprietario, depositoInicial);
        c.depositar(5000);
        c.sacar(250);
        
    }

}
