package quadradocubo;
import java.util.*;

public class QuadradoCubo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x=0;
        
        while (x<=0) {
            System.out.println("Digite um numero inteiro positivo: ");
            x = sc.nextInt();
        }
        System.out.println("x, x², x³;");
        for (int i=1; i<=x; i++) {
            System.out.println(i+", "+(i*i)+", "+(i*i*i)+";");
        }
        
    }

}
