package vetorordenado;
import java.util.*;

public class VetorOrdenado {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] vect = new int[10];
        
        //LER O VETOR
        for (int i=0; i<vect.length; i++) {
            System.out.print("Digite o elemento "+(i+1)+": ");
            vect[i] = sc.nextInt();
        }
        
        //ORDENAR O VETOR
        for (int j = 0; j < vect.length; j++) {
            for (int k = 0; k < vect.length; k++) {
                if (vect[j] < vect[k]) {
                    int aux = vect[j];
                    vect[j] = vect[k];
                    vect[k] = aux;
                }
            }
        }
        
        System.out.println("Vetor ordenado: ");
        System.out.print("{ ");
        
        for (int i=0; i<vect.length; i++) {
            if (i==vect.length-1) System.out.println(vect[i]+" }");
            else System.out.print(vect[i]+", ");
        }
        
    }

}
