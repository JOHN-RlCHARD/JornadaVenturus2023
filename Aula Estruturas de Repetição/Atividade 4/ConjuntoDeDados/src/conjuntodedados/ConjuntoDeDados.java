package conjuntodedados;
import java.util.*;

public class ConjuntoDeDados {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i = 0, n, qtdHomens = 0;
        double maior = 0;
        
        System.out.println("Digite a quantidade de pessoas: ");
        n = sc.nextInt();
        
        do {
            System.out.println("_______________________");
            System.out.println("Pessoa "+(i+1));
            
            System.out.print("Sexo(h/m): ");
            String sexo = sc.next();
            if (sexo.equalsIgnoreCase("h")) qtdHomens++;
            
            System.out.print("Altura(metros): ");
            double h = sc.nextDouble();
            if ( h > maior ) maior = h;
            
            i++;
        } while ( i != n );
        
        System.out.println("\nA maior altura das "+n+" pessoas é : "+maior+"m");
        System.out.println("Entre elas, "+qtdHomens+" são homens.");
        
    }

}
