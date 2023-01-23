package operadordiv;
import java.util.*;

public class OperadorDiv {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double y;
        
        System.out.println("Digite o valor de y: ");
        y = sc.nextDouble();
        
        y /= (double)3;
        
        System.out.format("y = %.2f\n", y);

    }
    
}
