package atividade2;
import java.util.*;

public class Atividade2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();
        int qtdProdutos = -1;
        
        while (qtdProdutos <= 0) {
            System.out.println("Digite quantos produtos deseja inserir: ");
            qtdProdutos = sc.nextInt();
        }
        
        //INSERÇAO DOS DADOS
        for (int i=0; i<qtdProdutos; i++) {
            String nome;
            double preco;
            int tipo = -1;
            System.out.println("\n*** Produto "+(i+1)+" ***");
            System.out.print("Nome: "); nome = sc.next();
            System.out.print("Preco: "); preco = sc.nextDouble();
            while (tipo<1 || tipo>3) {
                System.out.println("Digite o tipo do produto: "
                        + "\n[1] Importado"
                        + "\n[2] Usado"
                        + "\n[3] Nenhum dos anteriores");
                tipo = sc.nextInt();
            }
            switch (tipo) {
                case 1:
                    System.out.print("Taxa da Alfangeda: R$");
                    double taxa = sc.nextDouble();
                    list.add(new ProdutoImportado(taxa, nome, preco));
                    break;
                case 2:
                    System.out.print("Data de Fabricacao: ");
                    String dataF = sc.next();
                    list.add(new ProdutoUsado(dataF, nome, preco));
                    break;
                case 3:
                    list.add(new Produto(nome, preco));
                    break;
            }
            
        }
        
        //IMPRESSAO DOS DADOS
        for (int i=0; i<qtdProdutos; i++) {
            System.out.println(list.get(i).etiquetaPreco());
        }
        
    }

}
