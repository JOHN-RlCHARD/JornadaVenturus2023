package atividade1;
import java.util.*;

public class Atividade1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        List<Funcionario> list = new ArrayList<>();
        int qtdFuncionarios = -1;
        
        while (qtdFuncionarios <= 0) {
            System.out.println("Digite quantos funcionarios deseja inserir: ");
            qtdFuncionarios = sc.nextInt();
        }
        
        //INSERÇAO DOS DADOS
        for (int i=0; i<qtdFuncionarios; i++) {
            String nome, tipo = "";
            double valorHora;
            int horas;
            System.out.println("\n*** Funcionario "+(i+1)+" ***");
            System.out.print("Nome: "); nome = sc.next();
            System.out.print("Valor da Hora: "); valorHora = sc.nextDouble();
            System.out.print("Horas trabalhadas: "); horas = sc.nextInt();
            while (!tipo.equals("s")&&!tipo.equals("n")) {
                System.out.println("Funcionário Terceirizado? [s/n]");
                tipo = sc.next();
            }
            if (tipo.equals("s")) {
                System.out.print("Despesa adicional: ");
                double despesaAdicional = sc.nextDouble();
                list.add(new FuncionarioTerceirizado(nome, horas, valorHora, despesaAdicional));
            } else {
                list.add(new Funcionario(nome, horas, valorHora));
            }
            
        }
        
        //IMPRESSAO DOS DADOS
        for (int i=0; i<qtdFuncionarios; i++) {
            System.out.println(list.get(i));
        }
        
    }

}
