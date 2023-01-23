package atividade3;

public class Lobo extends Mamifero {

    public Lobo(String corPelo, double peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuuuuuuuuu..");
    }
    
}
