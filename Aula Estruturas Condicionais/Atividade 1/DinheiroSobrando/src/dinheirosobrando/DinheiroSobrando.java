package dinheirosobrando;
import java.util.*;

public class DinheiroSobrando {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double sobra;
        
        System.out.println("Digite a quantidade de dinheiro, em reais, que esta sobrando:");
        sobra = sc.nextDouble();
        
        if (sobra >= 30) System.out.println("Vá ao cinema!");
        else System.out.println("Fiquei em casa vendo TV!");
        
    }

}
