package atividade1;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String getNome() {
        return "Nome: "+nome+"\nCpf: "+getCpf();
    }
    
}
