package mediaaluno;
import java.util.*;

public class MediaAluno {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[3];
        double media;
        
        for (int i = 0; i<3; i++) {
            System.out.print("Digite a nota "+(i+1)+": ");
            notas[i] = sc.nextDouble();
        }
        
        media = (notas[0]+notas[1]+notas[2])/3;
        
        if (media < 5) System.out.println("Aluno reprovado.");
        else if (media >=5 && media < 7) System.out.println("Aluno de recuperação.");
        else System.out.println("Aluno aprovado.");
        
    }

}
