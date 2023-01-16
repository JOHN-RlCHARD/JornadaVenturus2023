package quadrante;
import java.util.*;

public class Quadrante {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double x, y;
        String msg;
        
        System.out.println("Digite a coordenada x: ");
        x = sc.nextDouble();
        System.out.println("Digite a coordenada y: ");
        y = sc.nextDouble();
        
        if (x == 0 && y == 0) msg = "na Origem";
        else if ( x == 0 ) msg = "no Eixo X";
        else if ( y == 0 ) msg = "no Eixo Y";
        else if ( x>0 && y>0 ) msg = "no Primeiro Quadrante";
        else if ( x>0 ) msg = "no Quarto Quadrante";
        else if ( y > 0 ) msg = "no Segundo Quadrante";
        else msg = "no Terceiro Quadrante";
        
        System.out.println("O ponto está "+msg);
        
    }

}
