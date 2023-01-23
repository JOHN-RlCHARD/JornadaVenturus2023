package atividade2;

public abstract class Animal {

    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }
    
    public abstract void falar();

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    
    
    
}
