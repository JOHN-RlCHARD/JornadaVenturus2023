package atividade1;

public class ContaBanco {

    public String numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public ContaBanco () {
        setStatus(false);
        setSaldo(0);
    }
    
    public void abrirConta( String dono, String tipo, String numConta ) {
        
        if (tipo.equalsIgnoreCase("CC")) {
            setSaldo(50.0);
            setTipo("CC");
        }
        else if (tipo.equalsIgnoreCase("CP")) {
            setSaldo(150.0);
            setTipo("CP");
        }
        else System.out.println("Tipo de conta inválido.");
            
        setNumConta(numConta);
        
        setDono(dono);
        
        setStatus(true);
        
    }
    
    public void fecharConta() {
        if (this.status == false) System.out.println("A conta já está fechada.");
        else {
            if (this.saldo == 0) this.status = false;
            else if (this.saldo<0) System.out.println("Conta está em dívida, não pode ser fechada.");
            else System.out.println("Conta possui dinheiro, não pode ser fechada.");
        }
    }
    
    public void depositar(double valor) {
        if (this.status == true) this.saldo += valor;
        else System.out.println("Conta fechada, não é possível depositar.");
    }
    
    public void sacar(double valor) {
        if ((this.saldo-valor)<0) System.out.println("Não há saldo suficiente.");
        else this.saldo -= valor;
    }
    
    public void pegarMensal() {
        if (this.tipo.equalsIgnoreCase("CC")) this.saldo -= 12.0;
        else this.saldo -= 20;
    }
    
    public void printConta() {
        System.out.println("\nNúmero da Conta: "+getNumConta());
        System.out.println("Titular: "+getDono());
        System.out.println("Tipo: "+getTipo());
        System.out.format("Saldo: R$ %.2f\n", getSaldo());
        if (status == true) System.out.println("Status: Aberta");
        else System.out.println("Status: Fechada");
    }
    
    public String getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
