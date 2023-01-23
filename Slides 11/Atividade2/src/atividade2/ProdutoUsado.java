package atividade2;

public class ProdutoUsado extends Produto {

    private String dataFabricacao;

    public ProdutoUsado(String dataFabricacao, String nome, double preco) {
        super(nome, preco);
        setDataFabricacao(dataFabricacao);
    }

    @Override
    public String etiquetaPreco() {
        return getNome()+String.format(" (usado) R$ %.2f", getPreco())+
                " (Data de Fabricacao: "+getDataFabricacao()+")";
    }
    
    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
    
    
}
