package atividade3;
import java.util.*;

public class Atividade3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Digite um número inteiro para checar: ");
        n = sc.nextInt();
        
        OperacaoMatematica.negativoOuPositivo(n);
        OperacaoMatematica.parOuImpar(n);
        
    }

}
