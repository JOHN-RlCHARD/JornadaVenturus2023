package atividade1;

public class Conta implements ControleConta {

    private final String numeroConta;
    private String  proprietario;
    double balanco;
    
    public Conta (String numeroConta, String proprietario, double depositoInicial) {
        this.numeroConta = numeroConta;
        setProprietario(proprietario);
        setBalanco(depositoInicial);
        System.out.println("\nConta Criada com sucesso.");
        dadosConta();
    }

    public void depositar(double valor) {
        setBalanco(getBalanco()+valor);
        System.out.format("\nDepósito no valor de R$ %.2f efetuado.\n", valor);
        dadosConta();
    }
    
    public void sacar(double valor) {
        setBalanco(getBalanco()-valor-5.00);
        System.out.format("\nSaque no valor de R$ %.2f com taxa de R$ 5,00 efetuado.\n", valor);
        dadosConta();
    }
    
    public void dadosConta() {
        System.out.println("Numero da Conta: "+getNumeroConta());
        System.out.println("Titular: "+getProprietario());
        System.out.format("Saldo: R$ %.2f\n", getBalanco());
    }
    
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    private void setBalanco(double balanco) {
        this.balanco = balanco;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getProprietario() {
        return proprietario;
    }

    public double getBalanco() {
        return balanco;
    }
    
    
    
}
