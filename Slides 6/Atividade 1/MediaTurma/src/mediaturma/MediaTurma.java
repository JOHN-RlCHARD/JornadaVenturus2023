package mediaturma;
import java.util.*;

public class MediaTurma {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String[] nomes = new String[5];
        double[] medias = new double[5];
        double mediaTurma, n1, n2;
        
        for (int i=0; i<nomes.length; i++) {
            System.out.println("\n----------Aluno "+(i+1)+"-------------");
            System.out.print("Nome: "); nomes[i] = sc.next();
            System.out.print("Nota 1: "); n1 = sc.nextDouble();
            System.out.print("Nota 2: "); n2 = sc.nextDouble();
            medias[i] = (n1+n2)/2; 
        }
        
        mediaTurma = (medias[0] + medias[1] + medias[2] + medias[3] + medias[4])/5;
        System.out.format("\nMédia da Turma = %.2f\n", mediaTurma);
        
        System.out.println("Alunos acima da média da turma: ");
        for (int i=0; i<nomes.length; i++) {
            if (medias[i]>mediaTurma) {
                System.out.println("\n"+nomes[i]);
                System.out.format("Média: %.2f\n", medias[i]);
            }
        }
        
    }

}
