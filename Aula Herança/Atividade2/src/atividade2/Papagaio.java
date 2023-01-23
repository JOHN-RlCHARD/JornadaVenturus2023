package atividade2;

public class Papagaio extends Animal {

    private boolean fome;
    
    public Papagaio(String nome, int idade) {
        super(nome, idade);
        setFome(false);
    }
    
    @Override
    public void falar() {
        System.out.println("Qué Café");
    }
    
    public void comer() {
        if (isFome()) {
            System.out.println("Sementes foram dadas ao Papagaio.");
            setFome(false);
        } else {
            System.out.println("O Papagaio não está com fome.");
        }
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

    public boolean isFome() {
        return fome;
    }
    
}
