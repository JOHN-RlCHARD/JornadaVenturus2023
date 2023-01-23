package notas;
import java.util.*;

public class Notas {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String nome;
        double notas[] = new double[3];
        Estudante aluno;
        
        System.out.println("Digite o nome do aluno: ");
        nome = sc.next();
        
        for(int i=0; i<notas.length; i++) {
            System.out.print("Nota "+(i+1)+":"); notas[i] = sc.nextDouble();
        }
        
        try {
            aluno = new Estudante(nome, notas);
            aluno.situacao();
        } catch (Exception e) {System.out.println(e);}
        
    }

}
