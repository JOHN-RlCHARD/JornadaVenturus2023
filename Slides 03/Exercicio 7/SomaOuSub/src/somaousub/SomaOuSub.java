package somaousub;
import java.util.*;

public class SomaOuSub {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double n1, n2, res;
        
        System.out.println("Digite dois números");
        System.out.print("numero 1: "); n1 = sc.nextDouble();
        System.out.print("numero 2: "); n2 = sc.nextDouble();
        
        res = (n1 > n2)
                ? n1+n2
                : n1-n2;
        
        System.out.println(res);
        
    }

}
