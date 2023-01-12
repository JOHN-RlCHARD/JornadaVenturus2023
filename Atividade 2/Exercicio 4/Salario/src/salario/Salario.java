package salario;
import java.util.*;

public class Salario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, horas;
        double valorHora, salario;
        
        System.out.println("Digite o o número, horas trabalhadas e"
                + " salário do funcionário, respecitivamente.");
        num = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();
        
        salario = horas * valorHora;
        
        System.out.format("O salário do funcionário de numero "
                +num+" é R$ %.2f\n", salario);
        
    }
    
}
