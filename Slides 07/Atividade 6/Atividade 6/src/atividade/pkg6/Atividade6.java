package atividade.pkg6;
import java.util.*;

public class Atividade6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String nome;
        double imposto, salarioBruto, aumento;
        Funcionario f = null;
        
        System.out.println("Digite os dados do Funcionario");
        System.out.print("Nome: "); nome = sc.next();
        System.out.print("Salario Bruto: "); salarioBruto = sc.nextDouble();
        System.out.print("Imposto: "); imposto = sc.nextDouble();

        try {
            f = new Funcionario(nome, salarioBruto, imposto);
        } catch (Exception e) {System.out.println(e);} 
        
        if (f!=null) {
            System.out.println(f.toString());
            System.out.println("Digite a % de aumento desejada (0 a 100)");
            aumento = sc.nextDouble();
            f.aumentoSalario(aumento);
            System.out.println(f.toString());
        }
        
    }

}
