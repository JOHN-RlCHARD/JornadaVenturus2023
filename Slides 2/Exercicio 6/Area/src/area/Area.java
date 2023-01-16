package area;
import java.util.*;

public class Area {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        
        System.out.println("Digite o valor de A, B e C, respecitvamente:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        areaTriangulo = (a*c)/2;
        areaCirculo = c*c*3.14159;
        areaTrapezio = c*(a+b)/2;
        areaQuadrado = b*b;
        areaRetangulo = a*b;
        
        System.out.format("Triangulo: %.3f\n", areaTriangulo);
        System.out.format("Circulo: %.3f\n", areaCirculo);
        System.out.format("Trapezio: %.3f\n", areaTrapezio);
        System.out.format("Quadrado: %.3f\n", areaQuadrado);
        System.out.format("Retangulo: %.3f\n", areaRetangulo);
        
    }
    
}
