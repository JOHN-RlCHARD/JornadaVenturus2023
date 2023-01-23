package triangulos;
import java.util.*;

public class Triangulos {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double ladoA, ladoB, ladoC, area;
        Triangulo t1 = null;
        
        System.out.println("Digite os lados do Triangulo");
        System.out.print("Lado A: "); ladoA = sc.nextDouble();
        System.out.print("Lado B: "); ladoB = sc.nextDouble();
        System.out.print("Lado C: "); ladoC = sc.nextDouble();
        
        try {
            t1 = new Triangulo(ladoA, ladoB, ladoC);
        } catch(Exception e) { System.out.println(e);}

        if (t1!= null) System.out.format("Área do Triangulo: %.2f\n", t1.area());
        
    }

}
