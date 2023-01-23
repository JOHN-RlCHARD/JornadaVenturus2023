package atividade3;

public class Mamifero extends Animal {

    protected String corPelo;

    public Mamifero(String corPelo, double peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
    
    public void alimentar() {
        System.out.println("Carne foi dada ao mamifero");
    }
    
    public void locomover() {
        System.out.println("Em movimento...");
    }
    
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
