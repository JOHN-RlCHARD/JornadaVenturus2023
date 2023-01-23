package empresa;
import java.util.*;

public class Empresa {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double salarioInicial, primeiroAumento;
        int anoContratacao, anoFuturo;
        Salario salario;
        
        System.out.println("Digite o ano de contratacao do funcionário: ");
        anoContratacao = sc.nextInt();
        System.out.println("Digite o salário inicial do funcionário: ");
        System.out.print("R$ "); salarioInicial = sc.nextDouble();
        System.out.println("Digite a porcentagem do primeiro aumento: (de 0 a 100)");
        primeiroAumento = sc.nextDouble();
        System.out.println("Deseja calcular o salário até qual ano? ");
        anoFuturo = sc.nextInt();
        
        try {
            salario = new Salario(salarioInicial, anoContratacao);
            salario.Aumento(primeiroAumento);
            salario.calcSalario(anoFuturo);
        } catch (Exception e) {System.out.println(e);}

    }

}
