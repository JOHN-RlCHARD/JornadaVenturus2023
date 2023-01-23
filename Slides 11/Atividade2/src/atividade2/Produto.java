package atividade2;

public class Produto {

    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        setNome(nome);
        setPreco(preco);
    }
    
    public String etiquetaPreco() {
        return getNome()+" "+String.format("R$ %.2f", getPreco());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
}
