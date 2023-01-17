package fatorial;
import java.util.*;

public class Fatorial {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num, fat = 1,  aux;
        String nums = "";
        
        System.out.println("Digite o número a ser calculado o fatorial: ");
        num = sc.nextInt();
        aux = num;
        nums += num;
        do {
            fat *= aux;
            aux--;
            if (aux !=  0)nums += " x "+aux;
        } while (aux != 0);
        
        System.out.println(num+"! = "+ nums + " = " + fat);
        
    }

}
