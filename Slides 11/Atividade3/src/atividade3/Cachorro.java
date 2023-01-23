package atividade3;

public class Cachorro extends Lobo {

    public Cachorro(String corPelo, double peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Au Au Au Au...");
    }
    
    public void reagir(String frase) {
        if (frase.equalsIgnoreCase("Agradavel")) System.out.println("Abanando e latindo...");
        else if (frase.equalsIgnoreCase("Agressiva")) System.out.println("Rosnando Grrr...");
    }
    
    public void reagir(int hora) {
        if (hora>=0 && hora<12) System.out.println("Abanando...");
        else if (hora>=12 && hora<18) System.out.println("Abanando e latindo...");
        else if (hora>=18 && hora<=24) System.out.println("Ignorado.");
    }
    
    public void reagir(boolean dono) {
        if (dono) System.out.println("Abanar");
        else System.out.println("Rosnando e latindo Grrrrr...");
    }
    
    public void reagir() {
        if (getIdade()<5 && getPeso() <10) System.out.println("Abanando...");
        else if (getIdade()<5 && getPeso()>=10) System.out.println("Latindo...");
        else if (getIdade()>=5 && getPeso()<10) System.out.println("Rosnando Grrr...");
        else if (getIdade()>=5 && getPeso()>=10) System.out.println("Ignorado.");
    }
    
    public void enterrarOsso() {
        System.out.println("Enterrando osso...");
    }
    
    public void abanarRabo() {
        System.out.println("Abanando o Rabo...");
    }
    
}
