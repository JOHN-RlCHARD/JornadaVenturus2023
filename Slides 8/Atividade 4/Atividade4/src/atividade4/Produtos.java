package atividade4;

public class Produtos {

    protected int cod;
    protected double preco;
    protected String nome;
    
    public Produtos(int cod) throws Exception {
        switch (cod) {
            default:
                throw new Exception("Código inválido");
            case 1:
                this.cod = 1;
                this.nome = "Cachorro-Quente";
                this.preco = 7.00;
                break;
            case 2:
                this.cod = 2;
                this.nome = "X-Salada";
                this.preco = 9.00;
                break;
            case 3:
                this.cod = 3;
                this.nome = "X-Bacon";
                this.preco = 11.00;
                break;
            case 4:
                this.cod = 4;
                this.nome = "Torrada";
                this.preco = 5.00;
                break;
            case 5:
                this.cod = 5;
                this.nome = "Refrigerante";
                this.preco = 4.00;
                break;
        }
    }
    
    public void calcValor(int qtd) {
        
        System.out.format(this.nome+" R$ %.2f\n",this.preco);
        System.out.println("Quantidade: "+qtd);
        System.out.format("Valor a pagar: R$ %.2f\n",this.preco*qtd);
        
    }
    
}
