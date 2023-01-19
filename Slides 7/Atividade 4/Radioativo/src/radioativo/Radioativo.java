package radioativo;
import java.util.*;

public class Radioativo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double massa;
        
        System.out.println("Digite a massa inicial: ");
        massa = sc.nextDouble();
        
        try {
            MaterialRadioativo material = new MaterialRadioativo(massa);
            material.reduzir();
            material.printTempo();
        } catch (Exception e) {System.out.println(e);}
        
    }

}
