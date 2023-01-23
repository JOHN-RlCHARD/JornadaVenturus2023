package financiamento;
import java.util.*;

public class Financiamento {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double financiamento, salario;
        
        System.out.println("Digite o valor do salário: ");
        salario = sc.nextDouble();
        System.out.println("Digite o valor do financiamento: ");
        financiamento = sc.nextDouble();
        
        if ( financiamento <= 5*salario) System.out.println("Financiamento Concedido.");
        else System.out.println("Financiamento negado.");
        
        System.out.println("Obrigado por nos consultar.");
        
    }

}
