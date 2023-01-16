package produtos;
import java.util.*;

public class Produtos {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double preco = -1.0;
        String situacao = "", classificacao = "";
        int categoria = 0;
        
        //LEITURA DOS DADOS COM VALIDAÇÃO
        while ( preco <= 0.0) {
            System.out.println("\nDigite o preço do produto: ");
            preco = sc.nextDouble();
            if (preco <= 0.0) System.out.println("Valor Inválido");
        }
        while ( categoria < 1 || categoria > 3 ) {
            System.out.println("\nDigite a categoria do produto: \n"
                    + "[1] Limpeza\n"
                    + "[2] Alimentação\n"
                    + "[3] Vestuário");
            categoria = sc.nextInt();
            if ( categoria < 1 || categoria > 3 ) System.out.println("Opção inválida.");
        }
        while ( !situacao.equalsIgnoreCase("R") && !situacao.equalsIgnoreCase("N") ) {
            System.out.println("\nDigite a situação do produto: \n"
                    + "[R] Necessita de refrigeração\n"
                    + "[N] Não necessita de refrigeração");
            situacao = sc.next().toUpperCase();
            if ( !situacao.equalsIgnoreCase("R") && !situacao.equalsIgnoreCase("N") ) System.out.println("Opção inválida.");
        }
        
        //CALCULO PREÇO COM AUMENTO
        if (preco <= 25.0) {
            switch (categoria) {
                case 1:
                    preco = preco*1.05;
                    break;
                case 2:
                    preco = preco*1.08;
                    break;
                case 3:
                    preco = preco*1.10;
                    break;
            }
        } else {
            switch (categoria) {
                case 1:
                    preco = preco*1.12;
                    break;
                case 2:
                    preco = preco*1.15;
                    break;
                case 3:
                    preco = preco*1.18;
                    break;
            }
        }
        
        System.out.format("\nPreço com aumento: R$ %.2f\n", preco);
        
        //CALCULO PREÇO COM DESCONTO
        if ( categoria == 2 || situacao.equals("R")) preco = preco*0.95;
        else preco = preco*0.92;
        
        System.out.format("\nPreço com desconto: R$ %.2f\n", preco);
        
        //CLASSIFICAÇÃO
        if (preco <= 50.0) classificacao = "Barato";
        else if (preco < 120.0) classificacao = "Normal";
        else classificacao = "Caro";
        
        System.out.format("\nPreço Final: R$ %.2f\n", preco);
        System.out.println("Classificação: "+classificacao);
        
    }

}
