package atividade1;

public class Gerente extends Funcionario {

    private int senha;
    
    public Gerente(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }
    
    public boolean autentica(int senha) {
        return (senha == this.senha) ? true : false;
    }
    
}
