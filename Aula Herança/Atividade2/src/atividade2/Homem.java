package atividade2;

public class Homem extends Animal {
    
    private boolean fome;
    
    public Homem(String nome, int idade) {
        super(nome, idade);
        setFome(false);
    }
    
    @Override
    public void falar() {
        System.out.println("Oi");
    }
    
    public void comer() {
        if (isFome()) {
            System.out.println("Pizza foi dada ao Homem.");
            setFome(false);
        } else {
            System.out.println("O Homem não está com fome.");
        }
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

    public boolean isFome() {
        return fome;
    }
    
}
