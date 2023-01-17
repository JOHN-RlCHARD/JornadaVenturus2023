package pkgfor;
import java.util.*;

public class For {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int qtdAlunos;
        
        System.out.println("Digite o número de alunos a serem avaliados: ");
        qtdAlunos = sc.nextInt();
        
        double[] notas = new double[qtdAlunos];
        String[] alunos = new String[qtdAlunos];
        
        //INSERÇÃO DE DADOS
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("----------------------------");
            System.out.println("Aluno "+(i+1));
            System.out.print("Nome: ");
            String aluno = sc.next();
            System.out.print("Nota 1: ");
            double n1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double n2 = sc.nextDouble();
            System.out.print("Nota 3: ");
            double n3 = sc.nextDouble();
            
            notas[i] = (n1*2) + (n2*3) + (n3*5);
            notas[i] /= 10;
            alunos[i] = aluno;
            
        }
        
        System.out.println("\n---------------------------------");
        System.out.println("MEDIAS CALCULADAS:");
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("_______________________");
            System.out.println("Aluno: "+alunos[i]);
            System.out.format("Média: %.2f\n", notas[i]);
        }
        
    }

}
