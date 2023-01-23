package aumentosalario;
import java.util.*;

public class AumentoSalario {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nome;
        double salarioAtual, salarioNovo, aumento = 0.0;
        
        System.out.println("Digite o nome do funcionário: ");
        nome = sc.next();
        System.out.println("Digite o salario atual: ");
        salarioAtual = sc.nextDouble();
        
        if (salarioAtual < 0) System.out.println("Salario Invalido.");
        else if (salarioAtual <= 3) aumento = 0.2;
        else if (salarioAtual <= 6) aumento = 0.15;
        else if (salarioAtual <= 9) aumento = 0.12;
        else if (salarioAtual <= 12) aumento = 0.1;
        else if (salarioAtual <= 15) aumento = 0.07;
        
        salarioNovo = salarioAtual + (salarioAtual*aumento);
        
        System.out.format("Aumento = %.0f", (aumento*100));
        System.out.println("%");
        System.out.format("Salario Atual = %.0f\n", salarioAtual);
        System.out.format("Salario Novo = %.2f\n", salarioNovo);
        
    }

}
