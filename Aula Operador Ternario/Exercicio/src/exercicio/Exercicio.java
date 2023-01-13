package exercicio;
import java.util.*;

public class Exercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double preco, precoFinalOT, precoFinalIf;
        
        System.out.println("Digite o preço do produto: ");
        preco = sc.nextDouble();
        
        //A) OPERADOR TERNARIO
        precoFinalOT = preco >= 30
                ? preco*0.8
                : preco*0.9;
        
        //B) IF ELSE
        if (preco >= 30) 
            precoFinalIf = preco*0.8; 
        else
            precoFinalIf = preco*0.9;
        
        System.out.format("Preço final com Operador Ternario = R$%.2f\n", precoFinalOT);
        System.out.format("Preço final com If else = R$%.2f\n", precoFinalIf);
        
    }
    
}
