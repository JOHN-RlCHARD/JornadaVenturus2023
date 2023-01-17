package somavetor;
import java.util.*;

public class SomaVetor {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[4];
        int num = 10;
                
        for (int i=0; i<vet.length; i++) {
            System.out.print("Elemento "+(i+1)+": ");
            num += sc.nextInt();
            vet[i] = num;
        }
        
        for (int i=0; i<vet.length; i++) {
            System.out.println("Elemento "+(i+1)+": "+vet[i]);
        }
        
    }

}
