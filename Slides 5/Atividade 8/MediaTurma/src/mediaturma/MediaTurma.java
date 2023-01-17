package mediaturma;
import java.util.*;

public class MediaTurma {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        double[][] notas = new double [3][2];
        String[] nomes = new String[3];
        double mediaTurma = 0;
        
        for (int i=0; i<notas.length; i++) {
            System.out.println("*** ALUNO "+(i+1)+" ***");
            System.out.print("Nome: "); nomes[i] = sc.next();
            System.out.print("Nota 1: "); notas[i][0] = sc.nextDouble();
            System.out.print("Nota 2: "); notas[i][1] = sc.nextDouble();
        }
        
        for (int i=0; i<notas.length; i++) {
            System.out.println("\n*** ALUNO "+(i+1)+" ***");
            System.out.println("Nome: "+nomes[i]);
            System.out.println("Nota 1: "+notas[i][0]); 
            System.out.println("Nota 2: "+notas[i][1]);
            double media = ((notas[i][0]+notas[i][1])/2);
            System.out.format("Média: %.2f\n", media);
            if (media>=6) System.out.println("Situação: Aprovado");
            else System.out.println("Situação: Reprovado");
            
            mediaTurma += media;
            
        }
        
        System.out.format("\n*** Média da Turma = %.2f ***\n", mediaTurma/3);
        
    }

}
