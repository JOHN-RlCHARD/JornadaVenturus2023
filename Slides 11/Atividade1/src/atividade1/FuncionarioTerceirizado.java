package atividade1;

public class FuncionarioTerceirizado extends Funcionario {

    private double despesaAdicional;
    
    public FuncionarioTerceirizado(String nome, int horas, double valorPorHora, double despesaAdicional) {
        super(nome, horas, valorPorHora);
        setDespesaAdicional(despesaAdicional);
    }
    
    @Override
    public double pagamento() {
        return ((double)getHoras()*getValorPorHora())+(1.1*getDespesaAdicional());
    }

    public double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }
    
}
