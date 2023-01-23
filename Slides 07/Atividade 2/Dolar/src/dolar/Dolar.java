package dolar;
import java.util.*;

public class Dolar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double qtdDolar, cotacao, valorFinal=-1;
        
        System.out.print("Cotaçao do dólar: R$ "); cotacao = sc.nextDouble();
        System.out.print("Valor em dólar a ser comprado: U$"); qtdDolar = sc.nextDouble();
        
        try {
            valorFinal = Conversao.converter(cotacao, qtdDolar);
        } catch (Exception e) {System.out.println(e);}

        if (valorFinal!=-1) System.out.format("Valor a ser pago: R$ %.2f\n", valorFinal);
        
    }

}
