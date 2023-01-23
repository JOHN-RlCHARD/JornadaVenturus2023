package atividade1;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String cnpj, String nome) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public String getNome() {
        return "Nome: "+nome+"\nCnpj: "+getCnpj();
    }
    
}
