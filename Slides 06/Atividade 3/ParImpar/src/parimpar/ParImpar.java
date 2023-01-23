package parimpar;
import java.util.*;

public class ParImpar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Digite um numero: ");
        n = sc.nextInt();
        
        System.out.println(n+" é "+parImpar(n));
        
    }
    
    private static String parImpar(int num) {
        return (num%2==0) ? "Par" : "Impar";
    }

}
