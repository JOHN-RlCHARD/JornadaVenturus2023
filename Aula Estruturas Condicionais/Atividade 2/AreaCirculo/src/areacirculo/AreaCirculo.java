package areacirculo;
import java.util.*;

public class AreaCirculo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double raio, area;
        
        System.out.println("Digite o valor do raio:");
        raio = sc.nextDouble();
        
        if (raio>0) { 
            area = raio*raio*Math.PI;
            System.out.format("A área do círculo é %.2f\n", area);
        }
        else System.out.println("Raio negativo inválido!");
        
    }

}
