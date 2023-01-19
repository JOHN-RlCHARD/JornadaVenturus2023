package atividaderetangulo;
import java.util.*;

public class AtividadeRetangulo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double largura, altura;
        Retangulo r = null;
        
        System.out.println("Digite a altura do Retangulo: ");
        altura = sc.nextDouble();
        System.out.println("Digite a largura do Retangulo: ");
        largura = sc.nextDouble();
        
        try {
            r = new Retangulo(largura, altura);
        } catch (Exception e) {System.out.println(e);}
        
        if (r != null) {
            System.out.format("Area: %.2f\n", r.area());
            System.out.format("Perimetro: %.2f\n", r.perimetro());
            System.out.format("Diagonal: %.2f\n", r.diagonal());
        }
        
    }

}
