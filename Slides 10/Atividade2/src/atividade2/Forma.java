package atividade2;

public abstract class Forma {
    
    private Cor cor;

    public Forma(Cor cor) {
        setCor(cor);
    }
    
    public abstract void area();

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
    
}
