package atividade2;

public class ProdutoImportado extends Produto {
    
    private double taxaAlfandega;

    public ProdutoImportado(double taxaAlfandega, String nome, double preco) {
        super(nome, preco);
        setTaxaAlfandega(taxaAlfandega);
    }
    
    public double precoTotal() {
        return getPreco()+getTaxaAlfandega();
    }
    
    @Override
    public String etiquetaPreco() {
        return getNome()+" "+String.format("R$ %.2f", precoTotal())+
                String.format(" (Taxa Alfandega: R$ %.2f)", getTaxaAlfandega());
    }

    public double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }
    
    
    
}
