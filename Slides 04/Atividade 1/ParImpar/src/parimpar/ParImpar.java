package parimpar;
import java.util.*;

public class ParImpar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Digite um numero inteiro: ");
        num = sc.nextInt();
        
        if (num % 2 == 0) System.out.println("O número é par!");
        else System.out.println("O número é impar!");

    }

}
