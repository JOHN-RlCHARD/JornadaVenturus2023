package atividade2;

public class Cao extends Animal {
    
    private boolean fome;
    
    public Cao(String nome, int idade) {
        super(nome, idade);
        setFome(false);
    }
    
    @Override
    public void falar() {
        System.out.println("Au au");
    }
    
    public void comer() {
        if (isFome()) {
            System.out.println("Carne foi dada ao Cachorro.");
            setFome(false);
        } else {
            System.out.println("O Cachorro não está com fome.");
        }
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

    public boolean isFome() {
        return fome;
    }
}
