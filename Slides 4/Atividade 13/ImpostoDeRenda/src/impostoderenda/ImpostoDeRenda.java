package impostoderenda;
import java.util.*;

public class ImpostoDeRenda {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double salario, imposto;
        
        System.out.println("Digite o salário: ");
        salario = sc.nextDouble();
        
        if ( salario < 0 ) System.out.println("Salário inválido");
        else if ( salario < 1903.98 ) System.out.println("Isento de Imposto de Renda");
        else if ( salario < 2826.65 ) {
            imposto = 0.075*salario;
            System.out.format("Imposto de Renda: R$ %.2f\n", imposto);
        } else if ( salario < 3751.05 ) {
            imposto = 0.15*salario;
            System.out.format("Imposto de Renda: R$ %.2f\n", imposto);
        } else if ( salario < 4664.68 ) {
            imposto = 0.225*salario;
            System.out.format("Imposto de Renda: R$ %.2f\n", imposto);
        } else {
            imposto = 0.275*salario;
            System.out.format("Imposto de Renda: R$ %.2f\n", imposto);
        }
        
    }

}
