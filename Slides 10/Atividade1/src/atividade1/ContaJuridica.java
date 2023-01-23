package atividade1;

public class ContaJuridica extends Conta {
    
    private double limiteEmprestimo;

    public ContaJuridica(double limiteEmprestimo, String numeroConta, String proprietario, double balanco) {
        super(numeroConta, proprietario, balanco);
        setLimiteEmprestimo(limiteEmprestimo);
    }

    public void emprestimo(double valor) {
        if (valor<=limiteEmprestimo) {
            System.out.println("Empréstimo realizado com sucesso.");
            setBalanco(getBalanco()+valor);
            System.out.format("Novo Saldo = R$ %.2f\n", getBalanco());
            setLimiteEmprestimo(getLimiteEmprestimo()-valor);
        } else {
            System.out.println("Não foi possível realizar o empréstimo.");
            System.out.println("Valor maior que o limite de empréstimo atual.");
        }
    }
    
    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
}
