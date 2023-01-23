package valorapagar;
import java.util.*;

public class ValorAPagar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] items = new double[2][3];
        double valorTotal = (double) 0;
        
        for (int i=0; i<2; i++) {
            System.out.println("Digite o código, número de peças e "
                    + "valor unitário da peça "+(i+1)+", respectivamente");
            int cod = sc.nextInt();
            int num = sc.nextInt();
            double price = sc.nextDouble();
            
            items[i][0] = (double)cod;
            items[i][1] = (double)num;
            items[i][2] = price;
            
            valorTotal += num*price; 
            
        }
        
        System.out.println("");
        System.out.format("Valor a Pagar: R$ %.2f\n", valorTotal);

    }
    
}
