package atividade2;
import java.util.*;

public class Atividade2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();
        int qtd;
            
        System.out.println("Quantos estudantes para o curso A?");
        qtd = sc.nextInt();
        for (int i=0; i<qtd; i++) {
            Integer aluno = sc.nextInt();
            a.add(aluno);
        }
        
        System.out.println("Quantos estudantes para o curso B?");
        qtd = sc.nextInt();
        for (int i=0; i<qtd; i++) {
            Integer aluno = sc.nextInt();
            b.add(aluno);
        }
        
        System.out.println("Quantos estudantes para o curso C?");
        qtd = sc.nextInt();
        for (int i=0; i<qtd; i++) {
            Integer aluno = sc.nextInt();
            c.add(aluno);
        }
        
        Set<Integer> d = new HashSet<>();
        d.addAll(c);
        d.addAll(b);
        d.addAll(a);
        
        System.out.println("Total de Estudantes: "+d.size());
        
    }

}
