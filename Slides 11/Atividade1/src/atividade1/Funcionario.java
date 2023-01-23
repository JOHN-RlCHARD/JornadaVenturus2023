package atividade1;

public class Funcionario {

    protected String nome;
    protected int horas;
    protected double valorPorHora;

    public Funcionario(String nome, int horas, double valorPorHora) {
        setNome(nome);
        setHoras(horas);
        setValorPorHora(valorPorHora);
    }
    
    public double pagamento() {
        return (double)getHoras()*getValorPorHora();
    }
    
    @Override
    public String toString() {
        String pagamentoStr = String.format("%.2f", pagamento());
        return "\nNome: "+getNome()+"\nPagamento: R$ "+pagamentoStr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    
    
    
}
