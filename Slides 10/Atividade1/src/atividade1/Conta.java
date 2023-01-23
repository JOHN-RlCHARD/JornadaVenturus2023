package atividade1;

public class Conta {

    private String numeroConta, proprietario;
    private double balanco;

    public Conta(String numeroConta, String proprietario, double balanco) {
        setNumeroConta(numeroConta);
        setProprietario(proprietario);
        setBalanco(balanco);
    }
    
    public void deposito(double valor) {
        setBalanco(getBalanco()+valor);
        System.out.println("Depósito realizado com sucesso.");
        System.out.format("Novo Saldo = R$ %.2f\n", getBalanco());
    }
    
    public void saque(double valor) {
        if (getBalanco()-valor < 0) System.out.println("Saldo insuficiente.");
        else {
            System.out.println("Saque realizado com sucesso.");
            setBalanco(getBalanco()-valor);
            System.out.format("Novo Saldo = R$ %.2f\n", getBalanco());
        }
    }

    private void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    private void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void setBalanco(double balanco) {
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
